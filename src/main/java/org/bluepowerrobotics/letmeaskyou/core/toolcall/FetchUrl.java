package org.bluepowerrobotics.letmeaskyou.core.toolcall;

import org.htmlunit.WebClient;
import org.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.bluepowerrobotics.letmeaskyou.core.web.WebFetcher.createWebClient;

public class FetchUrl implements Tool{
    @Override
    public String getName() {
        return "FetchUrl";
    }

    @Override
    public String getDescription() {
        return "获取指定 URL 经过 JavaScript 渲染后的完整 HTML 内容。"
                + "参数：url (string, 必需)；waitMs (int,JS 异步等待毫秒数，0表示禁用 JS)。";
    }

    @Override
    public List<Map.Entry<String, String>> getParametersTypeAndName() {
        List<Map.Entry<String, String>> params = new ArrayList<>();
        // 顺序：url 在前，waitMs 在后
        params.add(new AbstractMap.SimpleEntry<>("string", "url"));
        params.add(new AbstractMap.SimpleEntry<>("int", "JSWaitMs"));
        return params;
    }

    @Override
    public List<Map.Entry<String, String>> getResult(List<String> input) {
        // 输入校验
        if (input == null || input.isEmpty()) {
            return errorResult("缺少必需参数: url");
        }
        String url = input.get(0);
        if (url == null || url.isBlank()) {
            return errorResult("url 不能为空");
        }

        // 解析 waitMs，默认为 0
        int waitMs = 0;
        if (input.size() >= 2 && input.get(1) != null && !input.get(1).isBlank()) {
            try {
                waitMs = Integer.parseInt(input.get(1));
            } catch (NumberFormatException e) {
                return errorResult("waitMs 必须是整数: " + input.get(1));
            }
        }

        // 根据 waitMs 决定是否启用 JS
        boolean enableJs = waitMs > 0;
        String html;
        try (WebClient webClient = createWebClient(enableJs)) {
            // 请求页面（同步 JS 会自动执行）
            HtmlPage page = webClient.getPage(url);

            // 如果启用了 JS，额外等待异步任务
            if (enableJs) {
                webClient.waitForBackgroundJavaScript(waitMs);
            }

            // 获取最终渲染后的 HTML
            html = page.asXml();
        } catch (IOException e) {
            return errorResult("请求失败: " + e.getMessage());
        }

        // 返回成功结果，键为 "html"
        return List.of(new AbstractMap.SimpleEntry<>("html", html));
    }

    /**
     * 构造错误返回结果。
     *
     * @param errorMsg 错误描述
     * @return 包含一个键 "error" 的 List
     */
    private List<Map.Entry<String, String>> errorResult(String errorMsg) {
        return List.of(new AbstractMap.SimpleEntry<>("error", errorMsg));
    }
}

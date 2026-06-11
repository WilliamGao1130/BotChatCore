package org.bluepowerrobotics.botchatcore.toolcall;

import java.util.List;
import java.util.Map;

public class FetchUrl implements Tool{
    @Override
    public String getName() {
        return "FetchUrl";
    }

    @Override
    public String getDescription() {
        return "get the html string of given url";
    }

    @Override
    public List<Map.Entry<String, String>> getParametersTypeAndName() {
        return List.of();
    }

    @Override
    public List<Map.Entry<String, String>> getResult(List<String> input) {
        return List.of();
    }
}

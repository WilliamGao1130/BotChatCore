package org.bluepowerrobotics.botchatcore.conversation;

import org.bluepowerrobotics.botchatcore.conversation.contents.Content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Message {
    public enum Role { SYSTEM, USER, MODEL };
    private String id;                    // UUID
    private String parentId;              // 父节点ID（null = 根）
    private String conversationId;        // 所属对话ID
    private List<String> childrenIds;     // 子节点ID列表
    private Role role;                    // SYSTEM / USER / MODEL
    private List<Content> contents; // 内容列表（附件：如TextFile, PictureFile等，对话内容：如Thinking，RichText等）
    private String modelId;               // 生成此消息的模型（仅MODEL角色）
    private long timestamp;
    private boolean isActive;             // 当前活跃分支标记
    private boolean isFinished;           // 是否完全生成（仅在无子节点时生效）
    // ... getters/setters

    public List<Map<String, Object>> getContents() {
        List<Map<String,Object>> contents = new ArrayList<>();
        for(Content content : this.contents){
            Map<String, Object> map = new HashMap<>(1);
            map.put(content.getKind(),content.get());
            contents.add(map);
        }
        return contents;
    }
}

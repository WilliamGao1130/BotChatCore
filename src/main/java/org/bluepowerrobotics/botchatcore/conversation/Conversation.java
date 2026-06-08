package org.bluepowerrobotics.botchatcore.conversation;

import java.util.Map;

public class Conversation {
    private String id;
    private String title;
    private Map<String, Message> messages;  // id -> Message 的扁平Map
    private String rootMessageId;           // 根节点（system prompt）
    private String currentLeafId;           // 当前对话位置（用于UI显示）
    private long createdAt;
    private long updatedAt;
    private String modelId;                 // 默认模型
    private Map<String, Object> metadata;

}

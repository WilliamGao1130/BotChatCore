package org.bluepowerrobotics.botchatcore.storage;

import org.bluepowerrobotics.botchatcore.conversation.Conversation;
import org.bluepowerrobotics.botchatcore.conversation.Message;

import java.util.List;
import java.util.Optional;

/**
 * 对话记录持久化接口。
 * 负责 Conversation 和 Message 的 CRUD 以及树结构相关的原子操作。
 */
public interface ConversationsStorage {
    Conversation getConversation(String conversationId);
    boolean ifConversationExists(String conversationId);
    boolean saveConversation(Conversation conversation);
    List<Conversation> listConversations();
    List<String> listConversationsName();

}

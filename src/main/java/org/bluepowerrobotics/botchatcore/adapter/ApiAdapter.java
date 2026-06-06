package org.bluepowerrobotics.botchatcore.adapter;

import org.bluepowerrobotics.botchatcore.config.ModelConfig;
import org.bluepowerrobotics.botchatcore.conversation.Conversation;
import org.bluepowerrobotics.botchatcore.conversation.Message;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ApiAdapter {
    String getProviderName();
    CompletableFuture<Message> sendMessage(Conversation conversation, ModelConfig modelConfig);
}

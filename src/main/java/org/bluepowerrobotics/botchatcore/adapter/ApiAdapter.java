package org.bluepowerrobotics.botchatcore.adapter;

import org.bluepowerrobotics.botchatcore.config.ModelConfig;
import org.bluepowerrobotics.botchatcore.conversation.Conversation;
import org.bluepowerrobotics.botchatcore.conversation.Message;

import java.util.concurrent.CompletableFuture;

public interface ApiAdapter {
    String getProviderName();
    String getRequestBody(Conversation conversation, ModelConfig modelConfig);
    Message getResponse(String ResponseBody);
}

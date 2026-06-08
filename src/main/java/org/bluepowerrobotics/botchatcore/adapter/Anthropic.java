package org.bluepowerrobotics.botchatcore.adapter;

import org.bluepowerrobotics.botchatcore.config.ModelConfig;
import org.bluepowerrobotics.botchatcore.conversation.Conversation;
import org.bluepowerrobotics.botchatcore.conversation.Message;

public class Anthropic implements ApiAdapter{
    @Override
    public String getProviderName() {
        return "";
    }

    @Override
    public String getRequestBody(Conversation conversation, ModelConfig modelConfig) {
        return "";
    }

    @Override
    public Message getResponse(String ResponseBody) {
        return null;
    }
}

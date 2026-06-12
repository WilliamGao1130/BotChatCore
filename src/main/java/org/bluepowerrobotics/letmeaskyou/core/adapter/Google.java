package org.bluepowerrobotics.letmeaskyou.core.adapter;

import org.bluepowerrobotics.letmeaskyou.core.config.ModelConfig;
import org.bluepowerrobotics.letmeaskyou.core.conversation.Conversation;
import org.bluepowerrobotics.letmeaskyou.core.conversation.Message;

public class Google implements ApiAdapter{
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

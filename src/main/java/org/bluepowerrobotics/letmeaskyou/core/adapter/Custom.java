package org.bluepowerrobotics.letmeaskyou.core.adapter;

import org.bluepowerrobotics.letmeaskyou.core.config.ModelConfig;
import org.bluepowerrobotics.letmeaskyou.core.conversation.Conversation;
import org.bluepowerrobotics.letmeaskyou.core.conversation.Message;

public class Custom implements ApiAdapter {
    private String provider = "Custom";
    public Custom(String initialProvider) {
        provider = initialProvider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
    @Override
    public String getProviderName() {
        return provider;
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

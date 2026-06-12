package org.bluepowerrobotics.letmeaskyou.core.adapter;

import org.bluepowerrobotics.letmeaskyou.core.config.ModelConfig;
import org.bluepowerrobotics.letmeaskyou.core.conversation.Conversation;
import org.bluepowerrobotics.letmeaskyou.core.conversation.Message;

public interface ApiAdapter {
    String getProviderName();
    String getRequestBody(Conversation conversation, ModelConfig modelConfig);
    Message getResponse(String ResponseBody);
}

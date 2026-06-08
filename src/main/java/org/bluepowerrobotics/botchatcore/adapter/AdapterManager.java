package org.bluepowerrobotics.botchatcore.adapter;

import org.bluepowerrobotics.botchatcore.config.AdaptersConfig;
import org.bluepowerrobotics.botchatcore.config.ModelConfig;

import java.util.Objects;

public class AdapterManager {
    ApiAdapter getApiAdapter(ModelConfig modelConfig) {
        String modelProvider =  modelConfig.getProvider();
        if(Objects.equals(modelProvider, "OpenAI"))
            return new OpenAI();
        else if(Objects.equals(modelProvider, "Anthropic"))
            return new Anthropic();
        else if(Objects.equals(modelProvider, "Google"))
            return new Google();
        else
            if(AdaptersConfig.getInstance().exist(modelProvider)) return new Custom(modelProvider);
            else throw new RuntimeException("Provider not found");
    }
}

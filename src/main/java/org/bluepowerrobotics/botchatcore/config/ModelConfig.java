package org.bluepowerrobotics.botchatcore.config;

public class ModelConfig {
    private String apiKey;
    private String provider;//Anthropic, OpenAI, Google and others->Custom
    private String modelName;
    private String baseURL;
    private long   maxToken;
    private String showName;
}

package org.bluepowerrobotics.botchatcore.storage;

import org.bluepowerrobotics.botchatcore.config.ModelConfig;

import java.util.List;

public interface ModelsStorage {
    public List<ModelConfig> getModels();
    public ModelConfig get(String showName);
}

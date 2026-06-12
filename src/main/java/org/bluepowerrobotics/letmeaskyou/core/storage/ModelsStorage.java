package org.bluepowerrobotics.letmeaskyou.core.storage;

import org.bluepowerrobotics.letmeaskyou.core.config.ModelConfig;

import java.util.List;

public interface ModelsStorage {
    public List<ModelConfig> getModels();
    public ModelConfig get(String showName);
}

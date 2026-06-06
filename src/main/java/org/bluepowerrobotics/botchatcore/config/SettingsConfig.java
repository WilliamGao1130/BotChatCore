package org.bluepowerrobotics.botchatcore.config;

import java.util.List;

public class SettingsConfig {
    public enum Theme{Light,Dark,System}
    public String SystemPrompt;
    public Theme theme;
    public List<ModelConfig> modelConfigs;
}
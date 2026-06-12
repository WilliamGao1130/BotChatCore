package org.bluepowerrobotics.letmeaskyou.core.config;

import org.bluepowerrobotics.letmeaskyou.core.storage.ToolsStorage;
import org.bluepowerrobotics.letmeaskyou.core.toolcall.Tool;

import java.util.List;
import java.util.Map;

public class ToolsConfig {
    private Map<String,Tool> toolMap;
    private ToolsStorage toolsStorage;
    private static ToolsConfig instance;
    public ToolsConfig(ToolsStorage toolsStorage) {
        this.toolsStorage = toolsStorage;
    }

    public List<Tool> getTools() {
        return toolsStorage.getTools();
    }
    public Tool getTool(String toolName){
        return toolsStorage.getTool(toolName);
    };

    public static ToolsConfig getInstance() {
        return instance;
    }
    public static ToolsConfig setInstance(ToolsStorage toolsStorage) {
        instance = new ToolsConfig(toolsStorage);
        return instance;
    }
}

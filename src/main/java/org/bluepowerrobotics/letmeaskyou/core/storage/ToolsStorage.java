package org.bluepowerrobotics.letmeaskyou.core.storage;

import org.bluepowerrobotics.letmeaskyou.core.toolcall.Tool;

import java.util.List;

public interface ToolsStorage {
    public List<Tool> getTools();
    public Tool getTool(String toolName);
}

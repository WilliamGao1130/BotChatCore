package org.bluepowerrobotics.botchatcore.storage;

import org.bluepowerrobotics.botchatcore.toolcall.Tool;

import java.util.List;

public interface ToolsStorage {
    public List<Tool> getTools();
    public Tool getTool(String toolName);
}

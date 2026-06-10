package org.bluepowerrobotics.botchatcore.toolcall;

import java.util.List;
import java.util.Map;

public interface Tool {
    public String getName();
    public String getDescription();
    public List<Map.Entry<String,String>> getParametersTypeAndName();
    public List<Map.Entry<String,String>> getResult(List<String> input);
}

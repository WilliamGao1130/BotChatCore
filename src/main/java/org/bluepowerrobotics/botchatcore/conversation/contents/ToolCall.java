package org.bluepowerrobotics.botchatcore.conversation.contents;

public class ToolCall implements Content{
    @Override
    public String getKind() {
        return "";
    }

    @Override
    public String getStringContent() {
        return "";
    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public boolean overwrite(Object target) {
        return false;
    }

    @Override
    public boolean append(Object difference) {
        return false;
    }

}

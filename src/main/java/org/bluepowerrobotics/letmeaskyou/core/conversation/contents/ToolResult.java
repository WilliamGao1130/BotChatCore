package org.bluepowerrobotics.letmeaskyou.core.conversation.contents;

public class ToolResult implements Content{

    @Override
    public String getKind() {
        return "ToolCall";
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

    private boolean finished=false;
    @Override
    public void finish() {
        finished = true;
    }

    @Override
    public boolean ifFinished() {
        return finished;
    }

}

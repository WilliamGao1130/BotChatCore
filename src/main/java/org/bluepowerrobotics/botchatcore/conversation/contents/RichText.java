package org.bluepowerrobotics.botchatcore.conversation.contents;

public class RichText implements Content {
    private final StringBuffer content = new StringBuffer();

    public RichText(String content){
        this.content.append(content);
    }

    @Override
    public String getKind() {
        return "RichText";
    }

    @Override
    public String getStringContent() {
        return content.toString();
    }

    @Override
    public Object get() {
        return content.toString();
    }

    @Override
    public boolean overwrite(Object target) {
        if(target instanceof String){
            content.setLength(0);
            content.append(target);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean append(Object difference) {
        if(difference instanceof String){
            content.append(difference);
            return true;
        }else {
            return false;
        }
    }
}

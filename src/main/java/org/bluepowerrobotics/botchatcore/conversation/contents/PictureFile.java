package org.bluepowerrobotics.botchatcore.conversation.contents;

public class PictureFile implements Content {
    private final StringBuffer pictureBase64 = new StringBuffer();
    private boolean finished = false;

    public PictureFile(String base64){
        pictureBase64.append(base64);
    }
    @Override
    public String getKind() {
        return "PictureFile";
    }

    @Override
    public String getStringContent() {
        return pictureBase64.toString();
    }

    @Override
    public Object get() {
        return pictureBase64.toString();
    }

    @Override
    public boolean overwrite(Object target) {
        if(target instanceof String){
            pictureBase64.setLength(0);
            pictureBase64.append(target);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean append(Object difference) {
        if(difference instanceof String){
            pictureBase64.append(difference);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void finish() {
        finished = true;
    }

    @Override
    public boolean ifFinished() {
        return finished;
    }
}

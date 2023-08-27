package main.another;

public class PublicClassAccess {
    private String text;

    public PublicClassAccess(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

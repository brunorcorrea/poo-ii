package main.another;

class PackageClassAccess {
    private String text;

    public PackageClassAccess(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

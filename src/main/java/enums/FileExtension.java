package main.java.enums;


public enum FileExtension {
    XML("xml");

    private String extension;

    FileExtension(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}

package main.java.dto;


public class DirectoryFileCountDTO {
    private String directoryName;
    private Integer fileCount;

    public DirectoryFileCountDTO(String directoryName, Integer fileCount) {
        this.directoryName = directoryName;
        this.fileCount = fileCount;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public Integer getFileCount() {
        return fileCount;
    }
}

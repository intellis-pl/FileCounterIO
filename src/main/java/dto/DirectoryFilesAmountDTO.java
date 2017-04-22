package main.java.dto;


public class DirectoryFilesAmountDTO {
    private String directoryName;
    private Integer fileCount;

    public DirectoryFilesAmountDTO(String directoryName, Integer fileCount) {
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

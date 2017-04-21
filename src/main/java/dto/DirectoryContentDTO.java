package main.java.dto;

/**
 * Created by raval on 2017-04-21.
 */
public class DirectoryContentDTO {
    private String directoryName;
    private Integer fileCount;

    public DirectoryContentDTO(String directoryName, Integer fileCount) {
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

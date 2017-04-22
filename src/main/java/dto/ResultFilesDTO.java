package main.java.dto;

import java.util.List;

public class ResultFilesDTO {
    private Integer allFiles;
    private Integer currentDirFilesCount;
    private List<DirectoryFileCountDTO> resultFiles;

    public ResultFilesDTO(Integer allFiles, List<DirectoryFileCountDTO> resultFiles) {
        this.allFiles = allFiles;
        this.resultFiles = resultFiles;
    }

    public List<DirectoryFileCountDTO> getResultFiles() {
        return resultFiles;
    }

    public Integer getAllFiles() {
        return allFiles;
    }

    public void setAllFiles(Integer allFiles) {
        this.allFiles = allFiles;
    }

    public Integer getCurrentDirFilesCount() {
        return currentDirFilesCount;
    }

    public void setCurrentDirFilesCount(Integer currentDirFilesCount) {
        this.currentDirFilesCount = currentDirFilesCount;
    }

    public void addFilesNumberForCurrentDir(DirectoryFileCountDTO fileCount) {
        resultFiles.add(fileCount);
    }
}

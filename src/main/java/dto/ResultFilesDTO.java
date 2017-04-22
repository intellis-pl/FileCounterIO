package main.java.dto;

import java.util.List;

public class ResultFilesDTO {
    private Integer allFilesAmount;
    private Integer currentDirFilesAmount;
    private List<DirectoryFileCountDTO> filesAmountPerDirectoryBranch;

    public ResultFilesDTO(Integer allFilesAmount, List<DirectoryFileCountDTO> filesAmountPerDirectoryBranch) {
        this.allFilesAmount = allFilesAmount;
        this.filesAmountPerDirectoryBranch = filesAmountPerDirectoryBranch;
    }

    public List<DirectoryFileCountDTO> getFilesAmountPerDirectoryBranch() {
        return filesAmountPerDirectoryBranch;
    }

    public Integer getAllFilesAmount() {
        return allFilesAmount;
    }

    public void setAllFilesAmount(Integer allFilesAmount) {
        this.allFilesAmount = allFilesAmount;
    }

    public Integer getCurrentDirFilesAmount() {
        return currentDirFilesAmount;
    }

    public void setCurrentDirFilesAmount(Integer currentDirFilesAmount) {
        this.currentDirFilesAmount = currentDirFilesAmount;
    }

    public void addFilesAmountForCurrentDir(DirectoryFileCountDTO fileCount) {
        filesAmountPerDirectoryBranch.add(fileCount);
    }
}

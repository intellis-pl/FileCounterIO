package main.java.helpers;


import main.java.dto.ResultFilesDTO;

public final class ResultFilesHelper {

    public static ResultFilesDTO modifyResults(ResultFilesDTO resultFiles, Integer countDirFiles) {
        resultFiles.setAllFilesAmount(countDirFiles);
        resultFiles.setCurrentDirFilesAmount(countDirFiles);
        return resultFiles;
    }


    public static ResultFilesDTO resetCurrentDirFilesAmount(ResultFilesDTO resultFiles) {
        resultFiles.setCurrentDirFilesAmount(0);
        return resultFiles;
    }
}

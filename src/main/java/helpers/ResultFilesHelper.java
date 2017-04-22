package main.java.helpers;


import main.java.dto.ResultFilesDTO;

public class ResultFilesHelper {

    public static ResultFilesDTO modifyResults(ResultFilesDTO resultFiles, Integer countDirFiles) {
        resultFiles.setAllFiles(countDirFiles);
        resultFiles.setCurrentDirFilesCount(countDirFiles);
        return resultFiles;
    }


    public static ResultFilesDTO resetCurrentDirFiles(ResultFilesDTO resultFiles) {
        resultFiles.setCurrentDirFilesCount(0);
        return resultFiles;
    }
}

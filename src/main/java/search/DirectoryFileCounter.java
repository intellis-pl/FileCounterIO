package main.java.search;

import main.java.dto.DirectoryFilesAmountDTO;
import main.java.dto.ResultFilesDTO;

import java.io.File;
import java.util.ArrayList;

import static main.java.helpers.ResultFilesHelper.*;


public class DirectoryFileCounter {

    public ResultFilesDTO countFilesForDirectories(File dirContent) {
        ResultFilesDTO resultFiles = new ResultFilesDTO(0, new ArrayList<>());
        if(dirContent.isDirectory()) {
            if(dirContent.canRead()) {
                resultFiles = findAndCountDirFiles(dirContent, resultFiles);
            }
        }
        return resultFiles;
    }

    private ResultFilesDTO findAndCountDirFiles(File dirContent, ResultFilesDTO resultFiles) {
        Integer countSubDirFiles = 0;
        for(File file : dirContent.listFiles()) {
            resultFiles = findAndCountSubDirFiles(file, resultFiles);
            countSubDirFiles = countFilesForCurrentDir(file, countSubDirFiles);
            countSubDirFiles += resultFiles.getCurrentDirFilesAmount();
        }
        return modifyResults(resultFiles, countSubDirFiles);
    }

    private Integer countFilesForCurrentDir(File file, Integer countSubDirFiles) {
        if(file.isFile()) {
            countSubDirFiles++;
        }
        return countSubDirFiles;
    }

    private ResultFilesDTO findAndCountSubDirFiles(File file, ResultFilesDTO resultFiles) {
        resultFiles = resetCurrentDirFilesAmount(resultFiles);
        if(file.isDirectory()) {
            resultFiles = findAndCountDirFiles(file, resultFiles);
            resultFiles.addFilesAmountForCurrentDir(
                    new DirectoryFilesAmountDTO(file.getName(), resultFiles.getCurrentDirFilesAmount()));
        }
        return resultFiles;
    }

}

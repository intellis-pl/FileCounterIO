package main.java.search;

import main.java.dto.DirectoryFilesAmountDTO;
import main.java.dto.ResultFilesDTO;
import main.java.helpers.FileMatcher;

import java.io.File;
import java.util.ArrayList;

import static main.java.helpers.ResultFilesHelper.*;


public class DirectoryFileCounter {

    public ResultFilesDTO countFilesForDirectoryBranches(File dirContent) {
        ResultFilesDTO resultFiles = new ResultFilesDTO(0, new ArrayList<>());
        if(dirContent.isDirectory()) {
            if(dirContent.canRead()) {
                resultFiles = findAndCountDirFiles(dirContent, resultFiles);
            }
        }
        return resultFiles;
    }

    private ResultFilesDTO findAndCountDirFiles(File dirContent, ResultFilesDTO resultFiles) {
        Integer countDirFiles = 0;
        for(File file : dirContent.listFiles()) {
            resultFiles = findAndCountSubDirFiles(file, resultFiles);
            countDirFiles = countFilesForCurrentDir(file, countDirFiles);
            countDirFiles += resultFiles.getCurrentDirFilesAmount();
        }
        return modifyResults(resultFiles, countDirFiles);
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

    private Integer countFilesForCurrentDir(File file, Integer countDirFiles) {
        if(isValidExtensionFile(file)) {
            countDirFiles++;
        }
        return countDirFiles;
    }

    private boolean isValidExtensionFile(File file) {
        return file.isFile() && FileMatcher.matchExtension(file.getName());
    }

}

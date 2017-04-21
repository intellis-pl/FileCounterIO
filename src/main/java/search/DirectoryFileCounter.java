package main.java.search;

import main.java.dto.DirectoryContentDTO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class DirectoryFileCounter {

    private List<DirectoryContentDTO> contentList = new ArrayList<>();

    public List<DirectoryContentDTO> countFilesForDirectories(File dirContent) {
        if(dirContent.isDirectory()) {
            if(dirContent.canRead()) {
                findAndCountDirFiles(dirContent);
            }
        }
        return contentList;
    }

    private Integer findAndCountDirFiles(File dirContent) {
        int countSubDirFiles = 0;
        for(File file : dirContent.listFiles()) {
            countSubDirFiles = countFilesForCurrentDir(file, countSubDirFiles);
            countSubDirFiles += findAndCountSubDirFiles(file);
        }
        return countSubDirFiles;
    }

    private Integer countFilesForCurrentDir(File file, Integer countSubDirFiles) {
        if(file.isFile()) {
            countSubDirFiles++;
        }
        return countSubDirFiles;
    }

    private Integer findAndCountSubDirFiles(File file) {
        Integer countDirFiles = 0;
        if(file.isDirectory()) {
            countDirFiles = findAndCountDirFiles(file);
            contentList.add(
                    new DirectoryContentDTO(file.getName(), countDirFiles));
        }
        return countDirFiles;
    }

}

package main.java.search;

import main.java.dto.DirectoryContentDTO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class ContentSearch {

    private List<DirectoryContentDTO> contentList = new ArrayList<>();

    public List<DirectoryContentDTO> directorySearch(File dirContent) {
        if(dirContent.isDirectory()) {
            search(dirContent);
        }
        return contentList;
    }

    private void search(File dirContent) {
        if(dirContent.isDirectory()) {
            if(dirContent.canRead()) {
                findAndCountDirFiles(dirContent);
            }
        }
    }

    private Integer findAndCountDirFiles(File dirContent) {
        int countSubDirFiles = 0;
        for(File file : dirContent.listFiles()) {
            if(file.isFile()) {
                countSubDirFiles++;
            } else {
                countSubDirFiles += findAndCountSubDirFiles(file);
            }
        }
        return countSubDirFiles;
    }

    private Integer findAndCountSubDirFiles(File file) {
        Integer countDirFiles = findAndCountDirFiles(file);
        contentList.add(
                new DirectoryContentDTO(file.getName(), countDirFiles));
        return countDirFiles;
    }

}

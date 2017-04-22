package main.java;

import main.java.dto.DirectoryFilesAmountDTO;
import main.java.dto.ResultFilesDTO;
import main.java.search.DirectoryFileCounter;
import org.apache.log4j.Logger;

import java.io.File;

public class FileCounter {
    private final static Logger LOGGER = Logger.getLogger(FileCounter.class);

    public static void main(String[] args) {

        DirectoryFileCounter searcher = new DirectoryFileCounter();
        File directoryContent = new File("./search_dir/");

        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectories(directoryContent);

        for(DirectoryFilesAmountDTO fileCountDTO : fileCounterResult.getFilesAmountPerDirectoryBranch()) {
            LOGGER.info(fileCountDTO.getDirectoryName() + " " + fileCountDTO.getFileAmount());
        }

        LOGGER.info("\nAll files: " + fileCounterResult.getAllFilesAmount());

    }
}

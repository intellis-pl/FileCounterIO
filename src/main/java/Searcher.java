package main.java;

import main.java.search.DirectoryFileCounter;

import java.io.File;

public class Searcher {
    public static void main(String[] args) {

        DirectoryFileCounter searcher = new DirectoryFileCounter();
        File directoryContent = new File("./search_dir/");

        searcher.countFilesForDirectories(directoryContent);

    }
}

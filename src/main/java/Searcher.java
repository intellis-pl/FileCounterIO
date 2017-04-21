package main.java;

import main.java.search.ContentSearch;

import java.io.File;

public class Searcher {
    public static void main(String[] args) {

        ContentSearch searcher = new ContentSearch();
        File directoryContent = new File("./search_dir/");

        searcher.directorySearch(directoryContent);

    }
}

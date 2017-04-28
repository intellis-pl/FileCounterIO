package main.java.helpers;

import main.java.enums.FileExtension;

public class FileMatcher {

    public static boolean matchExtension(String fileName) {
        if(findFileExtension(fileName).equals(FileExtension.XML.getExtension())) {
            return true;
        }
        return false;
    }

    private static String findFileExtension(String fileName) {
        if(hasExtension(fileName)) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        }
        return "";
    }

    private static boolean hasExtension(String fileName) {
        return fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0;
    }
}

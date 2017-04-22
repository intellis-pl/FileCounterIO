package main.java.search;

import main.java.dto.ResultFilesDTO;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class DirectoryFileCounterTest {
    private final static String PATH = "./search_dir/";
    private DirectoryFileCounter searcher;

    @Before
    public void init() {
        searcher = new DirectoryFileCounter();
    }

    @Test
    public void shouldFindTwelveFilesForEntireBranchOf_A_Directory() {
        //given
        Integer expectedResult = 12;
        File directoryContent = new File(PATH + "A/");

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);

        //then
        assertEquals(expectedResult, fileCounterResult.getAllFilesAmount());
    }

    @Test
    public void shouldFindSevenFilesForDirectory_D() {
        //given
        Integer expectedResult = 7;
        File directoryContent = new File(PATH + "A/D/");

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);

        //then
        assertEquals(expectedResult, fileCounterResult.getAllFilesAmount());
    }

    @Test
    public void shouldFindThreeFilesForDirectory_C() {
        //given
        Integer expectedResult = 3;
        File directoryContent = new File(PATH + "A/C/");

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);

        //then
        assertEquals(expectedResult, fileCounterResult.getAllFilesAmount());
    }

    @Test
    public void shouldFindTwoFilesForDirectory_B() {
        //given
        Integer expectedResult = 2;
        File directoryContent = new File(PATH + "A/B/");

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);

        //then
        assertEquals(expectedResult, fileCounterResult.getAllFilesAmount());
    }

    @Test
    public void shouldFindFourFilesForDirectory_E() {
        //given
        Integer expectedResult = 4;
        File directoryContent = new File(PATH + "A/D/E/");

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);

        //then
        assertEquals(expectedResult, fileCounterResult.getAllFilesAmount());
    }

    @Test
    public void shouldFindOneFileForDirectory_F() {
        //given
        Integer expectedResult = 1;
        File directoryContent = new File(PATH + "A/D/F/");

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);

        //then
        assertEquals(expectedResult, fileCounterResult.getAllFilesAmount());
    }

    @Test
    public void shouldFindOneFileForDirectory_I() {
        //given
        Integer expectedResult = 1;
        File directoryContent = new File(PATH + "A/D/G/I/");

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);

        //then
        assertEquals(expectedResult, fileCounterResult.getAllFilesAmount());
    }

    @Test
    public void shouldFindOneFileForEntireBranchOf_G_Directory() {
        //given
        Integer expectedResult = 1;
        File directoryContent = new File(PATH + "A/D/G/");

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);

        //then
        assertEquals(expectedResult, fileCounterResult.getAllFilesAmount());
    }

}
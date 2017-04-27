package main.java.search;

import main.java.dto.DirectoryFilesAmountDTO;
import main.java.dto.ResultFilesDTO;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.*;

public class DirectoryFileCounterTest {
    private final static String PATH = "./search_dir/A";
    private final static Integer ALL_FILES_AMOUNT = 12;
    private DirectoryFileCounter searcher;

    @Before
    public void init() {
        searcher = new DirectoryFileCounter();
    }

    @Test
    public void shouldFindTwelveFilesForEntireBranchOf_A_Directory() {
        //given
        Integer expectedResult = 12;
        File directoryContent = new File(PATH);

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
        File directoryContent = new File(PATH);

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);
        Integer resultFromList = findFilesAmountForDirectory("D", fileCounterResult.getFilesAmountPerDirectoryBranch());

        //then
        assertEquals(ALL_FILES_AMOUNT, fileCounterResult.getAllFilesAmount());
        assertEquals(expectedResult, resultFromList);
    }

    @Test
    public void shouldFindThreeFilesForDirectory_C() {
        //given
        Integer expectedResult = 3;
        File directoryContent = new File(PATH);

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);
        Integer resultFromList = findFilesAmountForDirectory("C", fileCounterResult.getFilesAmountPerDirectoryBranch());

        //then
        assertEquals(ALL_FILES_AMOUNT, fileCounterResult.getAllFilesAmount());
        assertEquals(expectedResult, resultFromList);
    }

    @Test
    public void shouldFindTwoFilesForDirectory_B() {
        //given
        Integer expectedResult = 2;
        File directoryContent = new File(PATH);

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);
        Integer resultFromList = findFilesAmountForDirectory("B", fileCounterResult.getFilesAmountPerDirectoryBranch());

        //then
        assertEquals(ALL_FILES_AMOUNT, fileCounterResult.getAllFilesAmount());
        assertEquals(expectedResult, resultFromList);
    }

    @Test
    public void shouldFindFourFilesForDirectory_E() {
        //given
        Integer expectedResult = 4;
        File directoryContent = new File(PATH);

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);
        Integer resultFromList = findFilesAmountForDirectory("E", fileCounterResult.getFilesAmountPerDirectoryBranch());

        //then
        assertEquals(ALL_FILES_AMOUNT, fileCounterResult.getAllFilesAmount());
        assertEquals(expectedResult, resultFromList);
    }

    @Test
    public void shouldFindOneFileForDirectory_F() {
        //given
        Integer expectedResult = 1;
        File directoryContent = new File(PATH);

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);
        Integer resultFromList = findFilesAmountForDirectory("F", fileCounterResult.getFilesAmountPerDirectoryBranch());

        //then
        assertEquals(ALL_FILES_AMOUNT, fileCounterResult.getAllFilesAmount());
        assertEquals(expectedResult, resultFromList);
    }

    @Test
    public void shouldFindOneFileForDirectory_I() {
        //given
        Integer expectedResult = 1;
        File directoryContent = new File(PATH);

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);
        Integer resultFromList = findFilesAmountForDirectory("I", fileCounterResult.getFilesAmountPerDirectoryBranch());

        //then
        assertEquals(ALL_FILES_AMOUNT, fileCounterResult.getAllFilesAmount());
        assertEquals(expectedResult, resultFromList);
    }

    @Test
    public void shouldFindOneFileForEntireBranchOf_G_Directory() {
        //given
        Integer expectedResult = 1;
        File directoryContent = new File(PATH);

        //when
        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectoryBranches(directoryContent);
        Integer resultFromList = findFilesAmountForDirectory("G", fileCounterResult.getFilesAmountPerDirectoryBranch());

        //then
        assertEquals(ALL_FILES_AMOUNT, fileCounterResult.getAllFilesAmount());
        assertEquals(expectedResult, resultFromList);
    }

    private Integer findFilesAmountForDirectory(String dirName, List<DirectoryFilesAmountDTO> resultFiles) {
        for(DirectoryFilesAmountDTO dto : resultFiles) {
            if(dto.getDirectoryName().equals(dirName)) {
                return dto.getFileAmount();
            }
        }
        return 0;
    }

}
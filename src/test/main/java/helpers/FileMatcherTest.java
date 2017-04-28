package main.java.helpers;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FileMatcherTest {

    @Test
    public void shouldMatchFileForXMLExtension() {
        //given
        String fileName = "testFile.xml";

        //when
        Boolean isXml = FileMatcher.matchExtension(fileName);

        //then
        assertTrue(isXml);
    }

    @Test
    public void shouldNOTMatchFileForXMLExtension() {
        //given
        String fileName = "testFile.3ds";

        //when
        Boolean isXml = FileMatcher.matchExtension(fileName);

        //then
        assertFalse(isXml);
    }


}
package com.example.vilkaites2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Given_EmptyText_getCharsCount_ZeroReturned() {
        String givenString = "";

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_EmptyText_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "";

        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_NormalText_getCharsCount_CorrectValueReturned() {
        String givenString = "This is a normal text.";

        int expectedValue = 22;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_WhitespaceOnlyText_getCharsCount_ZeroReturned() {
        String givenString = "   ";

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_WhitespaceOnlyText_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "   ";

        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_NormalText_getWordsCount_CorrectValueReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "This is a normal text.";

        int expectedValue = 5;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

}
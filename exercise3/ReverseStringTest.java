package exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        String input = "niw uoy";
        String reverseInput = "";  //TODO reverse the string

        assertEquals("Reverse string", "you win", reverseInput);
    }

}

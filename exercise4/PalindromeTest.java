package exercise4;

import org.junit.Test;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    private final String INPUT_1 = "sportscar";
    private final String INPUT_2 = "racecar";

    @Test
    public void palindromeIsFalse() {
        assertFalse(isPalindrome(INPUT_1));
    }

    @Test
    public void palindromeIsTrue() {
        assertTrue(isPalindrome(INPUT_2));
    }

    private boolean isPalindrome(String input) {
        fail("TODO determine if the input is a palindrome");
        return false;
    }

}

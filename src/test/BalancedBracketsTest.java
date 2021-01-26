package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    /*@Test
    public void blankTestReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }*/

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyFirstBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyLastBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void onlyTwoLeftBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void onlyTwoRightBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void onlyReversedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsWithWordInsideReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Word]"));
    }

    @Test
    public void wordWithLeftBracketInsideReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Wo[rd]"));
    }

    @Test
    public void wordWithRightBracketInsideReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Wo]rd"));
    }

    @Test
    public void wordWithBracketOnLeftReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Word"));
    }

    @Test
    public void wordWithBracketOnRightReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Word[]"));
    }
    @Test
    public void singleLeftBracketWithWordInsideReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Word"));
    }

    @Test
    public void singleRightbracketWithWordInsideReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Word]"));
    }
}

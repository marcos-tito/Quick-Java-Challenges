package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordTest {


    @Test
    public void testWord1() {
        assertEquals("A", CapitalizeWord.capitalize("A"));
    }

    @Test
    public void testWord2() {
        assertEquals("A", CapitalizeWord.capitalize("a"));
    }

    @Test
    public void testWord3() {
        assertEquals("Ab", CapitalizeWord.capitalize("ab"));
    }

    @Test
    public void testWord4() {
        assertEquals("Ab C", CapitalizeWord.capitalize("ab c"));
    }

    @Test
    public void testWord5() {
        assertEquals("Ab Cd E", CapitalizeWord.capitalize("ab cd e"));
    }

    @Test
    public void testWord6() {
        assertEquals(" Ab Cd E ", CapitalizeWord.capitalize(" ab cd e "));
    }

    @Test
    public void testWord7() {
        assertEquals("Ab    C", CapitalizeWord.capitalize("ab    c"));
    }

    @Test
    public void testWord8() {
        assertEquals("\\ab Cd *e", CapitalizeWord.capitalize("\\ab cd *e"));
    }

    @Test
    public void testWord9() {
        assertEquals("  Ab Cd   E", CapitalizeWord.capitalize("  ab cd   e"));
    }


}
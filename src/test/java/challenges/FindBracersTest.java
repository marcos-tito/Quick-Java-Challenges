package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindBracersTest {

    @Test
    void isValidBracers_empty() {
        assertFalse(FindBracers.isValidBracers(""));
    }
    @Test
    void isValidBracers_valid_1() {
        assertTrue(FindBracers.isValidBracers("{[()]}"));
    }

    @Test
    void isValidBracers_valid_2() {
        assertTrue(FindBracers.isValidBracers("()"));
    }

    @Test
    void isValidBracers_valid_3() {
        assertTrue(FindBracers.isValidBracers("{}"));
    }

    @Test
    void isValidBracers_valid_4() {
        assertTrue(FindBracers.isValidBracers("[]"));
    }

    @Test
    void isValidBracers_valid_5() {
        assertTrue(FindBracers.isValidBracers("[()]"));
    }

    @Test
    void isValidBracers_invalid_1() {
        assertFalse(FindBracers.isValidBracers("{})"));
    }

    @Test
    void isValidBracers_invalid_2() {
        assertFalse(FindBracers.isValidBracers("{)"));
    }

    @Test
    void isValidBracers_invalid_3() {
        assertFalse(FindBracers.isValidBracers("})"));
    }

    @Test
    void isValidBracers_invalid_4() {
        assertFalse(FindBracers.isValidBracers("}()"));
    }

    @Test
    void isValidBracers_invalid_5() {
        assertFalse(FindBracers.isValidBracers("()}"));
    }
    @Test
    void isValidBracers_invalid_6() {
        assertFalse(FindBracers.isValidBracers("))))))"));
    }
    @Test
    void isValidBracers_invalid_7() {
        assertFalse(FindBracers.isValidBracers("{))))))}"));
    }
    @Test
    void isValidBracers_invalid_8() {
        assertFalse(FindBracers.isValidBracers("())))))"));
    }
    @Test
    void isValidBracers_invalid_9() {
        assertFalse(FindBracers.isValidBracers("a))))))"));
    }
    @Test
    void isValidBracers_invalid_10() {
        assertFalse(FindBracers.isValidBracers("ab()"));
    }
}
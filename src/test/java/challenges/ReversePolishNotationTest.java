package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePolishNotationTest {

    @Test
    void calculate_empty_expression() {
        assertEquals(0, ReversePolishNotation.calculate(""));
    }

    @Test
    void calculate_without_operation() {
        assertEquals(7, ReversePolishNotation.calculate("3 5 7"));
    }

    @Test
    void calculate1() {
        assertEquals(13, ReversePolishNotation.calculate("5 8 +"));
    }

    @Test
    void calculate2() {
        assertEquals(6, ReversePolishNotation.calculate("4 13 5 / +"));
    }

    @Test
    void calculate3() {
        assertEquals(9, ReversePolishNotation.calculate("2 1 + 3 *"));
    }

    @Test
    void calculate4() {
        assertEquals(22, ReversePolishNotation.calculate("10 6 9 3 + -11 * / * 17 + 5 +"));
    }

}
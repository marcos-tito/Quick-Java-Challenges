package challenges;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] numbers = {1, 3, 4, 6, 7, 9, 10, 13, 15, 17};

        assertTrue(BinarySearch.numberExists(numbers, 3));
        assertTrue(BinarySearch.numberExists(numbers, 10));
        assertTrue(BinarySearch.numberExists(numbers, 4));

        assertFalse(BinarySearch.numberExists(numbers, 14));
        assertFalse(BinarySearch.numberExists(numbers, 8));
        assertFalse(BinarySearch.numberExists(numbers, 5));

    }

    @Test
    public void testBinarySearchMassively() {

        int limit = 1000000;
        int[] numbers = new int[limit];
        Random random = new Random();

        for (int i = 0; i < limit; i++) {
            numbers[i] = random.nextInt();
        }

        Arrays.sort(numbers);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < limit; i++)
            assertTrue(BinarySearch.numberExists(numbers, numbers[random.nextInt(limit)]));

        System.out.println("binarySearch time: " + (System.currentTimeMillis() - startTime));
    }
}
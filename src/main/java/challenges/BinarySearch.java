package challenges;

public class BinarySearch {

    public static boolean numberExists(int[] numberArray, int target) {
        return searchBinarySearch(numberArray, 0, numberArray.length - 1, target);
    }

    private static boolean searchBinarySearch(int[] numberArray, int firstPosition, int lastPosition, int target) {
        if (lastPosition < firstPosition) {
            return false;
        }

        int middlePosition = firstPosition + (lastPosition - firstPosition) / 2;
        int middleItem = numberArray[middlePosition];

        if (target == middleItem) {
            return true;
        } else {
            if (firstPosition == lastPosition) {
                return false;
            }
            if (target > middleItem) {
                return searchBinarySearch(numberArray, middlePosition + 1, lastPosition, target);
            } else {
                return searchBinarySearch(numberArray, firstPosition, middlePosition - 1, target);
            }
        }
    }
}

package Array;

public class binarySearchIterative {
    /*
2. Binary Search Iterative: Given an array of sorted integers and an integer target, write an iterative program that returns the index of the target if it exists in the array and -1 otherwise.
*/




    public static int binarySearchIterative(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length;

        while (high >= low) {
            int middle = (high + low) / 2;
            if (target == sortedArray[middle]) {
                return middle;
            } else if (target < sortedArray[middle]) {
                high = middle - 1;
            } else if (target > sortedArray[middle]) {
                low = middle + 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 6, 8, 10 };
        int target = 5;

        int result = binarySearchIterative(array, target);
        System.out.println(result);


    }

}

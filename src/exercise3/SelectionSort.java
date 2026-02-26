package exercise3;

/**
 * Provides a static method to sort an array of Integers using the Selection Sort algorithm.
 * Selection sort works by finding the minimum element from the unsorted 
 * part and putting it at the beginning.
 */
public class SelectionSort {

    /**
     * Sorts the provided Integer array in ascending order.
     * Complexity: O(n^2).
     * @param array The array of Integers to be sorted.
     */
    public static void sort(Integer[] array) {

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < array.length - 1; i++) {
            
            // Find the minimum element in the unsorted portion
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted portion
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
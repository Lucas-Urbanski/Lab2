package exercise3;

public class SelectionSort {

    public static void sort(Integer[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}

import java.util.Arrays;

public class LearnInsertionSorting {
    
    static void insertionSort(int arr[], int size) {
        for(int i=0; i< size -1; i ++) {
            int j = i; //? initializing with i, so won't get declared again-2

            while (j > 0 && arr[j-1] > arr[j]) { //? swap by going reverse when j > 0 and current j must smaller than j-1.

                //? swapping logic
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--; //? updating index to check new values
            }
        }

        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 9, 11, 12, 6, 8, 15 };
        insertionSort(arr, arr.length);
    }
}

import java.util.Arrays;

public class LearnBubbleSortin {
    static void sortByBubbleSort(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
         
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 21, 4, 5, 21, 20 };

        sortByBubbleSort(arr, arr.length);
    }
}

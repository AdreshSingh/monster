import java.util.Arrays;

public class LearnSelectionSorting {
    static void sortingSelection(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    // ? only need need to update minimum index, not to exchange the values
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 12, 1, 2, 3, 11, 21, 5 };
        sortingSelection(arr, arr.length);
    }
}

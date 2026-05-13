import java.util.*;

public class FindMinAndMaxFreq {
    static void countValFreq(int arr[], int size) {
        // ? for holding values & freq
        Map<Integer, Integer> dataCounts = new HashMap<>();

        //? counting values & their freq
        for (int i = 0; i < size; i++) {
            dataCounts.put(arr[i], dataCounts.getOrDefault(dataCounts.get(i), 0) + 1);
        }

        //? imp variable declrartion
        int maxFreq = 0, minFreq = size;
        int minVal = 0, maxVal = 0;

        //? extracting single pair
        for (Map.Entry<Integer, Integer> pair : dataCounts.entrySet()) {
            int ele = pair.getKey();
            int count = pair.getValue();

            //? looking for new max ele
            if (count > maxFreq) {
                maxFreq = count;
                maxVal = ele;
            }

            //? looking for new min ele
            if (count < minFreq) {
                minFreq = count;
                minVal = ele;
            }
        }

        System.out.println("minimum value: " + minVal + " frequency: " + minFreq);
        System.out.println("maximum value " + maxVal + " frequency: " + maxFreq);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 2 };

        countValFreq(arr, arr.length);
    }
}
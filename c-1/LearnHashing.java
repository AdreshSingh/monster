import java.util.HashMap;

public class LearnHashing {
    static void charCountLowercase(String d) {
        int arr[] = new int[26];

        for (int i = 0; i < d.length(); i++) {
            int ch = d.charAt(i);
            // ? for debugging
            // System.out.println(ch + " " + (char)ch);
            arr[ch - 95] += 1;
        }

        // ? printed in indexed order
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] != 0) {
        // System.out.println((char) (95 + i) + " " + arr[i]);
        // }
        // }

        // ? printed in indexed order
        for (int i = 0; i < d.length(); i++) {
            System.out.println(d.charAt(i) + " " + arr[d.charAt(i) - 95]);
        }
    }

    static void charCountAll(String d) {
        HashMap<Character, Integer> cHashMap = new HashMap<>();

        d
                .chars()
                .forEach(
                        c -> cHashMap.put(
                                (char) c, cHashMap.getOrDefault((char) c, 0) + 1));

        System.out.println(cHashMap);
    }

    static void countArrayElement(int arr[]) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int d : arr) {
            counts.put(d, counts.getOrDefault(d, 0) + 1);
        }

        System.out.println(counts);
    }

    public static void main(String[] args) {
        // ? counting only lowercase character
        // charCountLowercase("devank");

        // ? counting all and everything
        // charCountAll("devank");

        // ? counting each array element
        countArrayElement(new int[] { 1, 3, 2, 3, 2, 1, 10, 10, 11, 11, 10 });
    }
}
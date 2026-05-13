import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LearnSortingAgain {
    public static void main(String[] args) {
        HashMap<Integer, Integer> d = new HashMap<>();

        for (int num : new int[] { 10, 10, 11, 11, 20, 20, 1, 1, 1, 2 }) {
            d.put(num, d.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> sortedData = d.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));

        System.out.println("data:" + sortedData);

        Map.Entry<Integer, Integer> maxEntry = Collections.max(
                d.entrySet(),
                Map.Entry.comparingByValue());

        System.out.printf("Number %d : occurred for: %d\n", maxEntry.getKey(), maxEntry.getValue());

        Map.Entry<Integer, Integer> minEntry = Collections.min(
                d.entrySet(),
                Map.Entry.comparingByValue());
        System.out.printf("Number %d : occurred for: %d", minEntry.getKey(), minEntry.getValue());
    }
}

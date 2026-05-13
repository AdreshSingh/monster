import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LearnSortingInHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> unsortedMap = new HashMap<>();

        unsortedMap.put("b", 1);
        unsortedMap.put("a", 2);
        unsortedMap.put("c", 3);

        //! sorts by keys
        TreeMap<String,Integer> sortedMap = new TreeMap<>(unsortedMap);

        System.out.println(sortedMap);

        Map<String, Integer> sortedMapByValues = unsortedMap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(
            Map.Entry::getKey, 
            Map.Entry::getValue,
            (oldValue, newValue) -> oldValue,
            LinkedHashMap::new  // maintains sorted order
        ));

        System.out.println(sortedMapByValues);

    }
}
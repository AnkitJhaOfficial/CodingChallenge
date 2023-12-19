import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KMostFrequentElement {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 3};
        int k = 2;
//        int[] array = {1};
//        int k=1;
        int[] kMostFrequentElement = findKMostFrequentElement(array, k);
        System.out.println(Arrays.toString(kMostFrequentElement));
    }

    public static int[] findKMostFrequentElement(int[] array, int k) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int element : array) {
            if (integerMap.get(element) == null) {
                integerMap.put(element, 1);
            } else {
                int count = integerMap.get(element);
                integerMap.put(element, count + 1);
            }
        }
        return integerMap.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .mapToInt(Map.Entry::getKey).limit(k).toArray();
    }
}

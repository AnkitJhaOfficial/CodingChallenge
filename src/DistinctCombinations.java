import java.util.Arrays;
import java.util.stream.IntStream;

public class DistinctCombinations {
    public static void main(String[] args) {
        int[] array = {1, 2, 1};
        int k = 2;
        findDistinctCombinationsOfArray(array, new int[k], k, 0, 0);
    }

    public static void findDistinctCombinationsOfArray(int[] array, int[] copy, int k, int start, int index) {
        if (start == 0)
            array = Arrays.stream(array).sorted().distinct().toArray();
        if (k == 0) {
            System.out.println(Arrays.toString(copy));
            return;
        } else {
            for (int i = index; i < array.length; i++) {
                copy[start] = array[i];
                findDistinctCombinationsOfArray(array, copy, k - 1, start + 1, i);
            }
        }
    }
}

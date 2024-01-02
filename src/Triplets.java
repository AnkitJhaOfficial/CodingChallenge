import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Triplets {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = findTriplets(nums);
        System.out.println(triplets);
    }

    public static List<List<Integer>> findTriplets(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> elements = Stream.of(nums[i], nums[j], nums[k]).sorted().toList();
                        set.add(elements);
                    }
                }
            }
        }
        return set.stream().toList();
    }
}

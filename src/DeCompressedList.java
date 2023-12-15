import java.util.ArrayList;
import java.util.List;

public class DeCompressedList {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        List<Integer> integerList = generateDeCompressedList(nums);
        System.out.println(integerList);
    }

    public static List<Integer> generateDeCompressedList(int[] nums) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                integerList.add(nums[i + 1]);
            }
        }
        return integerList;
    }
}

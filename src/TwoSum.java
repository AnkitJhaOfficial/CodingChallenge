import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoSum {
    public static void main(String[] args) {
        int n = 6;
        int x = 16;
        int[] array = {1, 4, 45, 6, 10, 8};
        findTwoSum(n, x, array);
    }

    public static void findTwoSum(int n, int x, int[] array) {
        Map<Integer, Integer> map = Arrays.stream(array).boxed()
                .collect(Collectors.toMap(integer -> integer, integer -> 1, Integer::sum));
        if (x % 2 == 0 && map.get(x / 2) != null) {
            if (map.get(x / 2) >= 2) {
                System.out.println("Yes");
                return;
            }
        }
        for (int integer:array) {
            if(map.get(x-integer)!=null){
                System.out.println("yes");
                return;
            }
        }
        System.out.println("No");
    }

}

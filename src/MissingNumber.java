import java.util.Arrays;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        int missingNumberUsingMap = findMissingNumberUsingMap(nums);
        System.out.println(missingNumberUsingMap);
        int missingNumber = findMissingNumber(nums);
        System.out.println(missingNumber);
    }

    public static int findMissingNumberUsingSet(int[] nums){
        Set<Integer> integerSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for (int i = 0; i <= nums.length; i++) {
            if(!integerSet.contains(i)){
                return i;
            }
        }
        return -1;
    }

    public static int findMissingNumberUsingMap(int[] nums){
        Map<Integer, Object> map = Arrays.stream(nums).boxed()
                .collect(Collectors.toMap(integer -> integer, integer -> new Object()));
        OptionalInt first = IntStream.range(0, nums.length).filter(value -> map.get(value) == null).findFirst();
        if(first.isPresent()){
            return first.getAsInt();
        }
        return -1;
    }

    public static int findMissingNumber(int[] nums){
        int sum = 0;
        for (int num: nums) {
            sum+=num;
        }
        double sumOfN=(nums.length/2d)*(nums.length+1);
        return (int)(sumOfN-sum);
    }
}

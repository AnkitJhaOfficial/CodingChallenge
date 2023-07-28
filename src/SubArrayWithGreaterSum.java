import java.util.Arrays;
import java.util.List;

public class SubArrayWithGreaterSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 9;
//        int length = lengthSubArrayWithGreaterSum(array, sum);
//        if (length == 0) {
//            System.out.println("No subarray exists");
//        } else {
//            System.out.println(length);
//        }
        usingSNFormula(array,sum);
    }

    private static void usingSNFormula(int[] array, int sum) {
        float totalSum = 0;
        totalSum = array[0] + array[array.length-1];
        totalSum = totalSum/2;
        totalSum = totalSum * (array.length);
        System.out.println(totalSum);

        float n=(8f*2f)/(float) (array[0] + array[array.length-1]);
        System.out.println(n);
    }

    public static int lengthSubArrayWithGreaterSum(int[] array, int target) {
        for (int i = array.length - 1; i >= 0; i--) {
            int[] ints = Arrays.copyOfRange(array, i, array.length);
            int sum = Arrays.stream(ints).sum();
            if (target < sum) {
                return ints.length;
            }
        }
        return 0;
    }

}

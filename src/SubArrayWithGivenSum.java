import java.util.Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int nums[] = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
        int givenSum = 15;
        int[] subArraysWithGivenSum = findSubArraysWithGivenSum(nums, givenSum);
        if (subArraysWithGivenSum != null)
            System.out.println(Arrays.toString(subArraysWithGivenSum));
        else
            System.out.println("sub array not found with given sum");
    }

    static int[] findSubArraysWithGivenSum(int[] array, int givenSum) {
        for (int i = 0; i < array.length - 1; i++) {
            int tempSum = 0;
            for (int j = i; j < array.length; j++) {
                tempSum = tempSum + array[j];
                if (givenSum == tempSum) {
                    return Arrays.copyOfRange(array, i, j + 1);
                }
            }
        }
        return null;
    }
}

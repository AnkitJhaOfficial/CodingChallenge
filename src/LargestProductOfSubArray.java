import java.util.Arrays;

public class LargestProductOfSubArray {
    public static void main(String[] args) {
        int[] array = {2,3,-2,4};
        int largestProductOfSubArray = findLargestProductOfSubArray(array);
        System.out.println(largestProductOfSubArray);
    }

    public static int findLargestProductOfSubArray(int[] array){
        int maxProduct=Integer.MIN_VALUE;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i; j < array.length; j++) {
                int product = calculateProduct(Arrays.copyOfRange(array, i, j + 1));
                if(maxProduct<product){
                    maxProduct=product;
                }
            }
        }
        return maxProduct;
    }

    public static int calculateProduct(int[] array) {
        return Arrays.stream(array).reduce(1, (product, value) -> product * value);
    }
}

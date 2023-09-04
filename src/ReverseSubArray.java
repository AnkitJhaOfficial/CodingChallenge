import java.util.Arrays;

public class ReverseSubArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
        int n = 10;
        int k = 3;
        reverseGroupOfSubArray(array, n, k);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseGroupOfSubArray(int[] array, int n, int k) {

        for (int i = 0; i < (array.length / k) + 1; i++) {
            if (array.length >= k * (i + 1)){
                int midIndex=k*i+k/2;
                int endIndex=(i + 1) * k-1;
                for (int start = k*i; start < midIndex; start++,endIndex--) {
                    int temp=array[start];
                    array[start]=array[endIndex];
                    array[endIndex]=temp;
                }
            }
            else {
                int midIndex=k*i+(array.length-k*i)/2;
                int endIndex= array.length-1;
                for (int start = k*i; start < midIndex; start++,endIndex--) {
                    int temp=array[start];
                    array[start]=array[endIndex];
                    array[endIndex]=temp;
                }
            }
        }
    }
}

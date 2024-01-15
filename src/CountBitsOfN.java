import java.util.Arrays;

public class CountBitsOfN {
    public static void main(String[] args) {
        int n=2;
        int[] countedBitsOfNumbers = countBitsOfNumbers(n);
        System.out.println(Arrays.toString(countedBitsOfNumbers));
    }

    public static int[] countBitsOfNumbers(int n){
        int[] arr = new int[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i]=Integer.bitCount(i);
        }
        return arr;
    }
}

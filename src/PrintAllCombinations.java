import java.util.Arrays;

public class PrintAllCombinations {

    public static void main(String[] args) {
        int n=3;
        printAllCombination(n);
    }

    public static void printAllCombination(int n){
        int[] array = new int[n];
        Arrays.fill(array,0,n,1);
        for (int i = array.length-1; i > 0; i--) {
            System.out.println(Arrays.toString(Arrays.copyOf(array,i+1)));
            if(array[i]-array[i-1]>=2){
                array[i]--;
                array[i-1]++;
                i++;
            }
            else {
                array[i-1]=array[i-1]+array[i];
            }

        }
        System.out.println(Arrays.toString(Arrays.copyOf(array,1)));
    }
}
import java.util.Arrays;

public class TrimArray {
    public static void main(String[] args) {
        int[] array = {4, 6, 1, 7, 5, 9, 2};
//        int[] array = {4, 2, 6, 4, 9};
        int minimumRemovals = findMinimumRemovals(array);
        System.out.println(minimumRemovals);
    }

    public static int findMinimumRemovals(int[] array){
        int length=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j >=0; j--) {
                if(i>=j){
                    break;
                }
                else  {
                    int[] subArray = Arrays.copyOfRange(array, i, j + 1);
                    int max = Arrays.stream(subArray).max().getAsInt();
                    int min = Arrays.stream(subArray).min().getAsInt();
                    if(min*min>max && length<j-i){
                        length=j-i;
                    }
                }
            }
        }
        return array.length-length-1;
    }
}

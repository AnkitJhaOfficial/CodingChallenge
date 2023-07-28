import java.util.Arrays;

public class SmallestWindow {
    public static void main(String[] args) {
        int[] array =  { 1, 3, 2, 7, 5, 6, 4, 8 };
        findIndexOfSmallestWindow(array);
    }

    private static void findIndexOfSmallestWindow(int[] array) {
        int[] clone = array.clone();
        Arrays.sort(clone);
        int beginIndex=0;
        int endIndex= array.length-1;
        for (int i = 0; i <array.length/2;i++) {
            if(clone[i]==array[i] && beginIndex==i){
                beginIndex++;
            }
            if (clone[array.length-i-1]==array[array.length-i-1] && endIndex==array.length-i-1) {
                endIndex--;
            }
        }
        System.out.println("Sort the array from index "+beginIndex+" to "+endIndex);
    }


}

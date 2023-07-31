import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Given an unsorted integer array containing many duplicate elements, rearrange it such that the same element appears together
// and the relative order of the first occurrence of each element remains unchanged.

public class ReArrangeElements {
    public static void main(String[] args) {
        int[] array =  { 5, 4, 5, 5, 3, 1, 2, 2, 4 };
        reArrangeOnFirstOccurance(array);

    }

    public static void reArrangeOnFirstOccurance(int[] array){
        int[] tempArray = new int[array.length];
        List<Integer> list = new ArrayList<>();
        int k=0;
        for (int i=0;i< array.length && k< array.length;i++) {
            int element=array[i];
            for (int j = 0; j < array.length; j++) {
                if (element == array[j] && !list.contains(array[j])) {
                    tempArray[k] = array[j];
                    k++;
                }
            }
            list.add(element);
        }
        System.out.println(Arrays.toString(tempArray));
    }

}

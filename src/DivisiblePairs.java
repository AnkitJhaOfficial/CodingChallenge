import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisiblePairs {
    public static void main(String[] args) {
        int[] array =   { 3, 1, 2, 6, 9, 4 };
        int k=6;
        isDivisiblePairsFormed(array,k);
    }

    public static void isDivisiblePairsFormed(int[] array,int k){
        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(arrayList.isEmpty()){
                    break;
                }
                if((array[i]+array[j])%k==0){
                    if(arrayList.contains(array[i])){
                        arrayList.remove(Integer.valueOf(array[i]));
                    }
                    if(arrayList.contains(array[j])){
                        arrayList.remove(Integer.valueOf(array[j]));
                    }
                }
            }
        }
        if(arrayList.isEmpty()){
            System.out.println("Pairs can be formed");
        }
        else {
            System.out.println("Pairs cannot be formed");
        }
    }

}

import java.util.Arrays;

public class CountGreaterNumbersAtRight {
    public static void main(String[] args) {
        int[] array={ 4, 6, 3, 9, 7, 10 };
        countTotalGreaterNumbersAtRight(array);
    }

    public static void countTotalGreaterNumbersAtRight(int[] array){
        int[] greaterNumbersAtRight=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int count=0;
            for (int j = i+1; j < array.length ; j++) {
                if(array[i]<array[j]){
                    count++;
                }
            }
            greaterNumbersAtRight[i]=count;
        }
        System.out.println(Arrays.toString(greaterNumbersAtRight));
    }

}

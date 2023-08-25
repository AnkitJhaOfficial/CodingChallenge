import java.util.Arrays;

public class PrintNumbers {
    public static void main(String[] args) {
        int[] array={9, -3, 5, -2, -8, -6, 1, 3};
        printNumber(array);
        System.out.println(Arrays.toString(array));
    }

    public static void printNumber(int[] array){
        int index=0;
        int currentIndex=0;
        int lastIndex= array.length-1;
        while (index<array.length && lastIndex>=currentIndex){
            if(index>currentIndex && array[index]<0 && array[currentIndex]>0){
                int temp=array[index];
                array[index]=array[currentIndex];
                array[currentIndex]=temp;
            }
            if(array[currentIndex]<0){
                currentIndex++;
            }
            if(array[index]>0){
                index++;
            }
            if(array[lastIndex]>0){
                lastIndex--;
            }
        }
    }
}

import java.util.Arrays;

public class SortUsingMergeSort {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array, int start, int end) {
        int mid = (start + end) / 2;
        if (end - start <= 0) {
            return ;
        } else {
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
        return ;
    }

    public static void merge(int[] array, int start, int mid, int end) {
        int leftIndex = 0;
        int rightIndex = 0;
        int index = start;

        int[] leftArray = Arrays.copyOfRange(array, start, mid + 1);
        int[] rightArray = Arrays.copyOfRange(array, mid + 1, end + 1);

            while (index<=end){
                if(leftIndex==leftArray.length){
                    array[index] = rightArray[rightIndex];
                    rightIndex++;
                }
                else if(rightIndex==rightArray.length){
                    array[index] = leftArray[leftIndex];
                    leftIndex++;
                }
                else if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[index] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[index] = rightArray[rightIndex];
                    rightIndex++;
                }
                index++;
            }
        return;
    }
}

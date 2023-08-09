import java.util.Arrays;

public class SortUsingMergeSort {
    public static void main(String[] args) {
        int[] array = {3,13,4,55,22,2,5,98,6,4,2};
        sortWithMergeSort(array);
    }

    public static void sortWithMergeSort(int[] array) {
        divideArray(array,0, array.length-1);
    }

    private static int divideArray(int[] array, int start, int end) {
        if(end-start<=0){
//            System.out.println(array[start]);
            return 0;
        }
        else {
            int mid=(start+end)/2;
            divideArray(array,start,mid);
            divideArray(array,mid+1,end);
//            System.out.println(Arrays.toString(Arrays.copyOfRange(array,start,end+1)));
            merge(array,start,mid+1,end+1);
        }
        return 0;
    }
    private static void merge(int[] array,int left,int mid, int right){
        int[] leftArray=Arrays.copyOfRange(array,left,mid);
        int[] rightArray = Arrays.copyOfRange(array,mid,right+1);

        System.out.println(Arrays.toString(leftArray));
        System.out.println(Arrays.toString(rightArray));

        int index=left,l=0,m=0;

        while(index<=right-left){
            System.out.println("Merged Array"+Arrays.toString(array));
            if(l>=mid-left){
                array[index]=rightArray[m];
                m++;
                index++;
            }
            else if(m>=right-mid){
                array[index]=leftArray[l];
                l++;
                index++;
            }
            else if (leftArray[l]<=rightArray[m]) {
                array[index]=leftArray[l];
                index++;
                l++;
            } else if (leftArray[l]>=rightArray[m]) {
                array[index]=rightArray[m];
                index++;
                m++;
            }

        }
//        System.out.println("Merged Array"+Arrays.toString(array));

    }
}

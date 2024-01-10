import java.math.BigInteger;

public class IncreasingSubSequence {
    public static void main(String[] args) {
        int[] nums = {10,101,19,17,18,20};
        int size = increasingSubSequenceArraySize(nums);
        System.out.println(size);
    }

    public static int increasingSubSequenceArraySize(int[] arr){
        int maxSize=0;
        int index=0;
        while(maxSize<arr.length-index){
            int nextSubSequenceSize = nextSubSequenceSize(arr, BigInteger.ONE.intValue(), index);
            if(maxSize<nextSubSequenceSize){
                maxSize=nextSubSequenceSize;
            }
            index++;
        }
        return maxSize;
    }

    public static int nextSubSequenceSize(int[] arr,int currentSize, int index){
        int greaterValue=Integer.MIN_VALUE;
        int maxSize = currentSize;
        int nextSubSequenceSize=0;
        for (int i = index+1; i < arr.length; i++) {
            if(arr[index]<arr[i] && greaterValue==Integer.MIN_VALUE){
                greaterValue=arr[i];
                nextSubSequenceSize = nextSubSequenceSize(arr, currentSize + 1, i);
            }else if(arr[index]<arr[i] && arr[i]<greaterValue){
                greaterValue=arr[i];
                nextSubSequenceSize = nextSubSequenceSize(arr, currentSize + 1, i);
            }
            if(maxSize<nextSubSequenceSize){
                maxSize=nextSubSequenceSize;
            }
        }
        return maxSize;
    }
}

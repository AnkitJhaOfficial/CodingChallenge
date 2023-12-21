public class SortedRotatedArray {
    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(findMinimumInSortedRotatedArray(nums));
    }

    public static int findMinimumInSortedRotatedArray(int[] array){
        int start=0;
        int end = array.length-1;
        int mid=0;
        if(array[start]<array[end]){
            return array[start];
        }

        while (start<=end){
            mid=start+(end-start)/2;
            if(array[mid]>array[end]){
                start=mid+1;
            } else if (array[mid]<array[end]) {
                end=mid;
            }
            else {
                return array[mid];
            }
        }
        return array[mid];
    }
}

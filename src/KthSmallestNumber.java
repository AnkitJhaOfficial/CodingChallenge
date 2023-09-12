public class KthSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {7,10,4,20,15};
        int k=5;
        int kthSmallestNumber = findKthSmallestNumber(arr, k);
        System.out.println(kthSmallestNumber);
    }
    public static int findKthSmallestNumber(int[] array,int k){
        if(k>array.length/2){
            for (int i = 0; i < array.length-2; i++) {
                for (int j = 0; j < array.length-1-i; j++) {
                    if(array[j]>array[j+1]){
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
                if(array.length-i==k){
                    return array[k-1];
                }
            }
        }
        else {
            for (int i = 0; i < k; i++) {
                for (int j = array.length-1; j>i; j--) {
                    if(array[j-1]>array[j]){
                        int temp=array[j];
                        array[j]=array[j-1];
                        array[j-1]=temp;
                    }
                }
                if(i+1==k){
                    return array[k-1];
                }
            }
        }

        return -1;
    }
}

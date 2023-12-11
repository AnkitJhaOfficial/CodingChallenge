public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int n=4,k=4;
        int[] arr ={100,200,300,400};
        int i = maxSumSubArray(n, k, arr);
        System.out.println(i);
    }

    public static int maxSumSubArray(int n,int k,int[] arr){
        int maxSum;
        int tempSum=0;
        for (int i = 0; i < k; i++) {
            tempSum+=arr[i];
        }
        maxSum=tempSum;
        for (int i = k; i < n; i++) {
            tempSum+=arr[i];
            tempSum-=arr[i-k];
            if(tempSum>maxSum){
                maxSum=tempSum;
            }
        }
        return maxSum;
    }
}

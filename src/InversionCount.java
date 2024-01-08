public class InversionCount {
    public static void main(String[] args) {
        int n=5;
        int arr[] = {10,10,10};
        int inversionCount = getInversionCount(arr);
        System.out.println(inversionCount);
    }

    public static int getInversionCount(int[] arr){
        int inversionCount = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }
}

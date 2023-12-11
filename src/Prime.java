public class Prime {
    public static void main(String[] args) {
//        int n=5;
//        int[] arr={2,4,6,8,12};
        int n=3;
        int[] arr={1,5,7};
        int element = findMinimumValueOfElement(n, arr);
        System.out.println(element);
    }
    public static int findMinimumValueOfElement(int n,int[] arr){
        int sum=0;
        for (int ele: arr) {
            sum+=ele;
        }
        for (int i = sum; i < Integer.MAX_VALUE; i++) {
            if(isPrime(i)){
                return i-sum;
            }
        }
        return 0;
    }

    public static boolean isPrime(int number){
        for (int i = 2; i <number/2; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}

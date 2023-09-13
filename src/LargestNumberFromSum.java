public class LargestNumberFromSum {
    public static void main(String[] args) {
        int n=11;
        int s=99;
        long largestNumberFromSum =largestNumberFromSum(n, s);
        System.out.println(largestNumberFromSum);
    }

    public static long largestNumberFromSum(int digits,int sum){
        if(sum<=0 || digits<=0 || digits*9<sum){
            return -1;
        }
        long largestNumber=0;
        for (int i = 0; i < digits ; i++) {
            if(sum>=9){
                largestNumber=largestNumber*10+9;
                sum=sum-9;
            }
            else {
                largestNumber=largestNumber*10+sum;
                sum=0;
            }
        }
        return largestNumber;
    }
}

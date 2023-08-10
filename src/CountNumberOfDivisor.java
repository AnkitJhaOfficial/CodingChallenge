public class CountNumberOfDivisor {
    public static void main(String[] args) {
        int n=123;
        int numberOfDivisors = countNumberOfDivisors(n);
        System.out.println(numberOfDivisors);
    }
    public static int countNumberOfDivisors(Integer number){
        int count=0;
        int tempNum=number;
        for (int i = 0; i < number.toString().length(); i++) {
            int divisor=tempNum%10;
            tempNum/=10;
            if(number%divisor==0){
                count++;
            }
        }
        return count;
    }
}

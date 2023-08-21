public class ClosestDivisibleNumber {
    public static void main(String[] args) {
        int number=-15;
        int divisor=6;
        closestDivisibleNumberHavingMaxAbsolute(number,divisor);
    }
    public static void closestDivisibleNumberHavingMaxAbsolute(int number,int divisor){
        divisor=Math.abs(divisor);
        int closestNumber=0;
        if(number>=0 && divisor>0){
            if(number%divisor>=divisor/2d){
                closestNumber=number-(number%divisor)+divisor;
            }
            else {
                closestNumber=number-(number%divisor);
            }
        } else {
            if(Math.abs(number%divisor)>=divisor/2d){
                closestNumber=number-(number%divisor)-divisor;
            }
            else {
                closestNumber=number-(number%divisor);
            }
        }
        System.out.println(closestNumber);
    }
}

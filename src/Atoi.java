public class Atoi {
    public static void main(String[] args) {
//        String s="      -4193 w 1 ith words";
        String s = "-2147483648";
        int atoi = myAtoi(s);
        System.out.println(atoi);
    }

    public static int myAtoi(String s){
        boolean isNegetive=false;
        s=s.trim();
        if(s.isEmpty())
            return 0;
        if(s.charAt(0)=='-'){
            isNegetive=true;
            s=s.substring(1);
        }
        else if(s.charAt(0)=='+'){
            s=s.substring(1);
        }
        long number = s.chars().takeWhile(Character::isDigit)
                .mapToLong(value -> Character.digit(value,10))
                .reduce(0, (a, b) -> Math.min(a * 10 + b, Integer.MAX_VALUE + 1L));
        if(isNegetive){
            number=-number;
            if(number==Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        if(number==Integer.MAX_VALUE+1L){
            number=Integer.MAX_VALUE;
        }
        return (int)number;
    }
}

public class Atoi {
    public static void main(String[] args) {
        String s="      -4193 w 1 ith words";
        int atoi = myAtoi(s);
        System.out.println(atoi);
    }

    public static int myAtoi(String s){
        boolean isNegetive=false;
        s=s.trim();
        if(s.charAt(0)=='-'){
            isNegetive=true;
            s=s.substring(1);
        }
        else if(s.charAt(0)=='+'){
            s=s.substring(1);
        }
        int number = s.chars().takeWhile(Character::isDigit)
                .map(value -> Character.digit(value,10))
                .reduce(0, (a, b) -> a * 10 + b);
        if(isNegetive){
            number=-number;
        }
        return number;
    }
}

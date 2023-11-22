import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
//        String str = "pqr.mno";
        String resultString = reverseStringWithoutReversingWords(str );
        System.out.println(resultString);
    }

    public static String reverseStringWithoutReversingWords(String str ){
        String reverseString = Arrays.stream(str.split("\\.")).reduce("", (s, s2) -> s2.concat(".").concat(s));
        return reverseString.substring(0,reverseString.length()-1);
    }
}

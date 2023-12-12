import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {
        String str = "I am :IronnorI Ma, i";
        String newStr = removeSpecialCharacters(str);
        boolean palindrome = isPalindrome(newStr);
        System.out.println(palindrome);

    }

    private static boolean isPalindrome(String str) {
        int mid = (str.length() + 1) / 2;
        long count = IntStream.range(0, mid)
                .filter(index -> str.charAt(index) == str.charAt(str.length() - 1 - index)).count();
        return count >= mid;
    }

    public static String removeSpecialCharacters(String s) {
        StringBuilder sb = s.chars().filter(value -> Character.isAlphabetic(value) || Character.isDigit(value))
                .mapToObj(value -> (char) value).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        return sb.toString().toLowerCase();
    }
}

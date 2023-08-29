import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseCharacterInWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String reverseWordCharacter = reverseWordCharacter(s);
        System.out.println(reverseWordCharacter);
    }

    public static String reverseWordCharacter(String s) {
        return s != null ? Arrays.stream(s.split(" ")).map(word ->
                Arrays.stream(word.split("")).reduce((c1, c2) -> c2 + c1).get()
        ).collect(Collectors.joining(" ")) : null;
    }
}

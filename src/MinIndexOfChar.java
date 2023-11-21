import java.util.Optional;

public class MinIndexOfChar {
    public static void main(String[] args) {
        String str = "adcffaet";
        String patt = "onkl";
        int minIndexOfCharInString = minIndexOfCharInString(str, patt);
        System.out.println(minIndexOfCharInString);
    }

    public static int minIndexOfCharInString(String str, String patt) {
        int index = -1;
        Optional<Character> first = str.chars().mapToObj(value -> (char) value).filter(value -> patt.contains(value.toString())).findFirst();
        if (first.isPresent()) {
            index = str.indexOf(first.get());
        }

        return index;
    }
}

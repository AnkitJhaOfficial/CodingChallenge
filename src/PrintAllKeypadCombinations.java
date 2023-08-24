import java.util.ArrayList;
import java.util.List;

public class PrintAllKeypadCombinations {

    public static void main(String[] args) {
        int[] array = {2, 3, 4};
        allKeypadCombinations(array);
    }

    public static void allKeypadCombinations(int[] array) {
        List<String> alphabets = List.of("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ");
        List<String> alphabet = new ArrayList<>();
        for (int i : array) {
            alphabet.add(alphabets.get(i - 2));
        }
        keypadCombinations(alphabet, null, alphabet.size() - 1);
    }

    public static void keypadCombinations(List<String> alphabets, String combination, int start) {
        if (start < 0) {
            System.out.println(combination);
            return;
        }
        if (combination == null) {
            combination = "";
        }
        for (int i = 0; i < alphabets.get(start).length(); i++) {
            keypadCombinations(alphabets, alphabets.get(start).charAt(i) + combination, start - 1);
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class MapNumbersToAlphabets {
    public static void main(String[] args) {
//        String s = "1326#";
        String s = "10#11#12";
        String numbersStringToAlphabets = convertNumbersStringToAlphabetsUsingChar(s);
        System.out.println(numbersStringToAlphabets);
    }

    private static String convertNumbersStringToAlphabets(String s) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.length() > i + 2 && s.charAt(i + 2) == '#') {
                integerList.add(Integer.parseInt(s.substring(i, i + 2)));
                i += 2;
            } else {
                integerList.add(Character.digit(s.charAt(i),10));
            }
        }
        StringBuilder collect = integerList.stream().map(value -> (char) (value + 96))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        return collect.toString();
    }

    public static String convertNumbersStringToAlphabetsUsingChar(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray.length > i + 2 && charArray[i + 2] == '#') {
                int digit = Character.digit(charArray[i], 10) * 10 + Character.digit(charArray[i + 1], 10);
                stringBuilder.append( (char)('a' + digit - 1));
                i += 2;
            } else {
                int digit = Character.digit(charArray[i], 10);
                stringBuilder.append((char)('a' + digit - 1));
            }
        }
        return stringBuilder.toString();

    }
}

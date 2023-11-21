import java.util.List;

public class SmallestString {
    public static void main(String[] args) {
        String x = "abcd";
        String y = "xycd";
        int lengthOfSmallestString = findLengthOfSmallestString(x, y);
        System.out.println(lengthOfSmallestString);
    }

    static int findLengthOfSmallestString(String x, String y) {
        List<Character> commonCharacters = x.chars().mapToObj(value -> (char) value)
                .filter(value -> y.contains(value.toString()))
                .toList();

        int xCount = 1;
        int yCount = 1;
        List<Integer> xPositions = commonCharacters.stream().map(x::indexOf).toList();
        List<Integer> yPositions = commonCharacters.stream().map(y::indexOf).toList();

        for (int i = 0; i < xPositions.size() - 1; i++) {
            if (xPositions.get(i) < xPositions.get(i + 1)) {
                xCount++;
            }
        }
        for (int i = 0; i < yPositions.size() - 1; i++) {
            if (yPositions.get(i) < yPositions.get(i + 1)) {
                yCount++;
            }
        }
        int min = Math.min(xCount, yCount);
        return x.length() + y.length() - min;
    }

}

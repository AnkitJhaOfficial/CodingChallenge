import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String a = "allergy";
        String b = "allergic";
        boolean anagramString = isAnagramString(a, b);
        if (anagramString)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isAnagramString(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        } else {
            int[] array1 = a.chars().sorted().toArray();
            int[] array2 = b.chars().sorted().toArray();
            int compare = Arrays.compare(array1, array2);
            if (compare == 1) {
                return false;
            }
        }
        return true;
    }

}

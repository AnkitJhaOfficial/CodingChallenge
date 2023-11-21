public class KAnagram {
    public static void main(String[] args) {
        boolean kAnagram = isKAnagram("fodr", "gork", 2);
        System.out.println(kAnagram);
    }


    public static boolean isKAnagram(String str1, String str2, int k) {

        if (str1.length() != str2.length()) {
            return false;
        } else {
            long count = str1.chars().mapToObj(value -> (char) value).filter(value -> str2.contains(String.valueOf(value))).count();
            return k <= count;
        }
    }
}

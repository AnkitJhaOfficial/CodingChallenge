import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xyz";
        System.out.println(isIsomorphic(str1,str2));
    }

    public static boolean isIsomorphic(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        else {
            Map<Character,Character> characterMap = new HashMap<>();
            for (int i = 0; i < str1.length(); i++) {
                if (characterMap.get(str1.charAt(i))==null || characterMap.get(str1.charAt(i)).equals(str2.charAt(i))){
                    characterMap.put(str1.charAt(i),str2.charAt(i));
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}

public class PalindromicSubstring {
    public static void main(String[] args) {
        String s = "aaaabbaa";
        String palindromicSubstring = findPalindromicSubstring(s);
        System.out.println(palindromicSubstring);
    }

    public static String findPalindromicSubstring(String str){

        String palindromicString="";
        String subStr,revStr;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length(); j++) {
                subStr=str.substring(i,j);
                revStr=new StringBuilder(subStr).reverse().toString();
                if(subStr.equals(revStr) && subStr.length()>palindromicString.length()){
                    palindromicString=subStr;
                }
            }
        }
        return palindromicString;
    }

}

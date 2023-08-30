public class GoalParser {
    public static void main(String[] args) {
        String s="G()(al)";
        String result=goalStringParser(s);
        System.out.println(result);
    }

    public static String goalStringParser(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='G'){
                sb.append('G');
            } else if (s.charAt(i)=='(') {
                if(s.charAt(i+1)==')'){
                    sb.append('o');
                    i=i+1;
                }
                else if(s.substring(i,i+4).equals("(al)")){
                    sb.append("al");
                    i=i+3;
                }
            }
        }
        return sb.toString();
    }
}

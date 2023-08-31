public class AnagramStringCount{
    public static void main(String[] args) {
        String s1="bcadeh";
        String s2="hea";
        int countRemovedCharacter = countRemovedCharacter(s1, s2);
        System.out.println(countRemovedCharacter);
    }


    public static int countRemovedCharacter(String s1,String s2){
        int count=0;
        String result=s1+s2;
        int[] array = result.chars().sorted().toArray();
        for (int currentIndex = 0; currentIndex < array.length-1; currentIndex++) {
            if(array[currentIndex]==array[currentIndex+1]){
                count+=2;
                currentIndex++;
            }
        }
        return result.length()-count;
    }
}

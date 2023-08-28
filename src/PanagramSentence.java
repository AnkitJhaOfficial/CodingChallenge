import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PanagramSentence {
    public static void main(String[] args) {
        String sentence="leetcode";
        boolean panagramSentence = isPanagramSentence(sentence);
        System.out.println(panagramSentence);
    }

    public static boolean isPanagramSentence(String sentence){
        if(sentence.length()<26){
            return false;
        }
        Set<Character> collect = sentence.chars().collect(HashSet::new, (set, character) -> set.add((char)character), HashSet::addAll);
        return collect.size()>=26;
    }
}

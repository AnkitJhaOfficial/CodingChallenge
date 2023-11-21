import java.util.Stack;

public class BracketsPairs {
    public static void main(String[] args) {
        String expression = "{([])}";
        boolean balancedPairs = isBalancedPairs(expression);
        if(balancedPairs){
            System.out.println("balanced");
        }
        else {
            System.out.println("not balanced");
        }
    }

    public static boolean isBalancedPairs(String expression){
        Stack<Character> characterStack = new Stack<>();
        for (char character: expression.toCharArray()) {
            if(character == ']'){
                Character pop = characterStack.pop();
                if(pop.charValue()!='['){
                    return false;
                }
            }
            else if(character == ')'){
                Character pop = characterStack.pop();
                if(pop.charValue()!='('){
                    return false;
                }
            }
            else if(character == '}'){
                Character pop = characterStack.pop();
                if(pop.charValue()!='{'){
                    return false;
                }
            }
            else {
                characterStack.push(character);
            }
        }
        return true;
    }
}

import java.util.Stack;

/*Below Question was asked in ServiceNow - 2022, and MasterCard- 2021*/

public class ValidateBrackets {

    public static boolean validateBrackets(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if(stack.isEmpty() && (c.equals(')') || c.equals('}') || c.equals(']')))
                return false;
            else if (stack.isEmpty() && !c.equals(')') && !c.equals('}') && !c.equals(']')) {
                stack.push(c);
            }
            else if (stack.peek().equals('(') && c.equals(')')) {
                stack.pop();
            } else if (stack.peek().equals('{') && c.equals('}')) {
                stack.pop();
            } else if (stack.peek().equals('[') && c.equals(']')) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(validateBrackets("({[]})"));
        System.out.println(validateBrackets("({[]}))"));
        System.out.println(validateBrackets("]{}[]"));
        System.out.println(validateBrackets("({[{([])}]})"));
    }
}

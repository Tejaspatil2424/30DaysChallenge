import java.util.*;

public class Challenge11 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false; 
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test Case 1
        System.out.println(isValid("()"));  
        // Test Case 2
        System.out.println(isValid("([)]"));  
        // Test Case 3   
        System.out.println(isValid("[{()}]"));
        // Test Case 4   
        System.out.println(isValid(""));     
        // Test Case 5   
        System.out.println(isValid("{[}"));     
    }
}

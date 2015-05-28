import java.util.Stack;

/**
* Created by xueliang on 14-12-30.
*/
public class ValidParentheses {
    public boolean isValid(String s) {
        char[] tar = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (Character c : tar) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                char tmp = stack.pop();
                if (c - tmp != 1 && c - tmp != 2)
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}


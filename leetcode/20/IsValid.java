import java.util.*;

class Solution {
    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (this.mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of
                // '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return
                // false.
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

    public boolean isValid1(String s) {
        if(s.length()%2 != 0)
            return false;
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++)
        {
            // System.out.println("s.charAt("+i+") = " + s.charAt(i));
            // System.out.println("stack.isEmpty() = " + stack.isEmpty());
            // System.out.println("stack.toString() = " + stack.toString());
            // System.out.println("stack.peek()) = " + stack.peek());
            // System.out.println("s.charAt(i) == stack.peek() = " + (s.charAt(i) == stack.peek()));

            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                stack.push(s.charAt(i));
            }
            else if(!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '(') 
            {
                stack.pop();
            }
            else if(!stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{') 
            {
                stack.pop();
            }
            else if(!stack.isEmpty() && s.charAt(i) == ']' && stack.peek() == '[') 
            {   
                stack.pop();
            }else{
                return false;
            }
            //System.out.println("stack.toString()? = " + stack.toString());
            //System.out.println(" ");
        }
        //System.out.println(stack.toString());
        //System.out.println("stack.isEmpty() = "+stack.isEmpty());
        return stack.isEmpty();
    }
}

public class IsValid{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.isValid1("(])"));
    }
}
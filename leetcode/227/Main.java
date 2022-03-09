import java.util.*;

class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.calculate("3+2*2"));
        System.out.println(sl.calculate("4+3*2"));

        // Solution1 sl_1 = new Solution1();
        // System.out.println(sl_1.calculate("3+2*2"));

        //Solution1 sl_1 = new Solution1();
        //System.out.println(sl_1.calculate("4+3*2"));
    }
}

// class Solution {
//     public int calculate(String s) {

//         if (s == null || s.isEmpty())
//             return 0;
//         int len = s.length();
//         Stack<Integer> stack = new Stack<Integer>();
//         int currentNumber = 0;
//         char operation = '+';
//         for (int i = 0; i < len; i++) {
//             char currentChar = s.charAt(i);
//             if (Character.isDigit(currentChar)) {
//                 currentNumber = (currentNumber * 10) + (currentChar - '0');
//             }
//             if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == len - 1) {
//                 if (operation == '-') {
//                     stack.push(-currentNumber);
//                 } else if (operation == '+') {
//                     stack.push(currentNumber);
//                 } else if (operation == '*') {
//                     stack.push(stack.pop() * currentNumber);
//                 } else if (operation == '/') {
//                     stack.push(stack.pop() / currentNumber);
//                 }
//                 operation = currentChar;
//                 currentNumber = 0;
//             }
//         }
//         int result = 0;
//         while (!stack.isEmpty()) {
//             result += stack.pop();
//         }
//         return result;
//     }

// }

class Solution {
    public int calculate(String s) {
        if (s == null || s.isEmpty())
            return 0;
        int length = s.length();
        int currentNumber = 0, lastNumber = 0, result = 0;
        char operation = '+';
        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }
            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
                if (operation == '+' || operation == '-') {
                    result += lastNumber;
                    lastNumber = (operation == '+') ? currentNumber : -currentNumber;
                } else if (operation == '*') {
                    lastNumber = lastNumber * currentNumber;
                } else if (operation == '/') {
                    lastNumber = lastNumber / currentNumber;
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        result += lastNumber;
        return result;
    }
}
    

// class Solution1 {
//     public int calculate(String s) {
//         if (s == null || s.isEmpty())
//             return 0;
//         int length = s.length();
//         int currentNumber = 0, lastNumber = 0, result = 0;
//         char operation = '+';
//         for (int i = 0; i < length; i++) {
//             char currentChar = s.charAt(i);
//             if (Character.isDigit(currentChar)) {
//                 currentNumber = (currentNumber * 10) + (currentChar - '0');
//             }

//             // if(i == length - 1)
//             {
//                 System.out.println("before =============");
//                 System.out.println("i = " + i);
//                 System.out.println("char = " + currentChar);
//                 System.out.println("currentNumber = " + currentNumber);
//                 System.out.println("lastNumber = " + lastNumber);
//                 System.out.println("operation = " + operation);
//                 System.out.println("result = " + result);
//             }

//             if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
//                 if (operation == '+' || operation == '-') {
//                     result += lastNumber;
//                     lastNumber = (operation == '+') ? currentNumber : -currentNumber;
//                 } else if (operation == '*') {
//                     lastNumber = lastNumber * currentNumber;
//                 } else if (operation == '/') {
//                     lastNumber = lastNumber / currentNumber;
//                 }
//                 operation = currentChar;
//                 currentNumber = 0;
//             }

//             {
//                 System.out.println("after =============");
//                 System.out.println("char = " + currentChar);
//                 System.out.println("currentNumber = " + currentNumber);
//                 System.out.println("lastNumber = " + lastNumber);
//                 System.out.println("operation = " + operation);
//                 System.out.println("result = " + result);
//                 System.out.println("==============");
//             }
//         }
//         result += lastNumber;
//         return result;
//     }
// }
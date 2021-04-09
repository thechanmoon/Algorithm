class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    public MinStack() {
        
    }
    
    public void push(int val) {     
        if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(min.peek().equals(stack.peek())){
            min.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
/*
// Java program to implement a stack that supports
// getMinimum() in O(1) time and O(1) extra space.
import java.util.*;
 
// A user defined stack that supports getMin() in
// addition to push() and pop()
class MyStack
{
    Stack<Integer> s;
    Integer minEle;
 
    // Constructor
    MyStack() { s = new Stack<Integer>(); }
 
    // Prints minimum element of MyStack
    void getMin()
    {
        // Get the minimum number in the entire stack
        if (s.isEmpty())
            System.out.println("Stack is empty");
 
        // variable minEle stores the minimum element
        // in the stack.
        else
            System.out.println("Minimum Element in the " +
                               " stack is: " + minEle);
    }
 
    // prints top element of MyStack
    void peek()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty ");
            return;
        }
 
        Integer t = s.peek(); // Top element.
 
        System.out.print("Top Most Element is: ");
 
        // If t < minEle means minEle stores
        // value of t.
        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }
 
    // Removes the top element from MyStack
    void pop()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
 
        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();
 
        // Minimum will change as the minimum element
        // of the stack is being removed.
        if (t < minEle)
        {
            System.out.println(minEle);
            minEle = 2*minEle - t;
        }
 
        else
            System.out.println(t);
    }
 
    // Insert new number into MyStack
    void push(Integer x)
    {
        if (s.isEmpty())
        {
            minEle = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }
 
        // If new number is less than original minEle
        if (x < minEle)
        {
            s.push(2*x - minEle);
            minEle = x;
        }
 
        else
            s.push(x);
 
        System.out.println("Number Inserted: " + x);
    }
};
 
// Driver Code
public class Main
{
    public static void main(String[] args)
    {
        MyStack s = new MyStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}
*/
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

 /*package whatever //do not write package name here */
 
// import java.io.*;
// import java.util.*;
// class MinStack {
    // Stack<Node> s;
    //  
    // class Node{
        // int val;
        // int min;
        // public Node(int val,int min){
            // this.val=val;
            // this.min=min;
            //  
        // }
        //  
    // }
//  
    // /** initialize your data structure here. */
    // public MinStack() {
        // this.s=new Stack<Node>();
    // }
    // public void push(int x) {
        // if(s.isEmpty()){
            // this.s.push(new Node(x,x));
        // }else{
            // int min=Math.min(this.s.peek().min,x);
            // this.s.push(new Node(x,min));
        // }   
    // }  
    // public int pop() {
    //  
            // return this.s.pop().val;  
    // }
    // public int top() {
        //  
            // return this.s.peek().val;  
    // }
    //  public int getMin() {
        //  
            // return this.s.peek().min;   
    // }
// }
//  
//  
// class GFG {
//    
//    
//  
    // public static void main (String[] args) {
    //   MinStack s=new MinStack();
    //   s.push(-1);
    //   s.push(10);
    //   s.push(-4);
    //   s.push(0);
    //   System.out.println(s.getMin());
    //   System.out.println(s.pop());
    //   System.out.println(s.pop());
    //   System.out.println(s.getMin());
    //    
    //    
    // }
// }
//time O(1);
//it takes o(n) space since every node has to remember min value
//this code is contributed by gireeshgudaparthi
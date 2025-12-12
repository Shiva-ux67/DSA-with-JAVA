package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the parentheses: ");
        String str = sc.nextLine();
        sc.close();
        boolean valid = isValid(str);
        System.out.println("This is a Valid Parentheses : " + valid);
    }
    static  boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if(stack.isEmpty()){
                stack.push(curr);
            }else{
                char top = stack.peek();
                if(curr == ')' &&  top == '(' ||
                        curr == ']' && top == '[' ||
                        curr == '}' && top == '{' ){
                    stack.pop();
                }
                else{
                    stack.push(curr);
                }
            }
        }
        return stack.isEmpty();
    }
}

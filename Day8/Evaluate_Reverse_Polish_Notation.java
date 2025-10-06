package Day8;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int evalRPN(String[] tokens) {
        return value(tokens);
        
    }
    public static boolean isInteger(String s){
        return s.matches("^[+-]?\\d+$");
    }
    public static int value(String[] arr){
        Stack<Integer> stack = new Stack<>();
        for(String item:arr){
            if(isInteger(item)){
                stack.push(Integer.parseInt(item));
            }
            else {
                int b = stack.pop();
                int a = stack.pop();
                switch(item){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }
                    

                
            }
        }
        return stack.pop();
    }

}

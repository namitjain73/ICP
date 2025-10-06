package Day8;

import java.util.Stack;

public class Online_Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1]; // Add popped span
        }
        stack.push(new int[]{price, span}); // Store price and span
        return span;
    }

}

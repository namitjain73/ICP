package Day8;

import java.util.Stack;

public class Simplify_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String simplifyPath(String path) {
        path += "/";
        Stack<String> st = new Stack<>();
        String curr = "";


        for(char c : path.toCharArray()){
            if(c == '/'){
                if(curr.equals("..")){
                    if(!st.empty()){
                        st.pop();
                    }
                    curr = "";
                }
                if(curr.length() != 0 && !curr.equals(".")){
                    st.push(curr);
                }
                curr = "";
            }
            else{
                curr += Character.toString(c);
            }
        }

        Stack<String> st2 = new Stack<>();
        while(!st.empty()){
            st2.push(st.pop());
        }
        String s1 = "";

        while(!st2.empty()){
            s1 += "/" ;
            s1+= st2.pop();
        }

        if(s1.length() == 0) return "/";
        return s1;
        
    }

}

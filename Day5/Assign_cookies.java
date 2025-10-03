package Day5;

import java.util.Arrays;

public class Assign_cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] g = {1,2,3};
		int[] s = {1,1};
		System.out.println(findContentChildren(g, s));

	}
	public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        int c = 0;
        for(int i = 0 ; i < g.length ; i++){
            while(j < s.length && s[j] < g[i]){
                j++;
            }

            if(j == s.length) return c;
            c++;
            j++;

        }
        return c;
    }

}

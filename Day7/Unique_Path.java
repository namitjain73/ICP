package Day7;

import java.util.Arrays;

public class Unique_Path {
	static int ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 7;
		System.out.println(uniquePaths(m, n));
	}
    public static int uniquePaths(int m, int n) {
        ans = 0;
        int[][] dp = new int[m][n];
        for(int[] d : dp){
            Arrays.fill(d,-1);
        }
        ans = solver(m,n,0,0,dp);
        return ans;        
    }
    public static int solver(int m , int n , int cr , int cc,int[][] dp){
        if(cr == m-1 && cc == n-1){
            return 1;
        }
        if(cr == m || cc == n) return 0;
        if(dp[cr][cc] != -1)return dp[cr][cc];
        int ans= 0;
        ans += solver(m,n,cr,cc+1,dp);
        ans += solver(m,n,cr+1,cc,dp);
        return dp[cr][cc] = ans;
    }

}

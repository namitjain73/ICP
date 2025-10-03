package Day6;

public class word_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {
			    {'A','B','C','E'},
			    {'S','F','C','S'},
			    {'A','D','E','E'}
			};
		String word = "ABCCED";
		System.out.println(exist(board,word));

	}
	
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0 ; i < m ; i++){
            for(int j  = 0 ; j < n ; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean ans = solver(board,word,i,j,0);
                    if(ans) return ans;
                }
            }
        }
        return false;
    }
    public static boolean solver(char[][] board , String t , int cr , int cc, int idx){
        if(cc < 0 || cr < 0 || cr >= board.length || cc >= board[0].length || board[cr][cc] != t.charAt(idx)) return false;
        if(idx == t.length()-1){
            return true;
        }

        if(idx > t.length()) return false;


        char ch = board[cr][cc];
        board[cr][cc]= '*';
        boolean up = solver(board,t,cr+1,cc,idx+1);
        boolean down = solver(board,t,cr-1,cc,idx+1);
        boolean left = solver(board,t,cr,cc+1,idx+1);
        boolean right = solver(board,t,cr,cc-1,idx+1);
        board[cr][cc] = ch;
        return up || down || left || right;

    }

}

package Day3;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(matrix));

	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>  arrl = new ArrayList<>();
        int c = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int minc = 0;
        int minr = 0;
        int maxc = matrix[0].length-1;
        int maxr = matrix.length-1;
        while(c < m*n){
            for(int i = minc ; i <= maxc && c < m*n; i++){
                arrl.add(matrix[minr][i]);
                c++;
            }
            minr++;
            for(int i = minr ; i <= maxr && c < m*n; i++){
                arrl.add(matrix[i][maxc]);
                c++;
            }
            maxc--;
            for(int i = maxc ; i >= minc && c < m*n; i--){
                arrl.add(matrix[maxr][i]);
                c++;
            }
            maxr--;
            for(int i = maxr ; i >= minr && c < m*n; i--){
                arrl.add(matrix[i][minc]);
                c++;
            }
            minc++;
        }
        return arrl;
        
    }

}

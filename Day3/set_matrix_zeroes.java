package Day3;

public class set_matrix_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		setZeroes(matrix);
		for(int i[] : matrix) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
    public static void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i = 0 ; i <m ; i ++){
            for(int j = 0 ; j < n ; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0 ; i <m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }


    }
}

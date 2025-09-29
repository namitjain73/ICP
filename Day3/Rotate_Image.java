package Day3;

public class Rotate_Image {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		for(int i[] : matrix) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
    public static void rotate(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for(int i =  0 ;i < m ; i++){
            for(int j = i+1 ; j < n ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // n--;

        while(n-- > 0){
            int lo = 0;
            int hi = m-1;
            while(lo  < hi){
                int temp = arr[n][lo];
                arr[n][lo] = arr[n][hi];
                arr[n][hi] = temp;
                lo++;
                hi--;
            }
        }
    }

}

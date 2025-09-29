package Day3;

public class Search_a_2D_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;

		
		System.out.println(Search_traget(matrix,target));
	}


    public static boolean Search_traget(int[][] arr,int t){
        int n = arr.length;
		int m = arr[0].length;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				if(arr[i][j] == t){
                    return true;
                }
			}
		}
        return false;
    }

}

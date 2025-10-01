package Day5;

import java.util.Arrays;

public class Non_overllapping_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
		System.out.println(eraseOverlapIntervals(intervals));

	}
	public static int eraseOverlapIntervals(int[][] intervals) {
        return room(intervals);
        
    }
    public static int room(int[][] arr) {
		Arrays.sort(arr , (a,b) -> Integer.compare(a[1],b[1]));
		int over = 0;
        int str = arr[0][0];
        int end = arr[0][1];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i][0] < end){
                over++;
            }
            else{
                end = arr[i][1];
            }
        }
        return over;		
	}

}

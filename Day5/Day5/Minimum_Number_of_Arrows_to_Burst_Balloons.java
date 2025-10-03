package Day5;

import java.util.Arrays;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = {
			    {10, 16},
			    {2, 8},
			    {1, 6},
			    {7, 12}
			};
		System.out.println(findMinArrowShots(points));

	}
	public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));

        int c = 1;
        int pre = points[0][1];
        for(int i = 1 ; i < points.length ; i++){
            if(points[i][0] > pre){
                c++;
                pre = points[i][1];
            }
        }
        return c;
        
    }

}

package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class queue_reconstruction_by_height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] people = {
			    {7, 0},
			    {4, 4},
			    {7, 1},
			    {5, 0},
			    {6, 1},
			    {5, 2}
			};
		
		reconstructQueue(people);


	}
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0] == b[0]) return a[1] - b[1];
            return b[0]- a[0];
        });
        List<int[]> ll = new ArrayList<>();
        for(int[] p : people){
            ll.add(p[1],p);
        }
        return ll.toArray(new int[ll.size()][2]);
    }

}

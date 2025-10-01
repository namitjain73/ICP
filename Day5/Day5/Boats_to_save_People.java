package Day5;

import java.util.Arrays;

public class Boats_to_save_People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] people = {1,2};
		int limit = 3;
		System.out.println(numRescueBoats(people, limit));

	}
	
	public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count= 0 ;
        int start = 0;
        int end = people.length-1;
        while(start < end){
            if(people[end] == limit){
                count++;
                end--;
            }
            else{
                int sum = people[start] + people[end];
                if(sum == limit){
                    end--;
                    start++;
                    count++;
                }
                else if(sum > limit){
                    end--;
                    count++;
                }
                else{
                    end--;
                    start++;
                    count++;
                }
            }
        }
        if(end == start && people[end] <= limit) count++;
        return count;
    }

}

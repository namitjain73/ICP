package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1,2,7,6,1,5};
		int target = 8;
		System.out.println(combinationSum2(arr,target));

	}
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        solver(candidates,target,list,ll,0);
        return ll;
    }
    public static void solver(int[] arr , int t ,List<Integer> list , List<List<Integer>> ll , int idx){
        if(t == 0){
            ll.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx ; i < arr.length ; i++){
            if(i > idx && arr[i-1] == arr[i]) continue;
            if(t >= arr[i]){
                list.add(arr[i]);
                solver(arr,t-arr[i],list,ll,i+1);
                list.remove(list.size()-1);
            }
        }
    }

}

package Day6;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4 ; 
		int k = 2;
		System.out.print(combine(n,k));

	}
	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solver(n,k,list,ll,1);
        return ll;
    }
    public static void solver(int n , int k ,List<Integer> list ,  List<List<Integer>> ll , int idx){
        if(list.size() == k){
            ll.add(new ArrayList<>(list));
            return;
        }


        for(int i = idx ; i <= n ; i++){
            list.add(i);
            solver(n,k,list,ll,i+1);
            list.remove(list.size()-1);
        }
    }

}

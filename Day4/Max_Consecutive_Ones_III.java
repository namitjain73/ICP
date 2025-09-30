package Day4;

public class Max_Consecutive_Ones_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		System.out.println(longestOnes(nums, k));

	}
	
	public static int longestOnes(int[] nums, int k) {
        int ans = 0;
        int l = 0;
        int zero = 0;
        for(int r = 0 ; r < nums.length ; r++){
            if(nums[r] == 0) zero++;

            while(zero > k){
                if(nums[l] == 0) zero--;
                l++;
            }

            ans = Math.max(ans,r-l+1);
        }
        return ans;
        
    }

}

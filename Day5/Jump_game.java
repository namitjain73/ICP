package Day5;

public class Jump_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,1,4};
		System.out.println(canJump(arr));
	}
	public static boolean canJump(int[] nums) {
        int jump = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(jump < i) return false;
            jump = Math.max(jump,i+nums[i]);
        }
        return true;
    }

}

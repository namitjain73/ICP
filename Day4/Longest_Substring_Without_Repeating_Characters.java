package Day4;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;

        int[] arr =new int[256];

        int max = 0;

        while(r < s.length()) {
            int ch = s.charAt(r);
            arr[ch]++;
            while(arr[ch] > 1) {
                arr[s.charAt(l)]--;
                l++;
            }
            

            max = Math.max(max, r - l+ 1);
            r++;
        }

        return max;
        
    }

}

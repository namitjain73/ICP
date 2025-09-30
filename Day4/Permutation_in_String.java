package Day4;

public class Permutation_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab";
		String s2 = "eidbaooo";
		System.out.println(checkInclusion(s1, s2));

	}
	
	public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(m < n ){
            return false;
        }
        int[] map1 = new int[26];
        for(int i = 0 ; i  < n ; i ++){
            map1[s1.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i <= m-n  ; i++){
            int[] map2 = new int[26];
            for(int j = 0 ; j < n ; j++){
                map2[s2.charAt(i+j) - 'a']++;
            }
            if(isyes(map1,map2)){
                return true;
            }
        }
        return false;
        
    }
    
    public static boolean isyes(int[] arr1,int[] arr2){
        for(int i = 0 ; i < 26 ; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

}

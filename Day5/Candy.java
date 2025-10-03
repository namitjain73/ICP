package Day5;

public class Candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,2};
		System.out.println(candy(arr));

	}
	public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = 1;
        for(int i=1 ; i < n ; i++){
            if(ratings[i-1] < ratings[i]){
                pre[i] = pre[i-1]+1;
            }else{
                pre[i] = 1;
            }
        }
        suf[n-1] = 1;
        for(int i = n-2 ; i >= 0 ; i--){
            if(ratings[i+1] < ratings[i]){
                suf[i] = suf[i+1]+1;
            }else suf[i] = 1;
        }

        int sum = 0;
        for(int i = 0 ;i < n ; i++){
            sum += Math.max(pre[i],suf[i]);
        }
        return sum;



    }

}

package Day5;

public class Gas_station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas, cost));

	}
	public static int canCompleteCircuit(int[] gas, int[] cost) {
        int p = 0;
        for(int i = 0; i < gas.length ; i++){
            p = p + gas[i] - cost[i];
        }
        if(p < 0)  return -1;

        int curr = 0;
        int idx= 0;
        for(int i = 0 ; i < gas.length ; i++){
            curr += gas[i]-cost[i];
            if(curr < 0){
                curr = 0;
                idx= i+1;
            }
        }
        return  idx;
    }

}

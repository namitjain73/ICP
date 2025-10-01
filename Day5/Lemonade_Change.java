package Day5;

public class Lemonade_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bills = {5,5,5,10,20};
		System.out.println(lemonadeChange(bills));

	}
	public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int i = 0 ;  i  < bills.length ; i++){
            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10){
                five--;
                ten++;
            }

            else if(bills[i] == 20){
                five--;
                if(ten == 0){
                    five -= 2;
                }
                else{
                    ten--;
                }
            }
            if(five < 0){
                return false;
            }
            else if(ten < 0){
                return false;
            }
        }
        return true;
        
    }

}

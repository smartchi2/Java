public class CalculateRidersReturns{
	
	public int amountPerParcel(int calculateRiderPay){
         
         if(calculateRiderPay < 0){
		return "invalid input";
		}
	else if(calculateRiderPay < 50 ){
		return  calculateRiderPay * 160 + 5000;
		}
	else if(calculateRiderPay >= 50){
		return  calculateRiderPay * 200 + 5000;
		}
	else if(calculateRiderPay >= 60){
		return  calculateRiderPay * 250 + 5000;
		}
	else if(calculateRiderPay > 70){
		return  calculateRiderPay * 500 + 5000;
		}
	else: amountPerParcel;
		System.out.print(calculateRiderPay);
	}
}
public class RidersWage{
	public static int calculateRidersWage(int successfulDelivery){
		int amountPerParcel;

		if(successfulDelivery < 50){
			amountPerParcel = 160;

		} else if(successfulDelivery < 60){
			amountPerParcel = 200;

		} else if(successfulDelivery < 70){
			amountPerParcel = 250;
			
		} else {
			amountPerParcel = 500;
			}

		return(successfulDelivery * amountPerParcel) + 5000;
		};
		public static void main(String...args){
		int successfulDelivery = 80;
    		int wage = calculateRidersWage(successfulDelivery);
		System.out.println("Rider's wage for the day:" + wage);
 	}
	
}
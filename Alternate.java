import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alternate {
    private static String cardNumber;
    private static String cardType;
    private static String isValid;
    //private static String 
    //private static int sumofoddnumber;
    
    static List<Integer> cardNumber1 = new ArrayList<>();

    public static void main(String[] args) {
        parameter();
        //multiplicarray();
        
     }


       public static void parameter() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Please enter name of card holder");
        String cardHolder = scanner.nextLine();
        
        System.out.println("Enter your card number for verification: ");
        String cardsNumber = scanner.nextLine();
       
         if(isValid(cardNumber)){
        String cardsNumber1i = cardType(cardsNumber);
        if(!cardType.equals("Unkown"));
          System.out.println("Valid" + cardType + "card");
       	}
	else{
         System.out.println("Invalid card inputted");
        }
       System.out.println("The numbers of digit inputted is" + cardsNumber);
       
       //}else{     
       System.out.println("The numbers entered is invild");
	
       

       
        
        //public static String getcardtype(string getcardtype);
        if (cardsNumber.charAt(0) == '3' && cardsNumber.charAt(1) == '7') {
            cardType = "American express cards";
        } else if (cardsNumber.charAt(0) == '5') {
            cardType = "Mastercard";
        } else if (cardsNumber.charAt(0) == '6') {
            cardType = "Discover cards";
        } else if (cardsNumber.charAt(0) == '4') {
            cardType = "visa cards";
        } else {
            cardType = "invalid card";
        }
        System.out.println("The credit card type: "+ cardType);
        System.out.println("The credit card number is:"+ cardsNumber);
        System.out.println("The name on the card is: "+ cardHolder);
        
    }

    
    
    public static boolean isvalid(String cardsNumber) {
        int cardnumberasstring = Integer.parseInt(cardsNumber);
         int sum;
         boolean alternate = false;
        for(int i = cardsNumber.length() - 2; i >= 0; i--){
            int digit = Integer.parseInt(String.valueOf(cardsNumber.charAt(i)));
            if(alternate){
              digit *=2;
            if(digit > 9){
                digit = (digit % 10) + 1;
             }
           }
          sum += digit;
         alternate = !alternate;
         }
        return (sum % 10 == 0);
        int lengthOfNumber = cardsNumber.length();
        System.out.println("the credit card length is:  " + lengthOfNumber);
      }  
        
    }


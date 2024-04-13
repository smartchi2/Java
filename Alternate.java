import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alternate{
 Scanner input = new Scanner(System.in);
   
   //5399831619690403, 4388576018402626
   public String cardType(String card){
    String type = "";
    if(card.charAt(0) == '4'){
     type = "Visa Card";
	}
    else if(card.charAt(0) == '5'){
	type = "MasterCard";
	}
    else if(card.charAt(0) == '3' && card.charAt(1) == '7'){
	type = "American Expresss Card";
	}
    else if(card.charAt(0) == '6'){
	type = "Discover card";
	}
    else type = "invalid card";
	return type;
	}

    public int calculator1( String cardNumbers){
	int result = 0;
	for(int index = cardNumbers.length() - 1; index >= 0; index--){
	var cardValue = Integer.parseInt(String.valueOf(cardNumbers.charAt(index))) * 2;
	if (index % 2 == 0 && cardValue < 10){
	result += cardValue;
	}
	}
	return result;
	}

    public int calculator2(String cardNumbers){
	int result = 0;
	for(int index = cardNumbers.length() - 1; index >= 0; index--){
	var cardValue = Integer.parseInt(String.valueOf(cardNumbers.charAt(index))) * 2;
	if (index % 2 == 0 && cardValue >= 10){	
		String secondValue = String.valueOf(cardValue);
		for(int index1 = 0; index1 < secondValue.length(); index1++){
		var cardValue1 = Integer.parseInt(String.valueOf(secondValue.charAt(index1)));
		result += cardValue1;}
	}
	}
	return result;
	}
	
	public int calculator3( String cardNumbers){
	int result = 0;
	for(int index = cardNumbers.length() - 1; index >= 0; index--){
	if (index % 2 != 0){
	var cardValue = Integer.parseInt(String.valueOf(cardNumbers.charAt(index)));
	result += cardValue;
	}
	}
	return result;
	}
	
	public void creditCardValidator(){
        System.out.println("Hello, Kindly Enter Card To verify: ");
        long number = input.nextLong();
	 String converter = "";
	String creditCard = converter + number;
        String type = cardType(creditCard), validType = "";
        int cardLength = creditCard.length();
        if (cardLength >=13 && cardLength <=16) {
        int total = calculator1(creditCard) + calculator2(creditCard) + calculator3(creditCard), lengthChecker = creditCard.length();
        if (total % 10 == 0){
            validType = "valid";
        }else {
            validType = "invalid";
        }
            System.out.println("**************************\n" +
                    "****** Credit Card Type: " + type + "\n" +
                    "****** Credit Card Number: " + creditCard + "\n" +
                    "****** Credit Card Digit Length: " + cardLength + "\n" +
                    "****** Credit Card Digit Validity Status: " + validType + "\n" +
                    "**************************");
        }
            else System.out.println("invalid card length");
        }

    public static void main(String...args){
	Alternate alternate = new Alternate();
   	alternate.creditCardValidator();
	
	}
        
    }


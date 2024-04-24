import java.util.*;
public class AssDrilling3{
	public static void main(String...args){
	int[] scores = new int[10];
	Scanner input = new Scanner(System.in);
	
	for(int counter = 0; counter < 10; counter++){
	System.out.println("Enter your scores: ");
	int score = input.nextInt();
	scores[counter] = score;
	//print.nextLine();
	}
	
	System.out.println("The scores entered are: ");
	for(int counter2 = 0; counter2 < 10; counter2++){
	System.out.printf("%4d",scores[counter2]);
	}
 }
}
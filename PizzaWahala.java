import java.util.*;
public class PizzaWahala{
 	public static void main(String[]  args){

 	Scanner pizza = new Scanner(System.in);

 // private static  List<int> box1List = new ArrayList<>();
 // private static List<
  
// System.out.printf(%s%20s%"""
                      // Our Price And Size List.......................................................................
                      // PIZZA  TYPE       NUMBER  OF  SCLICES     PRICE  PER  BOX
                      // Sapa   Size	                           4		       2,000
                       //Small Money	                           6		       2,400
                  	   //Big Boys	                           8		       3,000
                  	   //Odogwu		        12  		        4,000

  		//""")


	System.out.println("Our Price And Size List.......................................................................");
	System.out.printf("%s %50s %30s%n", "PIZZA TYPE ", "NUMBER OF SLICE" ,"PRICE PER BOX");

	
	System.out.println("Enter Pizza Type:  ");
	String pizzaType  = pizza.nextLine();

	System.out.println("Enter number of slices you want:  ");
	int slice = pizza.nextInt();

	System.out.println("How many box of pizza do you want:  ");
	int box1 = pizza.nextInt();

	System.out.println("Enter the price per box: ");
	int price = pizza.nextInt();
	

	System.out.println("How many guest are to be served: ");
	int servedGuest= pizza.nextInt();


	int numberOfSlice = slice * box1;


	int boxNumber = box1 * price;

	//int numberOfSlice = boxNumber *slice;

	
	int remainedSlice = numberOfSlice - servedGuest;

	if(servedGuest > slice){
		System.out.println("the guest greaterthan pizza slice");
	};



	
	System.out.printf("the box number is : %d%n",+boxNumber);

	System.out.printf("the number of slice is  : %d%n",+numberOfSlice );



	

	System.out.printf("the remained slice is: %d", +remainedSlice);
	

	
 	
	
 }
}
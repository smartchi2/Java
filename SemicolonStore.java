import java.util.*;
import java.text.SimpleDateFormat;
public class SemicolonStore{

	private static Scanner scanner = new Scanner(System.in);
	private static Scanner scannerInt = new Scanner(System.in);
	private static List<String> itemNameList = new ArrayList<>();
	private static List<Integer> itemQuantityList = new ArrayList<>();
	private static List<Double> itemPriceList = new ArrayList<>();
	private static List<Double> itemTotalList = new ArrayList<>();
	private static String customersName;
	private static String cashiersName;
	private static int discount;
	private static double discountAmount;
	private static double subTotal;
	private static double vat;
	private static double billTotal;
	private static double amountGiven;


	public static void main(String ...args){
		collectInput();
		System.out.println(itemNameList);
		System.out.println(itemQuantityList );
		System.out.println(itemPriceList );
		displayOutput();

	}

	public static void collectInput(){
		System.out.println("What is the customer's Name");
		customersName = scanner.nextLine();


		System.out.println("What did the user buy? ");
		String itemName = scanner.nextLine();
		itemNameList.add(itemName);

		
		System.out.println("How many pieces? ");
		int quantity= scannerInt .nextInt();
		itemQuantityList.add(quantity);

		
		System.out.println("How much per unit? ");
		double price= scannerInt .nextDouble();
		itemPriceList.add(price);

		
		System.out.println("Add more Items? ");
		String response = scanner.nextLine();

		
		while(response.equals("yes") || response.equals("YES") || response.equals("Yes")){
			System.out.println("What did the user buy? ");
			itemName = scanner.nextLine();
			itemNameList.add(itemName);
		

			System.out.println("How many pieces? ");
			quantity= scannerInt.nextInt();
			itemQuantityList.add(quantity);
		

			System.out.println("How much per unit? ");
			price= scannerInt.nextDouble();
			itemPriceList.add(price);
		

			System.out.println("Add more Items? ");
			response = scanner.nextLine();

		}
		System.out.println("What is the your Name");
		cashiersName= scanner.nextLine();


		System.out.println("How much discount will the customer get? ");
		discount = scannerInt.nextInt();

		
	}
		public static void displayOutput(){
			String pattern = "dd-MMM-yy hh:mm:ss";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date = simpleDateFormat.format(new Date());
			String equalsTo = "=".repeat(60);
			String hyphen = "-".repeat(60);
			
			firstPrint();
			
			System.out.printf("THIS IS NOT AN RECEIPT KINDLY PAY %.2f\n", billTotal);
			System.out.println(equalsTo);
			
			System.out.println("How much did the customer give to you? ");
			amountGiven= scannerInt.nextInt();
			secondPrint();

			
		}
		public static void firstPrint(){
			String pattern = "dd-MMM-yy hh:mm:ss";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date = simpleDateFormat.format(new Date());
			String equalsTo = "=".repeat(60);
			String hyphen = "-".repeat(60);
			System.out.printf("""
				SEMICOLON STORES
				MAIN BRANCH
				LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
				TEL: 03293828343
				Date: %s
				Cashier: %s
				Customer Name: %s
				%s
				\t\tITEM\tQTY\tPRICE\t\tTOTAL(NGN)
				%s
					""",date,cashiersName,customersName,equalsTo, hyphen  );
			for(int i = 0; i < itemQuantityList.size(); i++){
				double total = itemQuantityList.get(i) * itemPriceList.get(i);
				itemTotalList.add(total);
				System.out.printf("""
				\t%s\t\t%d\t%.2f\t%.2f
						""",itemNameList.get(i),itemQuantityList.get(i), itemPriceList.get(i), total  );
			}
			System.out.println(hyphen);
			calculateSubTotal();
		}

		public static void calculateSubTotal(){
			String equalsTo = "=".repeat(60);
			double total = 0;
			for(int i = 0; i < itemQuantityList.size(); i++){
				total += itemTotalList.get(i);
			}
			subTotal = total;
			discountAmount = subTotal / 100 * discount;
			vat = subTotal / 100 * 17.5;
			billTotal = subTotal - discountAmount + vat;
			System.out.printf("""
				\t\t\tSub Total:\t%.2f
				\t\t\tDiscount:\t%.2f
				\t\t\tVat @ 17.50:\t%.2f
				%s
				\t\t\tBill Total:\t%.2f
				%s
				







					""",total, discountAmount, vat, equalsTo, billTotal,equalsTo );
		}
		public static void secondPrint(){
			String equalsTo = "=".repeat(60);
			double balance = amountGiven - billTotal;
			firstPrint();
			System.out.printf("""
				\t\t\tAmount Paid:\t%.2f
				\t\t\tBalance:\t%.2f
				%s
				\tTHANK YOU FOR YOUR PATRONAGE
				%s
					""",amountGiven,balance, equalsTo, equalsTo );
		}

}
public class Bank{

	public static void main(String... smart){
		Account mercyAccount = new Account();
		mercyAccount.deposit(1_200);
		int accountBalance = mercyAccount.checkBalance();

 		System.out.println(accountBalance);

		Account shakiraAccount = new account();
		shakiraAccount.deposit(2_300);
		int herAccountBalance = shakiraAccount.checkBalance());

		System.out.println(herAccountBalance);


		mercyAccount.withdraw(1000);
		System.out.println(mercyAccount.checkBalance());
		
		meryAccount.deposit(-1200);
		System.out.println(mercyAccount.checkBalance());


		}
	}
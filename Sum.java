public class Sum{
	public static int sum(int i1, int i2){
	int result = 0;
	for(int i = i1; i <= i2; i++)
		result += i;
	     return result;
		}
	public static void main(String...sum){
	System.out.println(sum(1, 10));
	System.out.println(sum(20, 37));
	System.out.println(sum(35, 49));
	}
}
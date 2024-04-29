import java.util.*;
public class Arraynames{
	public static void main(String...args){
	String names[] = new String[5];
	Scanner input = new Scanner(System.in);
	
	for(int i = 0; i < names.length; i++){
	System.out.println("Enter your name: ");
	String name = input.nextLine();
	names[i] = name;
	}

	
	System.out.println("The names you entered are:");
	for(String name : names){
	System.out.println(name);
		}
	}
 }

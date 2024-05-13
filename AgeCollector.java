import java.util.*;
public class AgeCollector{
	public static void main(String...args){
			int ages[] = new int[5];
			Scanner input = new Scanner(System.in);

			for(int index = 0; index < ages.length; index++){
			System.out.println("Enter Your Age: ");
			int age = input.nextInt();
			 ages[index] = age;
			}

			System.out.println("The ages entered is: ");
			for(int age : ages){
			System.out.println(age);
				}

		}
	}
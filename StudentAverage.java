import java.util.*;
public class StudentAverage{
	public static void main(String...args){
	String names[] = new String[5];
	int grades[] = new int[5];
	Scanner input = new Scanner(System.in);

		for(int index = 0; index < 5; index++){
		System.out.println("Enter your name as a student: ");
		String name = input.nextLine();
		System.out.println("Enter your student grade: ");
		int grade = input.nextInt();
		names[index] = name;
		grades[index] = grade;
                input.nextLine();

		}

		int sum = 0;
           	for(int names : grades){
			sum + grades;
			}
		   return sum;
		}
		
		for(int index2 = 0; index2 < 5; index2++){
		System.out.println(names[index2]);
		System.out.println(grades[index2]);
		System.out.println(sum);

		}
	}
}
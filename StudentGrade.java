import java.util.*;
public class StudentGrade{
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
                //System.out.print("");

		}
		for(int index2 = 0; index2 < 5; index2++){
		System.out.println(names[index2]);
		System.out.println(grades[index2]);
		System.out.print("");
		}
	}

}

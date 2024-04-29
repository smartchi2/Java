import java.util.*;
	public class PersonalTest{
	
	private static final Scanner input = new Scanner(System.in);
	static int[] counts = new int[5];

	public static void main(String...args){
		Question question = new Question();
		question.personalitytest();
		}
 	public void personalitytest() {
		System.out.print("Welcome to Smart MBTI Personality Test");
		System.out.println("What is your name: ");
		String name = input.nextLine();
		System.out.println("Hello" + name + ", this is your Smart MBTI personality check questionnaire");
		System.out.println();

		//String value1 = introvertedAndExtroverted(name, counts);
                //String value2 = sensingAndIntuitive(name, counts);
                //String value3 = thinkingAndFeeling(name, counts);
                //String value4 = judgingAndPerceptive(name, counts);

		//String traits = value1 + value2 + value3 + value4;
		//System.out.println("Your Smart MBTI Personlity Test is: " + traits);
		//System.out.println();


}


}
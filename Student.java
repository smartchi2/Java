import java.util.Scanner;

     public class Student{
         public static void main(String[] args){
         Scanner input = new Scanner(System.in);

        System.out.println("Enter score1");
        int score1 = input.nextInt();
     
        System.out.println("Enter score2");
        int score2 = input.nextInt();

        System.out.println("Enter score3");
        int score3 = input.nextInt();
       
       
        int total = score1 + score2 + score3;
      
	if(total > 50){System.out.println("Student pass by total score");
        		}
       else
           {System.out.printf("Student  Failed by total score ");
			}


}
}
import java.util.Scanner;

     public class StudentName{
         public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        
        System.out.println("Your name");
        String name = input.nextLine();


        System.out.println("Enter score1");
        int score1 = input.nextInt();
     
        System.out.println("Enter score2");
        int score2 = input.nextInt();

        System.out.println("Enter score3");
        int score3 = input.nextInt();
       
        
        int total = score1 + score2 + score3;
        

       if(total  < 100){
       System.out.print("Student pass by total score\n" +  name);
        }
       else{
        System.out.print("Student pass by total score\n" +  name);
        }
      
}


}
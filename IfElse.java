import java.util.Scanner;

    public class IfElse{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       int studentGrade = 0;
       int count = 1;
       while(studentGrade < 1){
       

       System.out.println("Enter grade");
       int studentGrade1 = input.nextInt();

       if(studentGrade >= 90){
          System.out.println("A");
          }
       if (studentGrade >= 80){
          System.out.println("B");
          }
       if (studentGrade >= 70){
           System.out.println("C");
           }
       if (studentGrade >= 60){
           System.out.println("D");
           }
        
           
    }

  }
}
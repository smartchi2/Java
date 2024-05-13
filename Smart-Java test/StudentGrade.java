 import java.util.Scanner;

public class StudentGrade{
   public static void main(String[] args){
    Scanner studentGrade1  = new Scanner(System.in);
      

    System.out.println("Enter student grade: ");
    int studentGrade = studentGrade.nextInt();

    if(studentGrade>= 90){
        System.out.println("A");
       }
        else if (studentGrade >= 80){
            System.out.println("B");
            }
            else if (studentGrade >= 70){
                 System.out.println("C");
                 }
                 else if (studentGrade >= 60){
                      System.out.println("D");
                      }
                      else if (studentGrade >= 50){
                           System.out.println("E"); 
                           }
                           else {
                           System.out.println("F");


    }
   }
}
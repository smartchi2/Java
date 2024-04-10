import java.util.Scanner;

public class LoopDeyGo{
     public static void main(String[] args){
     Scanner inputVillageCollector = new Scanner(System.in);
   

      int score = 0;
      int numberOfMyVillagePeople =0;
      while (numberOfMyVillagePeople < 5){

 

     
     System.out.println("Enter number of my village people");
      score = inputVillageCollector.nextInt();
      if(score>0 && score <= 100){
       numberOfMyVillagePeople++;
       System.out.println("Number of valid scores is now 5");
   }
}
}

  }
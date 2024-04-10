import java.util.Scanner;
   public class PlayTime{

      public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to binary hub: ");
     
       int counter = 0;
       System.out.println("How many time do you want to play: ");
       int PlayTime1 = input.nextInt();
            while(counter < PlayTime1){


            System.out.println("Enter 1 or 0");
            int Play = input.nextInt();
            


                  
                 if(Play == 0) 
                          System.out.println("1");
                 if(Play == 1) 
                          System.out.println("0");
                 counter = counter +1;
        
      }
   }
}

  



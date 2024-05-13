import java.util.Scanner;
  
  public class PhoneBook1{
        public static void main(String[] args){
  		Scanner input = new Scanner(System.in);
  		String phoneMenu = """
        		Welcome to Nokia!!!
			1. Phonebook
			2. Message
			3. Chat
			4. Call register
			5. Tones
			6. Settings
			7. Call divert
			8. Games
			9. Calculator
			10. Reminder
			11. Clock
			12. Profiles
			13. SIM services
			14. Exit Application
        
			""";



		System.out.print(phoneMenu);
		int menu = input.nextInt();
		switch(menu){



		case 1: System.out.print("""
          	1. Search
          	2. Service Nos1
          	3. Add name
          	4. Erase
          	5. Edit
          	6. Assign tone
          	7. Send b' card
          	8. Option
          	9. Speed dials
          	10. Voice tags
          
	  	""");

		int phoneBook = input.nextInt();
	
		switch(phoneBook){
			case 1: System.out.println("Search"); break;
        		case 2: System.out.println("Service nos1"); break;
        		case 3: System.out.println("Add name"); break;
        		case 4: System.out.println("Erase"); break; 
        		case 5: System.out.println("Edit"); break;
        		case 6: System.out.println("Assign tone"); break;
        		case 7: System.out.println("Send b card"); break;
        		case 8: System.out.println(""" 
			Options:
			1-> Type of view
			2-> Memory Status
			""");

			int options = input.nextInt();
			switch(options){
				case 1: System.out.println("Type of view"); break;
				case 2: System.out.println("Memory status"); break;
				default: System.out.println("wrong input"); 
			} 

        		case 9: System.out.println("Speed dials"); break;
        		case 10:System.out.println("Voice tags"); break;
		default: System.out.print("Wrong input");
		}

		case 2: System.out.print("""
        		1. Write messages
        		2. Inbox
        		3. Outbox
        		4. Picture messages
        		5. Templates
        		6. Smileys
			7. message setting
			8. info service
			9. Voice mailbox number
			10. Service command editor """);

			int message = input.nextInt();
  			switch(message){
				case 1: System.out.println("Write messages"); break;
       				case 2: System.out.println("Inbox"); break;
        			case 3: System.out.println("Outbox"); break;
        			case 4: System.out.println("Picture messages"); break;
       			        case 5:System.out.println("Template"); break;
        			case 6: System.out.println("Smileys"); break;
				case 7: System.out.println("""
              				Message settings
					1-> set
					2-> common

                     			""");

					int messageSettings = input.nextInt();
		 			switch(messageSettings){

					case 1: System.out.print("""
						set
						1-> Message centre number
                       				2-> Message sent as
                        			3-> Message validity """);

			     			int set  = input.nextInt();
						switch(set){
               						case 1: System.out.println("Message centre number"); break;
               						case 2: System.out.println("Message sent as"); break;
               						case 3: System.out.println("Message validity"); break;
               						default: System.out.println("Wrong input"); break;
                   				}
					case 2: System.out.println("""
                        		common
                        			1-> Delivery report
                        			2-> Reply via same centre
                        			3-> Character support
                        			4-> Info service
                        			5-> Voice mailbox number
                        			6-> Service command editor
                                        	 """);

                       				int common = input.nextInt();
						switch(common){
               						case 1: System.out.println("Delivery");  break;
               						case 2: System.out.println("Reply via same centre");  break;
               						case 3: System.out.println("Character support");  break;
               						case 4: System.out.println("Info service"); break;
               						case 5: System.out.println("Voice mailbox number"); break;
               						case 6: System.out.println("Service command editor"); break;
               						default: System.out.println("Wrong input"); break;

                    				}
					
				case 8: System.out.println("info service");  break;
				case 9: System.out.println("Voice mailbox number ");  break;
				case 10: System.out.println("Service command editor");  break;
				default: System.out.println("Wrong input");  break;
			}


        	case 3: System.out.println("""
               		1:-> Chat

             		""");
         		int chat = input.nextInt();
		 	switch(chat){
         			case 1: System.out.println("Connect with friends"); break;
         			default: System.out.println("Wait as we connect you to a friend!!!"); break;
         		}
      
            
       		case 4: System.out.println("""
               		Call register
               		1:-> Missed calls
               		2:-> Received calls
               		3:-> Dialled numbers
               		4:-> Erase recent call lists
                        5:-> Show call duration
              		"""); 
    
          		int callRegister = input.nextInt();
             		switch(callRegister){
             			case 1: System.out.println("Missed call"); break;
             			case 2: System.out.println("Received calls"); break;
             			case 3: System.out.println("Dialled numbers"); break;
             			case 4: System.out.println("Erase recent call lists"); break;
             			case 5: System.out.println("""
                                Show call duration
                                        1:-> Last call duration
                                        2:-> All calls duration
                                        3:-> Received calls duration
                                        4:-> Dialled calls duration
                                        5:-> Clear timers
                                        """);
                                      
                             int callDuration = input.nextInt();
                             switch(callDuration){
                                   case 1: System.out.println("Last calls duration"); break;
                                   case 2: System.out.println("Received calls"); break;
                                   case 3: System.out.println("Dialled numbers"); break;
                                   case 4: System.out.println("Erase recent call lists"); break;
                                   case 5: System.out.println("Clear timers"); break;
                                   case 6: System.out.println("""
                                   Show call costs 
                                           1:-> Last call costs
                                           2:-> All calls costs
                                           3:-> clear counters    
                                           """);
                                 
                                int showCallCosts = input.nextInt();
                                switch(showCallCosts){
                                      case 1: System.out.println("Last call costs"); break;
                                      case 2: System.out.println("All calls costs"); break;
                                      case 3: System.out.println("clear counters"); break;
                                      case 7: System.out.println("""
                                      Call cost settings
                                               1:-> Call cost limit
                                               2:-> Show costs in
                                               3:-> prepaid credit
                                               """);

                                  int callCostSetting = input.nextInt();
                                  switch(callCostSetting){
                                          case 1: System.out.println("Call cost limit"); break;
                                          case 2: System.out.println("Show costs in"); break;
                                          case 3: System.out.println("prepaid credit"); break;
                                          default: System.out.println("Setting in progress!!!");
                                       }
                                       }
                                       }
                                   

                                   case 5: System.out.println("""
                                          1:-> Ringing tone
                                          2:-> Ringing volume
                                          3:-> Incoming call alert
                                          4:-> Composer
                                          5:-> Message alert tone 
                                          6:-> Keypad tones
                                          7:-> Warning and game tones
                                          8:-> Vibrating alert
                                          9:-> Screen saver
                                                          """);

                                   int tones = input.nextInt();
                                   switch(tones){
                                         case 1: System.out.println("Ringing tone"); break;
                                         case 2: System.out.println("Ringing volume"); break;
                                         case 3: System.out.println("Incoming call alert"); break;
                                         case 4: System.out.print("Composer"); break;
                                         case 5: System.out.println("Message alert tone"); break;
                                         case 6: System.out.println("Keypad tones"); break;
                                         case 7: System.out.println("Warning and game tones"); break;
                                         case 8: System.out.println("Vibrating alert"); break;
                                         case 9: System.out.println("Screen saver"); break;
                                         default: System.out.println("Enjoy the tones");
                                       } 

                                    case 6: System.out.println("""
                                           1:-> Automatic redial
                                           2:-> Speed dialling
                                           3:-> Call waiting options
                                           4:-> Own number sending
                                           5:-> Phone line in use
                                           6:-> Automatic answer1
                                                              """);
                       
                                   int callSettings = input.nextInt();
                                   switch(callSetting){
                                          case 1: System.out.println("Automatic redial");
                                          case 2: System.out.println("Speed dialling");
                                          case 3: System.out.println("Call waiting options");
                                          case 4: System.out.println("Own number sending");
                                          case 5: System.out.println("Phone line in use");
                                          case 6: System.out.println("Automatic answer1");
                                          case 7: System.out.println("""
                                           Phone settings
                                                   1:-> Language
                                                   2:-> Cell info display
                                                   3:-> Welcome note
                                                   4:-> Network selection
                                                   5:-> Lights
                                                   6:-> Confirm SIM service action           
                                                                                    """);
                                
                                 int phoneSetting = input.nextInt();
                                 switch(phoneSettin){
                                        case 1: System.out.println("Language"); break;
                                        case 2: System.out.println("Cell info display"); break;
                                        case 3: System.out.println("Welcome note"); break;
                                        case 4: System.out.println("Network selection"); break;
                                        case 5: System.out.println("Lights"); break;
                                        case 6: System.out.println("Confirm SIM service action"); break;
                                        case 7: System.out.println("""
                                        Security settings
                                                  1:-> Pin code request
                                                  2:-> Call barring service
                                                  3:-> Fixed dialling
                                                  4:-> Close user group
                                                  5:-> Phone security
                                                  6:-> Change access codes
                                                  7:-> Restore factory settings
                                                           """);

                                 int securitySetting = input.nextInt();
                                 switch(securitySetting){
                                       case 1: System.out.println("Pin code request"); break;
                                       case 2: System.out.println("Call barring service"); break;
                                       case 3: System.out.println("Fixed dialling"); break;
                                       case 4: System.out.println("Close user group"); break;
                                       case 5: System.out.println("Phone security"); break;
                                       case 6: System.out.println("change access code"); break;
                                       case 4: System.out.println("Restore factory settings"); break;
                                       default: System.out.println("Your phone is now secured...");

                                      }
                                     
                                  
                                case 7: System.out.println("""
                                          1:-> call divert
                                                     """);
                          
                                 int callDivert = input.nextInt();
                                 switch(callDivert){
                                   case 1:System.out.println("Please hold"); break;
                                       default:System.out.println("Waitting"); 
                                     }
                                   
        
                             case 8: System.out.println("""
                                 1:-> Games 
                                          """);
 
                            int games = input.nextInt();
                             switch(games){
                                   case 1:System.out.println("Pick a game"); break;
                                    default:System.out.println("Made a nice choice"); 
                                   }
                                  
                            case 9: System.out.println("""
                                 1:->  Calculator
                                               """); 

                            int calculator = input.nextInt();
                            switch(calculator){
                              case 1: System.out.println("Calculate");
                               default: System.out.println("Get total"); 
                              }         
                             
                        
                          case 10:System.out.println("""
                               1:-> Reminders
                                            """);

                         int reminders = input.nextInt();
                          switch(reminders){
                            case 1:System.out.println("reminder"); 
                             default: System.out.println("Alert");   
                              } 
                             

                         case  11: System.out.println("""
                               1:-> Alarm clock
                               2:-> Clock settings
                               3:-> Date setting
                               4:-> Stopwatch
                               5:-> Countdown timer
                               6:-> Auto update of date and time
                                                          """);

                         int clock = input.nextInt();
                         switch(clock){
                           case 1: System.out.println("Alarm"); break;
                           case 2: System.out.println("Clock settings"); break;
                           case 3: System.out.println("Date setting"); break;
                           case 4: System.out.println("Stopwatch"); break;
                           case 5: System.out.println("Countdown timer"); break;
                           case 6: System.out.println("Auto update of date and time"); break;
                           default: System.out.println("Clock working now"); 
                            
                          }
                        
                      case 12: System.out.println("""
                           1:-> Profile
                                     """);
           
                     int profile = input.nextInt();
                     switch(profile){
                           case 1: System.out.println("Profile");
                           default: System.out.println("Done"); 
                          }
                         
                    case 13: System.out.println("""
                          1:-> SIM services
                                        """); 
                      
                    int simServices = input.nextInt();
                    switch(simServices){
                           case 1: System.out.println("SIM services");
                           default: System.out.println("Done");
                         }
                   }

             }

    


 



 


   

                	

      
          

 
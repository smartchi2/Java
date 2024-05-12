import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
 public static void main(String[] args){
        String[] dates = {"11/12/2022", "11-12-2022", "11 12 2022", "11.12.2022", "11/Dec/2022", "11-Dec-2022"};
        for (String date : dates) {
            System.out.println("Date: " + date + " Age: " + calculateAge(date));
     	}
 }
public static int calculateAge(String dob) {
String[] patterns = {"dd/MM/yyyy", "dd-MM-yyyy", "dd MM yyyy", "dd.MM.yyyy", "dd/MMM/yyyy", "dd-MMM-yyyy"};
        for (String pattern : patterns) {
                LocalDate birthDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern(pattern));
                LocalDate currentDate = LocalDate.now();

                Period period = Period.between(birthDate, currentDate);
	return Period.getYears();
	 }
}
	
	

	



	



	
        
   
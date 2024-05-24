package birthday;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter you date of birth(dd/MM/yyyy):");
        String dateOfBirthString=Sc.next();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateOfBirth=LocalDate.parse(dateOfBirthString,formatter);
        //Get the current date
        LocalDate currentDate=LocalDate.now();
        //calculate differance in years
        int age=currentDate.getYear()-dateOfBirth.getYear();

        if(currentDate.getMonthValue()<dateOfBirth.getMonthValue()||
         (currentDate.getMonthValue()==dateOfBirth.getMonthValue()&&
                currentDate.getDayOfMonth()<dateOfBirth.getDayOfMonth()));
        {
            age--;
        }
        System.out.println("You are"+age+"years old");
                                  }
}

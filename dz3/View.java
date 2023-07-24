package dz3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class View {

     public static User getUserInput(){
         DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
         System.out.println("Введите имя, фамилию, дату рождения (дд.мм.гггг), номер телефон и пол через пробел.");
         System.out.println("Ввод:");
         Scanner scanner = new Scanner(System.in);
         String userInput = scanner.nextLine();
         scanner.close();
         String[] splitInput = Exception.checkUserInput(userInput).split(" ");
         String firstName = Exception.checkFirstName(splitInput[0]);
         String lastName = Exception.checkLastName(splitInput[1]);
         LocalDate birthday  = LocalDate.parse(Exception.checkBirthday(splitInput[2]), format);
         long phoneNumber = Long.parseLong(Exception.checkPhoneNumber(splitInput[3]));
         String gender = Exception.checkGender(splitInput[4]);
         return new User(firstName, lastName, birthday, phoneNumber, gender);
        
     }
}
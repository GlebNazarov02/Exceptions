package dz3;

import java.io.FileWriter;
import java.io.IOException;

public class Model {


    public static void saveUser(User currentUser){
        try (FileWriter writer = new FileWriter(currentUser.getLastName()+".txt", true)){
            writer.write(
                    currentUser.getFirstName() + " " +
                    currentUser.getLastName() + " " +
                    currentUser.getBirthday() + " " +
                    currentUser.getPhoneNumber() + " " +
                    currentUser.getGender());
            writer.write(System.getProperty( "line.separator" ));
            writer.close();
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


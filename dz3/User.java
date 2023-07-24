package dz3;

import java.time.LocalDate;

public class User{
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private long phoneNumber;
    private  String gender;

    public User(String firstName, String lastName, LocalDate Birthday, long phoneNumber, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = Birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public int compareTo(User user) {
        if (user.lastName.charAt(0)< this.lastName.charAt(0))
            return 1;
        if (user.lastName.charAt(0) > this.lastName.charAt(0))
            return -1;
        return 0;
    }

}
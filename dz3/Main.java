package dz3;


public class Main {
    public static void main(String[] args)  {
        User user = View.getUserInput();
        Model.saveUser(user);
    }
}
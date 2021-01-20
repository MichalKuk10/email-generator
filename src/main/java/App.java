import model.Email;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Email email = new Email( "John", "Test");


        System.out.println("This email: " + email.getFirstName() + " " +  email.getLastName());
    }
}

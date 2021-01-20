import model.Email;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //it's for happy path
        System.out.println("Please provide new hire Name and Surname: ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        String[] nameSurname = answer.split(" ");
        new Email(nameSurname[0], nameSurname[1]);

    }
}

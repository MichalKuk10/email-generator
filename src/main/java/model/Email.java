package model;

import View.PrintConsole;

import java.util.Scanner;

public class Email {
    private String email;
    private String firstName;
    private String lastName;
    private Departaments department;
    private String password;
    private int defaultPasswordLength = 8;
    private String companyName = "helpex";


    //constructor to receive first name and last name of employee
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = PasswordGenerator.generateRandomPassword(defaultPasswordLength);

        //create - email
        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "-" + this.companyName  + ".com";
        PrintConsole.printEmail((email));
        //show password
        PrintConsole.printConsole(this.department, this.password);
    }

    //ask for department
    private Departaments setDepartment() {
        System.out.println("Enter the Department number\n1 Human Resources\n2 Accountants\n3 Executives\n4 Developers");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        switch (choice){
            case 1:
                return this.department = Departaments.humanresources;
            case 2 :
                return this.department = Departaments.accountants;
            case 3 :
                return  this.department = Departaments.executives;
            case 4 :
                return this.department = Departaments.developers;
            default:
                return null;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

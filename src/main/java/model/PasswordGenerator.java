package model;

//random password generator
public class PasswordGenerator {

    public static String generateRandomPassword(int passwordLength){
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUWabcdefghijklmoprstuw123456789#@$!&";

        char[] password = new char[passwordLength];
        for(int i  = 0; i <= passwordLength -1; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}

package controller;

//random password generator
public class Generator {

    public String generateRandomPassword(int passwordLength){
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUW123456789#@$!&";
        char[] password = new char[passwordLength];

        for(int i  = 0; i <= passwordLength; i++){
            int rand = (int)Math.random() * passwordSet.length();
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}

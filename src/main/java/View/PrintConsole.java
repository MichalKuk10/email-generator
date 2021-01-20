package View;

import model.Departaments;

public class PrintConsole {

    public static void printConsole(Departaments department, String password){
        System.out.println("Department: " + department );
        System.out.println("Temporary password:  " + password);
    }
}

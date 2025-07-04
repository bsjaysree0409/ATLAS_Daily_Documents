package worked_codes;

import java.util.Scanner;


public class Task06 {
    public static void main(String[] args) {
        String id;
        String password;

        System.out.println("Enter your credentials");
        Scanner idAndPasswordScan = new Scanner(System.in);
        id = idAndPasswordScan.nextLine();
        password = idAndPasswordScan.nextLine();

        System.out.println("Hi ,");
        System.out.println("\t\t Your login id is "+id);
        System.out.println("And your pwd is "+password);

    }
}

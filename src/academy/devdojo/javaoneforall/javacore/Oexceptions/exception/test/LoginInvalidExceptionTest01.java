package academy.devdojo.javaoneforall.javacore.Oexceptions.exception.test;

import academy.devdojo.javaoneforall.javacore.Oexceptions.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);
        String usernameDb = "Goku";
        String passwordDb = "ssj";

        System.out.print("Type your login: ");
        String typedUsername = scanner.nextLine();
        System.out.print("Type your password: ");
        String typedPassword = scanner.nextLine();

        if (!usernameDb.equalsIgnoreCase(typedUsername)  || !passwordDb.equals(typedPassword)) {
            throw new LoginInvalidException("Username or password is incorrect");
        } else {
            System.out.println("Login successful!");
        }
    }
}

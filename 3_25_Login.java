import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        Boolean match = false;

        while (true) {
            if (username.equals("alex") && password.equals("sunshine")) {
                match = true;
            }
            if (username.equals("emma") && password.equals("haskell")) {
                match = true;
            }

            if (match) {
                System.out.println("You have successfully logged in!");
                break;
            } else {
                System.out.println("Incorrect username or password!");
                break;
            }
        }
    }
}
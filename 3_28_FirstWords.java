import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            String[] inputArray = userInput.split(" ");

            System.out.println(inputArray[0]);

            if (userInput.isEmpty()) {
                break;
            }
        }
    }
}
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            String [] inputArray = userInput.split(" ");

            System.out.println(inputArray[inputArray.length - 1]);

            if (userInput.isEmpty()) {
                break;
            }
        }
    }
}
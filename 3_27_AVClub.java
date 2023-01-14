import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userInput = scanner.nextLine();
            String[] inputArray = userInput.split(" ");
            if (userInput.isEmpty()) {
                break;
            }

            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i].contains("av")) {
                    System.out.println(inputArray[i]);
                }
            }
        }
    }
}
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            for (int i = 0; i < inputArray.length; i++) {
                System.out.println(inputArray[i]);
                }
            if (input.equals("")) {
                break;
                }
            }
        }
    }
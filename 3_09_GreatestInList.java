import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int newNumber = Integer.valueOf(scanner.nextLine());
            if (newNumber == -1) {
                break;
            }
            numbers.add(newNumber);
        }

        int largest = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (largest < number) {
                largest = number;
            }
        }

        System.out.println("The greatest number: " + largest);
    }
}
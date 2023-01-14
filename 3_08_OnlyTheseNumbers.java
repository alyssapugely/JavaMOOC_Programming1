import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

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
        System.out.println("From where?");
        int lowestIndex = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int highestIndex = Integer.valueOf(scanner.nextLine());
        for (int i = lowestIndex; i <= highestIndex; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers, 9999 to quit");

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }

            numbers.add(number);
        }

        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (smallest > numbers.get(i)) {
                smallest = numbers.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numbers.size(); i++) {
            if (smallest == numbers.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
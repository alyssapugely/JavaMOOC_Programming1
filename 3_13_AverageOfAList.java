import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers, -1 to exit");

        ArrayList <Integer> numbers = new ArrayList<>();
        while (true) {
            int newNumber = Integer.valueOf(scanner.nextLine());
            if (newNumber == -1) {
                break;
            }
            numbers.add(newNumber);
        }

        int sum = 0;
        double avg = 0;
        for (Integer number : numbers) {
            sum += number;
            avg = (double) sum / numbers.size();
        }

        System.out.println("Average: " + avg);
    }
}

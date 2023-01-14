import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

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

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
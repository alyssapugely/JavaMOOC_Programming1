import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

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
        int listSize = numbers.size();
        for (int i = 0; i < listSize; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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

        System.out.println("Search for?");
        int searchInput = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < numbers.size(); i++) {
            if (searchInput == numbers.get(i)) {
                System.out.println(searchInput + " is at index " + i);
            }
        }
    }
}
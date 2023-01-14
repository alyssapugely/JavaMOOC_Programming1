import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lowest number: ");
        int lowest = Integer.valueOf(scanner.nextLine());
        System.out.println("Highest number: ");
        int highest = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(lowest, highest);
    }

    public static void divisibleByThreeInRange(int lowest, int highest) {
        while (lowest <= highest) {
            if (lowest % 3 == 0) {
                System.out.println(lowest);
            }
            lowest++;
        }
    }
}
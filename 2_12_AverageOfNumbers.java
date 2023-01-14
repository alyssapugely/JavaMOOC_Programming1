import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double sum = 0;
        double avg = 0;

        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            count = count + 1;
            sum = sum + number;
            avg = sum/count;
        }
        System.out.println("Average of the numbers: " + avg);
    }
}
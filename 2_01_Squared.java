import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int square = number * number;
        System.out.println(square);
    }
}
import java.util.Scanner;

public class StarSign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many stars?");
        int numberStars = Integer.valueOf(scanner.nextLine());
        printStars(numberStars);
        System.out.println("\n---");
        System.out.println("How big is the square?");
        int size = Integer.valueOf(scanner.nextLine());
        printSquare(size);
        System.out.println("\n---");
        System.out.println("Width of rectangle?");
        int width = Integer.valueOf(scanner.nextLine());
        System.out.println("Height of rectangle?");
        int height = Integer.valueOf(scanner.nextLine());
        printRectangle(width, height);
        System.out.println("\n---");
        System.out.println("Size of triangle?");
        int triangleSize = Integer.valueOf(scanner.nextLine());
        printTriangle(triangleSize);
        System.out.println("\n---");
    }

    public static void printStars(int numberStars) {
        int i = 1;
        while (i <= numberStars) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int i = 1;
        while (i <= size) {
            printStars(size);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 1;
        while (i <= height) {
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int triangleSize) {
        int i = 1;
        while (i <= triangleSize) {
            printStars(i);
            i++;
	}
    }
}
	
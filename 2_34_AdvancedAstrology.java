import java.util.Scanner;
public class AdvancedAstrology {

    public static void printStars(int numberStars) {
        int i = 1;
        while (i <= numberStars) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int numberSpaces) {
        int i = 1;
        while (i <= numberSpaces) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int triangleSize) {
        int i = 1;
        while (i <= triangleSize) {
            printSpaces(triangleSize - i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int treeHeight) {
        int i = 1;
        while (i <= treeHeight) {
            printSpaces(treeHeight - i);
            printStars(i + (i - 1));
            i++;
        }
        printSpaces(treeHeight - 2);
        printStars(3);
        printSpaces(treeHeight - 2);
        printStars(3);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big is the triangle?");
        int triangleSize = Integer.valueOf(scanner.nextLine());
        printTriangle(triangleSize);
        System.out.println("---");
        System.out.println("How tall is the tree?");
        int treeHeight = Integer.valueOf(scanner.nextLine());
        christmasTree(treeHeight);
    }
}

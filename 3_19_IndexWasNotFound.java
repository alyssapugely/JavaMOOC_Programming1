import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searchInput = Integer.valueOf(scanner.nextLine());
        int i = 0;

        boolean match = false;
        while (i < array.length) {
            if (searchInput == array[i]) {
                match = true;
                break;
            }
            i++;
        }
        if (match) {
            System.out.println(searchInput + " is at index " + i + ".");
        } else {
            System.out.println(searchInput + " was not found.");
        }
    }
}
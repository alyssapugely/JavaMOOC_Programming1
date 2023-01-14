public class Printer {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            value = array[i];
            for (int x = 0; x < value; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
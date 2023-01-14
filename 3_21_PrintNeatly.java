public class ArrayPrinter {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
       int value = 0;
       for (int i = 0; i < array.length - 1; i++) {
           value = array[i];
           System.out.print(value + ", ");
       }
        System.out.print(array[array.length -1]);
    }
}
import java.util.ArrayList;
import java.util.Scanner;


public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.length() > 0) {
                String[] inputSplit = userInput.split(",");

                name.add(inputSplit[0]);
                age.add(Integer.valueOf(inputSplit[1]));
            }

            if (userInput.equals("")) {
                break;
            }
        }

        String longestName = name.get(0);

        for (int i = 0; i < name.size(); i++) {
            String element = name.get(i);
            if (element.length() > longestName.length()) {
                longestName = element;
            }
        }
        System.out.println("Longest name: " + longestName);

        int sum = 0;
        double avg = 0;

        for (int i = 0; i < age.size(); i++) {
            int value = age.get(i);
            sum += value;
        }
        avg = (double) sum / age.size();
        System.out.println("Average of the birth years: " + avg);
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();

        while(true) {
            String userInput = scanner.nextLine();

            if(userInput.length() > 0) {
                String [] inputSplit = userInput.split(",");

                name.add(inputSplit[0]);
                age.add(Integer.valueOf(inputSplit[1]));
            }

            if (userInput.equals("")) {
                break;
            }
        }

        int oldest = age.get(0);
        String nameOldest = name.get(0);

        for (int i = 0; i < age.size(); i++) {
            int number = age.get(i);
            if (oldest < number) {
                oldest = number;
                nameOldest = name.get(i);
            }
        }
        System.out.println("Name of the oldest: " + nameOldest);
    }
}
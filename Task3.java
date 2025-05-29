package GitPush;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("emma", "jane", "apple", "caleb", "matt", "ken");
        Scanner scan = new Scanner(System.in);

        while (true) {
            int choice;

            System.out.println("What do you want to do?");
            System.out.println("1. Display names");
            System.out.println("2. Update name");
            System.out.println("3. Exit");

            // Read integer input
            choice = scan.nextInt();
            scan.nextLine(); // Consume newline after nextInt()

            if (choice == 2) {
                System.out.println("Enter the name to update:");
                String name = scan.nextLine();

                if (names.contains(name)) {
                    int index = names.indexOf(name);
                    System.out.println("Name found at index: " + index);

                    System.out.println("Enter new name to replace it:");
                    String updateName = scan.nextLine();

                    if (updateName.isEmpty()) {
                        System.out.println("Name cannot be empty. Please enter a valid name.");
                        continue;
                    }

                    names.set(index, updateName); // Corrected this line
                    System.out.println("Name updated successfully.");

                } else {
                    System.out.println("Name not found.");
                }

                // Display updated list
                System.out.println("Updated list of names:");
                for (String n : names) {
                    System.out.println(n);
                }

            } else if (choice == 1) {
                for (String n : names) {
                    System.out.println(n);
                }
            } else if (choice == 3) {
                System.out.println("Exiting the program.");
                scan.close();
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}

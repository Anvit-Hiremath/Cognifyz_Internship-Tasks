import java.util.Scanner;
public class CRUD_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = new String[5]; // Assuming a maximum of 5 elements

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                        // Create
                    System.out.print("Enter data: ");
                    String newData = scanner.next();
                    for (int i = 0; i < data.length; i++) {
                        if (data[i] == null) {
                            data[i] = newData;
                            System.out.println("Data created successfully.");
                            break;
                        }
                    }
                    break;
                case 2:
                        // Read
                    System.out.println("Current data:");
                    for (String item : data) {
                        if (item != null) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 3:
                        // Update
                    System.out.print("Enter index to update: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < data.length) {
                        System.out.print("Enter new data: ");
                        newData = scanner.next();
                        data[index] = newData;
                        System.out.println("Data updated successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                        // Delete
                    System.out.print("Enter index to delete: ");
                    index = scanner.nextInt();
                    if (index >= 0 && index < data.length) {
                        data[index] = null;
                        System.out.println("Data deleted successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
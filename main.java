import java.util.Scanner;

public class main {
    private static int[] array;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = getValidIntegerInput();
        array = ArrayOperations.generateRandomArray(size); // Calls method to create random array

        while (true) {
            displayMenu();
            int choice = getValidIntegerInput();

            switch (choice) {
                case 1:
                    ArrayOperations.displayArray(array);
                    break;
                case 2:
                    ArrayOperations.findMin(array);
                    break;
                case 3:
                    ArrayOperations.findMax(array);
                    break;
                case 4:
                    ArrayOperations.showAverage(array);
                    break;
                case 5:
                    ArrayOperations.calculateAverageDifference(array);
                    break;
                case 6:
                    ArrayOperations.sumOfOddIndices(array);
                    break;
                case 7: 
                    ArrayOperations.sumOfEvenIndices(array);
                    break;
                case 8:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1 - Display Array");
        System.out.println("2 - Find Min");
        System.out.println("3 - Find Max");
        System.out.println("4 - Show Average Value of the Array's Elements.");
        System.out.println("5 - Show Difference Between Every Element and the Average Value.");
        System.out.println("6 - Find Sum of Odd Indexed Elements");
        System.out.println("7 - Find Sum of Odd Indexed Elements");
        System.out.println("8 - Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getValidIntegerInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }
}

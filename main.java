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
                    ArrayOperations.calculateOddEvenSums(array);
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
        System.out.println("2 - Find Min & Max");
        System.out.println("3 - Calculate Average & Differences");
        System.out.println("4 - Find Sum of Odd and Even Indexed Elements");
        System.out.println("5 - Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getValidIntegerInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }
        
    public static int findMax (int [] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++){
            if (array [i] > max){
                max = array [i];
            }
        }
        return max;
    }
    
    public static int findMin (int [] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i++){
            if (array [i] < min){
                min = array [i];
            }
        }
        return min;
    }
    
    
}

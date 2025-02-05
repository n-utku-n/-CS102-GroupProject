import java.util.Random;

public class ArrayOperations {
    public static int[] generateRandomArray(int size) {

        Random random = new Random();
        int[] array = new int[size]; 
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101); 
        } 
        return array; 
    }

    public static void displayArray(int[] array){
        String result = "";

        for(int i = 0; i < array.length; i++){
            result += array[i] + ", ";
        }

        System.out.println(result);
    }

    public static void calculateAverageDifference(int[] inputArray){
        double average = showAverage(inputArray) ;
        String s = "The differences from the average are: {";
        for (int i = 0 ; i < inputArray.length ; i++){
            s += inputArray[i] - average + ", ";
        }
        s = s.substring(0,s.length()-2) + "}" ;
        System.out.println(s);
    }

    public static double showAverage(int[] inputArray){
        int sum = 0; 
        for(int i = 0 ; i < inputArray.length ; i++){
            sum += inputArray[i] ;
        }
        double average = sum / inputArray.length ;
        System.out.println("Average of the integers in the list is " + average);
        return average ;
    }

    public static void findMax (int [] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++){
            if (array [i] > max){
                max = array [i];
            }
        }
        System.out.println("Maximum of the array: " + max);
    }
    
    public static void findMin (int [] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i++){
            if (array [i] < min){
                min = array [i];
            }
        }
        System.out.println("Minimum of the array: " + min);

    }

    public static void sumOfOddIndices(int[] array){
        int sum = 0;
        
        for(int i = 1; i < array.length; i += 2){
            sum += array[i];
        }

        System.out.printf("Sum of odd indices is: %d", sum);
    }

    public static void sumOfEvenIndices(int[] array){
        int sum = 0;
        
        for(int i = 0; i < array.length; i += 2){
            sum += array[i];
        }

        System.out.printf("Sum of even indices is: %d", sum);
    }
}
import java.util.Random;

public class ArrayOperations {
    public int[] generateRandomArray(int size) {

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

    public static void calculateAverageDifference(){

    }

    public static void showAverage(){

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
    }

    public static void sumOfEvenIndices(int[] array){
        int sum = 0;
        
        for(int i = 0; i < array.length; i += 2){
            sum += array[i];
        }
    }
}
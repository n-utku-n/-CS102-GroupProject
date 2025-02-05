public class ArrayOperations {
    public int[] generateArray(int size) {
      Random random = new Random();
      int[] array = new int[size]; 
      for (int i = 0; i < size; i++) {
        array[i] = random.nextInt(101); 
      } 
      return array; 
    }

    public int[] displayArray(){

    }

    public int[] calculateAverageDifference(){

    }

    public int showAverage(){

    }

    public int sumOfOddIndices(){

    }

    public int sumOfEvenIndices(){

    }
}

public class ArrayOperation1 {
   public static void main(String[] args) {
      
      int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      for(int i = 0; i <= 9; i++){
      System.out.println(intArray[i]);
      }
      double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};
      for(int i = 9; i >= 0; i--){
      System.out.println(doubleArray[i]);
      } 
      char[] charArray = {'a', 'B', 'c', 'D', 'e', 'F', 'z', 'x', 'y', 'h'};
      for(int i = 5; i <= 9; i++){
      System.out.println(charArray[i]);
      }
      boolean[] boolArray = {true, false, false, true, false, true};
      for(int i = 3; i >= 0; i--){
      System.out.println(boolArray[i]);
      }
      long[] longArray = {100L, 800L, 700L, 300L, 200L, 500L, 600L, 200L, 400L, 1000L};
      for(int i = 0; i <= 9; i=i+2){
      System.out.println(longArray[i]);
      }
      
     }
}
public class CountOddEven {
    public static void main(String[] args) {
        String userName = "aishu";
        char ch = 'h';
        int output = findingOccurance(userName, ch);
        System.out.println(output);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        int[] numbers = { 10, 20, 5, 18, 58, 63, 9 };
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // sumOfArray
        int[] values = { 10, 6, 22, 16, 7, 5 };
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println("Sum of array: " + sum);
    }
    public static int findingOccurance(String name, char ch) {
        char[] chArray = name.toCharArray();
        int x = chArray.length;
        for (int i = 0; i < x; i++) {
            if (chArray[i] == ch) {
                return i;
            }
        }
        return -1;
    }
}


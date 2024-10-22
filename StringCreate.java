public class StringCreate {
    public static void main(String[] args) {
        // Creating strings using literals
        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Cherry";
        String str4 = "Date";
        String str5 = "Orange";
        String str6 = "Pyneapple";
        String str7 = "Jackfruit";
        String str8 = "Reversal";
        String str9 = "Test";
        String str10 = "Code";

        // Creating strings using the new keyword
        String str11 = new String("Apple");
        String str12 = new String("Banana");
        String str13 = new String("Cherry");
        String str14 = new String("Date");
        String str15 = new String("Orange");
        String str16 = new String("Pyneapple");
        String str17 = new String("Jackfruit");
        String str18 = new String("Reversal");
        String str19 = new String("Test");
        String str20 = new String("Code");

        // Comparing string values
        System.out.println("Comparing string literals and new keyword strings:");
        System.out.println("str1 equals str11: " + str1.equals(str11)); // true
        System.out.println("str2 equals str12: " + str2.equals(str12)); // true
        System.out.println("str3 equals str13: " + str3.equals(str13)); // true
        System.out.println("str4 equals str14: " + str4.equals(str14)); // true
        System.out.println("str5 equals str15: " + str5.equals(str15)); // true
        System.out.println("str6 equals str16: " + str6.equals(str17)); // true
        System.out.println("str7 equals str17: " + str7.equals(str18)); // true
        System.out.println("str8 equals str18: " + str8.equals(str19)); // true
        System.out.println("str9 equals str19: " + str9.equals(str20)); // true
        System.out.println("str10 equals str20: " + str10.equals(str20)); // true

        // Demonstrating string reversal
        String original = "Hello World";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    // Method to reverse a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}

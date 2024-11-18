public class UpcastingExample {
    public static void main(String[] args) {
        
        
        byte byteValue = 10;
        int intValue = byteValue; 
        System.out.println("Byte to int: " + intValue);

        
        short shortValue = 100;
        long longValue = shortValue; 
        System.out.println("Short to long: " + longValue);

        
        int anotherIntValue = 200;
        float floatValue = anotherIntValue; 
        System.out.println("Int to float: " + floatValue);

        
        float anotherFloatValue = 3.14f;
        double doubleValue = anotherFloatValue; 
        System.out.println("Float to double: " + doubleValue);
    }
}

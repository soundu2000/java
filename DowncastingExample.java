public class DowncastingExample {
    public static void main(String[] args) {
        
        
        double doubleValue = 9.99;
        float floatValue = (float) doubleValue;  
        System.out.println("Double to Float: " + floatValue);

        
        float floatValue2 = 10.5f;
        int intValue = (int) floatValue2; 
        System.out.println("Float to Int: " + intValue);

        
        long longValue = 1000L;
        short shortValue = (short) longValue; 
        System.out.println("Long to Short: " + shortValue);

        
        int intValue2 = 130;
        byte byteValue = (byte) intValue2;   
        System.out.println("Int to Byte: " + byteValue);
    }
}

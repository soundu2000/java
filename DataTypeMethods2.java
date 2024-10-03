public class DataTypeMethods2 {

    public static void main(String[] args) {
        int intValue = Integer.parseInt("42");
        System.out.println("Integer.parseInt: " + intValue);

        
        double doubleValue = Double.parseDouble("42.42");
        System.out.println("Double.parseDouble: " + doubleValue);

        
        boolean booleanValue = Boolean.parseBoolean("true");
        System.out.println("Boolean.parseBoolean: " + booleanValue);

        
        String stringValue = String.valueOf(42);
        System.out.println("String.valueOf: " + stringValue);

        
        boolean isDigit = Character.isDigit('5');
        System.out.println("Character.isDigit: " + isDigit);

        
        boolean isNan = Float.isNaN(0.0f / 0.0f);
        System.out.println("Float.isNaN: " + isNan);

        
        Long longValue = Long.valueOf("123456789");
        System.out.println("Long.valueOf: " + longValue);

        
        Short shortValue = Short.valueOf("123");
        System.out.println("Short.valueOf: " + shortValue);

        
        byte byteValue = Byte.parseByte("10");
        System.out.println("Byte.parseByte: " + byteValue);

        
        int comparison = Double.compare(10.5, 20.0);
        System.out.println("Double.compare: " + comparison);
    }
}
public class ReturnTypes {
  
   public static byte getByteValue() {
       byte byteValue = 10;
       return byteValue;
   }
   
   public static short getShortValue() {
       short shortValue = 100;
       return shortValue;
   }

   public static int getIntValue() {
       int intValue = 1000;
       return intValue;
   }
  
   public static long getLongValue() {
       long longValue = 200L;
       return longValue;
   }

   public static double getDoubleValue() {
       double doubleValue = 10.99;
       return doubleValue;
   }
 
   public static float getFloatValue() {
       float floatValue = 20.5f;
       return floatValue;
   }

   public static boolean getBooleanValue() {
      boolean booleanValue = true;
      return booleanValue;
   }
 
   public static char getCharValue() {
      char charValue = 'Z';
      return charValue;
   }

   public static void main(String[] args) {
    
      System.out.println("Byte Value: " + getByteValue());
      System.out.println("Short Value: " + getShortValue());
      System.out.println("Int Value: " + getIntValue());
      System.out.println("Long Value: " + getLongValue());
      System.out.println("Double Value: " + getDoubleValue());
      System.out.println("Float Value: " + getFloatValue());
      System.out.println("Boolean Value: " + getBooleanValue());
      System.out.println("Char Value: " + getCharValue());
   }

}
         
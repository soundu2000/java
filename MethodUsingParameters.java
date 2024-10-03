
public class MethodUsingParameters {
  
    public static void main(String[] args) {
        email("xyzde@456","hello");
        phoneCall(99454," abc",57321);
        login("fghij@1234","abcdefg@2345");
    }
    public static void email(String email, String subject) {
        System.out.println("email = " +email);
        System.out.println("subject = " +subject);
    }
    
    public static void phoneCall(long mobNum, String name, int countryCode) {
        System.out.println(" mobNum = " +mobNum);
        System.out.println(" name = " + name);
        System.out.println(" countryCode = " + countryCode);
    }
    public static void login( String email, String password) {
        System.out.println("enter email = " +email);
        System.out.println("enter password = " +password);
}
    
}
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.nonexistent.MyClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

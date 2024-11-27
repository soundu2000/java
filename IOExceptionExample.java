import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            
            File file = new File("nonexistentfile.txt");
            FileReader reader = new FileReader(file);
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

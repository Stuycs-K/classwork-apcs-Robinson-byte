import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Adventday6 {
    public static void main(String[] args) {
        try {
            File file = new File("input6.txt");
            Scanner scanner = new Scanner(file);

            List<String> messages = new ArrayList<>();
            while (scanner.hasNextLine()) {
                messages.add(scanner.nextLine());
            }
            scanner.close();

            System.out.println(errorMessage(messages));
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}

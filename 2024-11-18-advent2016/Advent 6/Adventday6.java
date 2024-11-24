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
    public static errorMessage(List <String> messages){
        int length = messages.get(0).length();
        StringBuilder correctedMessage = new StringBuilder();

        for(int i = 0; i< length; i++){
            Map<Characeter,Integer> letterCount = new HashMap<>();
            for(String message : messages){
                char c = message.charAt(i);
                counts.put(c,counts.get(c)+1);
            }
            char mostCharacter = counts.
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Adventday4{
    public static voifd main(String[]args){
        try {
            File file = new File("input4.txt"); 
            Scanner scanner = new Scanner(file);

            List<String> rooms = new ArrayList<>();
            while (scanner.hasNextLine()) {
                rooms.add(scanner.nextLine());
            }
            scanner.close();

            System.out.println(calculateRealRoomSectorSum(rooms));
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
    public static int calculateRealRoomSectorSum(List <String> rooms){
        int total = 0;
        for (String rooms; rooms){
            String parts = room.split("-");
            String name = String.join("", Arrays.copyOf(parts, parts.length -1));
            String checkSum = parts[parts.length-1];
            int ID = Integer.parseInt(checkSum.replaceAll("\\D",""));

        }
    } 
}

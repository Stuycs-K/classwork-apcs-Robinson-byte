import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Adventday2{
    public static void main(String[] args) {
        try {
            File file = new File("input2.txt");
            Scanner scanner = new Scanner(file);

            
            StringBuilder instructions = new StringBuilder();
            while (scanner.hasNextLine()) {
                instructions.append(scanner.nextLine()).append("\n");
            }
            scanner.close();
            String[] lines = instructions.toString().trim().split("\n");

            System.out.println( bathroomCode(lines));
        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
    public static String bathroomCode(String [] instructions){
        Character [][] keypad ={
            {null, null, '1', null, null},
            {null, '2', '3', '4', null},
            {'5', '6', '7', '8', '9'},
            {null, 'A', 'B', 'C', null},
            {null, null, 'D', null, null}
        };
        int x = 2;
        int y = 0;
        StringBuilder code = new StringBuilder();

        for(String line : instructions){
            for (char move: line.toCharArray()){
                int changeX = x;
                int changeY = y;
                switch(move){
                    case 'U': changeX = x -1; break;
                    case 'D': changeX = x +1; break;
                    case 'L': changeY = y -1; break;
                    case 'R': changeY = y +1; break;
                }
                if (changeX >= 0 && changeX < 5 && changeY >= 0 && changeY < 5 && keypad[changeX][changeY] != null) {
                    x = changeX;
                    y= changeY;
                }
            }
            code.append(keypad[x][y]);
        }
        return code.toString();
    }
}


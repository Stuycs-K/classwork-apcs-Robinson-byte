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
        int [][] keypad ={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int x = 1;
        int y = 1;
        StringBuilder code = new StringBuilder();

        for(String line : instructions){
            for (char move: line.toCharArray()){
                switch(move){
                    case 'U': if (x>0) x--; break;
                    case 'D': if (x<2) x++; break;
                    case 'L': if (y>0) y--; break;
                    case 'R': if (y<2) y++; break;
                }
            }
            code.append(keypad[x][y]);
        }
        return code.toString();
    }
}


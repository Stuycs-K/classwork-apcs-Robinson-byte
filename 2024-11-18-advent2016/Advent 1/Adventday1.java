import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Adventday1{
  public static void main(String[] args){
    try{
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        String instructions = scanner.nextLine();
        scanner.close();
        System.out.println (calculateDistance(instructions));
    }
    catch(FileNotFoundException e){
      System.out.println("File not found");
    }
  }

  public static int calculateDistance(String input){
    String[] steps = input.split(", ");
    int x =0;
    int y = 0;
    int directions = 0; //0 N; 1 E; 2 S; 3 W;
    List<int[]> visited = new ArrayList<>();
    visited.add(new int[]{0,0});

    for(String step: steps){
      char turn = step.charAt(0);
      int distance = Integer.parseInt(step.substring(1));

      if(turn == 'R'){
        directions = (directions + 1)%4;
      }
      else if (turn == 'L'){
        directions = (directions + 3)%4;
      }
      for (int i = 0; i < distance; i++) {
        if (directions == 0) y++;
        else if (directions == 1) x++;
        else if (directions == 2) y--;
        else if (directions == 3) x--;

        for (int [] pos: visited){
          if (pos[0]== x && pos[1]==y){
            return Math.abs(x)+Math.abs(y);
        }
        }
        visited.add(new int []{x,y});
      }
    }
    return -1;
  }
}

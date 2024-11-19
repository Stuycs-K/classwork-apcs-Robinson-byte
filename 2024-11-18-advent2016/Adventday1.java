import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Adventday1{
  public static void main(String[] args){
    try{
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        String instructions = scanner.nextLine();
        scanner.close();
        System.out.println (distance(instructions));
    }
    catch(FileNotFoundException e){
      System.out.println("File not found");
    }
  }

  public static int calculateDistance(String input){
    String steps = instructions.split(", ");
    int x =0;
    int y = 0;
    int directions = 0; //0 N; 1 E; 2 S; 3 W;

    for(String step: steps){
      char turn = step.charAt(0);
      int distance = Integer.parseInt(step.substring(0));

      if(turn == 'R'){
        direction = (directions + 1)%4;
      }
      else if (turn == 'L'){
        direction = (directions + 3)%4;
      }
      switch(directions){
        case 0: y+= distance; break;
        case 1: x+= distance; break;
        case 2: y-= distance; break;
        case 3: x-= distance; break;
      }
    }
    return Math.abs(x)+Math.abs(y);
  }
}

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

    for(String step: steps){
      char turn = step.charAt(0);
      int distance = Integer.parseInt(step.substring(1));

      if(turn == 'R'){
        directions = (directions + 1)%4;
      }
      else if (turn == 'L'){
        directions = (directions + 3)%4;
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

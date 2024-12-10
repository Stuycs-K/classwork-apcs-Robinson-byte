import java.util.Scanner;
import java.util.Random; 

class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Welcome to my rpg! ");
    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);

    Adventurer player = new Warrior(userName, 20);
    Adventurer enemy = new CodeWarrior("Conan",20);

    System.out.println("Let the battle begin!! :)");


    boolean finishGame = false;
    while(player.getHP()>0 && enemy.getHP()>0){
      System.out.println("\n Player: "+ player.getName()+ ", " +player.getHP()
      + "/" + player.getmaxHP()+ "HP" + player.getSpecial() + "/" +player.getSpecialMax()+ " " 
      + player.getSpecialName());

      System.out.println("\n Enemy: "+ enemy.getName()+ ", "+ enemy.getHP()
      + "/" +enemy.getmaxHP()+ "HP" + enemy.getSpecial() + "/" +enemy.getSpecialMax()+ " " 
      + enemy.getSpecialName());

      System.out.println("\nType: (a)ttack / (sp)ecial / (su)pport / (q)uit");
      String action = userInput.nextLine().trim().toLowerCase();
      
      
      if (action.equals("q") || action.equals("quit")){
        System.out.println("You quit the game. Goodbye!!!");
        break;
      } else if (action.equals("sp") || action.equals("special")){
        System.out.println("\n" +player.specialAttack(enemy));
      } else if (action.equals("su") || action.equals("support")){
        System.out.println("\n" +player.support());
      } else if (action.equals("a") || action.equals("attack")){
        System.out.println("\n" +player.attack(enemy));
      }
      else{
        System.out.println("Error: Invalid input. Try again. :)");
      }

      if(enemy.getHP()<=0){
        System.out.println("\nYou defeated " +enemy.getName()+ "! Congratulations!");
        break;
      }else if(player.getHP()>0 && !finishGame){
        int enemyChoice = rand.nextInt(3);
        if(enemyChoice == 0){
          System.out.println("\n" +enemy.attack(player));
        } else if(enemyChoice == 1){
          System.out.println("\n" +enemy.specialAttack(player));
        } else {
          System.out.println("\n" + enemy.support());
        }

        if (player.getHP()<=0){
          System.out.println("\n" + player.getName() + " has been defeated. Game over! :(");
          break;
        }
      }
    }
    userInput.close();
  }
}

import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    System.out.println("Welcome to my rpg! ");
    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);

    Adventuer player = new Warrior(playerName, 20);
    Adventuer enemy = new codeWarrior("Conan",20);

    System.our.println("Let the battle begin!! :)");

    while(player.getHP()>0 && enemy.getHP()>0){
      System.out.println("Player's health: " + player.getHP);
      System.out.println("Enemy's health: " + enemy.getHP);
      
    }
  }
}

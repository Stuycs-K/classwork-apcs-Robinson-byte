public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static void sleep(int milli){
    try {
      Thread.sleep(milli);
    } catch (Exception e){
    }
  }

  private static void printStickFigure(String between){
    String walking = "  O  \n  |  \n /|\\ \n/   \\";
    String standing = "  O  \n  |  \n _|_ \n | |";
    String[] walkingParts = walking.split("\n");
    String[] standingParts = standing.split("\n");

    for (int i = 0; i<walkingParts.length;i++){
      System.out.println(walkingParts[i]+ between + standingParts[i]);
    }
  }

  public static void main(String[] args){    
    String[] themes = {
      "\u001b[38;2;255;87;51m",
      "\u001b[38;2;255;223;0m",
      "\u001b[38;2;135;206;235m",
      "\u001b[38;2;25;25;112m"
    };

    System.out.print(HIDE_CURSOR);
    for (int i = 0; i<50; i++){
      System.out.print(CLEAR_SCREEN);
      System.out.print(themes[i%themes.length]);

      int walkingSpace = (i%10)+1;
      String space = " ".repeat(walkingSpace);

      printStickFigure(space);
      System.out.print("\u001b[0m");

      sleep(200);
    }
    System.out.print(SHOW_CURSOR);
  }
}

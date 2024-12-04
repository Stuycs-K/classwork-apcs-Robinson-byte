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

  public static void main(String[] args){
    String[] frames = {
      " O | /|\\ / \\",
      " O | /|\\ _| ",
      " O | /|\\  |\\",
      " O | /|\\ _|_"

    };
    
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
      System.out.println(frames[i%frames.length]);
      System.out.print("\u001b[0m");

      sleep(200);
    }
    System.out.print(SHOW_CURSOR);
  }
}

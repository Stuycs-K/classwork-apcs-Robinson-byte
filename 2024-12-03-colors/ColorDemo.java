public Class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static void main(Strings[] args){
    int personColor;
    for(int i =0;i<60;i++){
      System.out.print("\u001b[48;2;135;206;235m"); //background skyblue
      System.out.print("\u001b["+personColor); // person is white

// 0
// |
    }
  }
}

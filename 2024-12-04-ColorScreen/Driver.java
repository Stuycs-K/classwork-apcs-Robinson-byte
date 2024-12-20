import java.util.Random;

public class Driver{
    public static void main(String[] args){
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);

    drawScreen();

    int[] randomNumbers = generateRandom(3);

    displayRandomNumbers(randomNumbers);

    separate();

    drawMiddle();

    Text.go(31,0);
    System.out.println(Text.RESET);
}

public static void drawScreen(){
    for(int i = 1; i <=80;i++){
        Text.go(1,i);
        Text.color(Text.BRIGHT, Text.MAGENTA, Text.background(Text.YELLOW));
        System.out.print("◼");

        Text.go(30, i);
        System.out.print("◼");
    }
    for(int i = 2; i <=30;i++){
        Text.go(i,1);
        Text.color(Text.BRIGHT, Text.MAGENTA, Text.background(Text.YELLOW));
        System.out.print("◼");

        Text.go(i,80);
        System.out.print("◼");
    }
    Text.go(1,1);
    System.out.print("◼");
    Text.go(1,80);
    System.out.print("◼");
    Text.go(30,1);
    System.out.print("◼");
    Text.go(30,80);
    System.out.print("◼");
}

public static int[] generateRandom(int count){
    Random random = new Random();
    int[] numbers = new int[count];
    for(int i = 0; i<count; i++){
        numbers[i]=random.nextInt(100);
    }
    return numbers;
}

public static void displayRandomNumbers(int[] numbers){
    int start = 20;
    int space = 20;
    Text.go(2,start);
    for(int i = 0; i< numbers.length;i++){
        if(numbers[i]<25){
            Text.color(Text.BRIGHT, Text.RED);
        } else if(numbers[i]>75){
            Text.color(Text.BRIGHT,Text.GREEN);
        }else{
            Text.color(Text.WHITE);
        }
        System.out.print(numbers[i]);
        Text.go(2,start+(i+1)* space);
    }
}

public static void separate(){
    Text.color(Text.BRIGHT,Text.MAGENTA,Text.background(Text.YELLOW));
    Text.go(3,2);
    for(int i = 2; i<80; i++){
        System.out.print("▤");
    }
}

public static void drawMiddle(){
    Text.go(15,40);
    Text.color(Text.DARK,Text.GREEN,Text.background(Text.WHITE),Text.ITALICS);
    System.out.print(" |~~~| ");
    Text.go(16,38);
    System.out.print(" 🐉(0~0)🐉 ");
    Text.go(17,40);
    System.out.print(" <---> ");
}
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Q how many triangles are valid?
public class TriangleTester{
   
    public static void main(String[] args) {
        countTrianglesA("inputTri.txt");
        countTrianglesB("inputTri.txt");
    }

    public static boolean validTriangle(int a, int b, int c){
        if(a + b > c &&
           b + c > a &&
           c + a > b) return true;
        return false;
    }

    //Part A
    public static int countTrianglesA(String filename){
        int sum = 0;
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while(input.hasNextLine()){
                if(validTriangle(Integer.parseInt(input.next()),
                                 Integer.parseInt(input.next()),
                                 Integer.parseInt(input.next()))) sum = sum + 1;
                if(input.hasNextLine()) input.nextLine();
            }
            input.close();
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        }

        System.out.println(sum);
        return sum;
    }

    public static int countTrianglesB(String filename){
        int sum = 0;
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);

            while(input.hasNextLine()){
                int side101 = Integer.parseInt(input.next());
                int side201 = Integer.parseInt(input.next());
                int side301 = Integer.parseInt(input.next());

                int side102 = Integer.parseInt(input.next());
                int side202 = Integer.parseInt(input.next());
                int side302 = Integer.parseInt(input.next());

                int side103 = Integer.parseInt(input.next());
                int side203 = Integer.parseInt(input.next());
                int side303 = Integer.parseInt(input.next());

                if(validTriangle(side101, side102, side103)) sum = sum + 1;
                if(validTriangle(side201, side202, side203)) sum = sum + 1;
                if(validTriangle(side301, side302, side303)) sum = sum + 1;
                if(input.hasNextLine()) input.nextLine();
            }
            input.close();
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        }

        System.out.println(sum);
        return sum;
    }

   
}
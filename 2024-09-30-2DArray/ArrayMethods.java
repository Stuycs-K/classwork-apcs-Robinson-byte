// Brian Zheng: brianz76@nycstudents.net
// Robinson Zhang: robinsonz@nycstudents.net

public class ArrayMethods {

  public static String arrToString(int[]nums){
    String arrayConvert= "[";
    for (int i = 0; i< nums.length; i++){
      arrayConvert+=nums[i];
      if(i<nums.length-1){
        arrayConvert+=", ";
      }
    }
    arrayConvert+="]";
    return arrayConvert;
  }

  public static String arrToString(int[][] nums){
    String arrayConvert= "[";
    for (int i = 0; i< nums.length; i++){
      arrayConvert += arrToString(nums[i]);
      if (i<nums.length-1){
        arrayConvert+= ", ";
      }
    }
    arrayConvert+="]";
    return arrayConvert;
  }

  public static int arr2DSum(int[][] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }

  public static int [][] swapRC(int[][]nums){
    int columns = nums[0].length;
    int rows = nums.length;
    int[][] swapped = new int[columns][rows];
    for (int i = 0; i<rows; i++){
      for (int j=0; j<columns; j++){
        swapped [j][i]= nums [i][j];
      }
    }
    return swapped;
  }
  
  public static void replaceNegative(int [][] vals) {
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (vals[i][j] < 0) {
          if (i == j) {
            vals[i][j] = 1;
          }
          else {
            vals[i][j] = 0;
          }
        }
      }
    }
  }

  public static int[][]copy(int[][]nums){
    int [][] copied2D = new int[nums.length][];
    for (int i = 0; i< nums.length; i++){
      copied2D[i]= new int[nums[i].length];
      for (int j=0;j<nums[i].length; j++){
        copied2D[i][j] = nums[i][j];
      }
    }
    return copied2D;
  }

  public static void main(String[] args) {
    // array 2D sum test cases
    System.out.println(arr2DSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}) == 45);
    System.out.println(arr2DSum(new int[][] {{-15, -30,  -4}, {-5, -1, -23}, {-13, -2, -7}}) == -100);
    System.out.println(arr2DSum(new int[][] {{16, 14}, {32}, {812}}) == 874);

    // arrToString for 2d tests
    System.out.println(arrToString(new int[][] {{1, 2}, {4, 5}, {6, 7}}));
    System.out.println(arrToString(new int[][] {{}}));
    System.out.println(arrToString(new int[][] {{1, 2, 3}, {4, 5}, {6}}));

    //swapRC tests
    int[][] result = swapRC(new int[][]{{1, 2, 3},{4, 5, 6}});
    int[][] result1 = swapRC(new int[][]{{1, 2},{4, 5},{7, 8}});
    int[][] result2 = swapRC(new int[][]{{1, 2}});
    System.out.println(arrToString(result));
    System.out.println(arrToString(result1));
    System.out.println(arrToString(result2));

    // replaceNegative tests
    int[][] test1 = new int[][] {{9, -2, -65},
                                 {-9, -6, 92}};
    replaceNegative(test1);
    System.out.println(arrToString(test1));

    test1 = new int[][] {{-9, -2, -65},
                                 {-9, -6, 92},
                                 {-8, 732, -6}};
    replaceNegative(test1);
    System.out.println(arrToString(test1));

    // copy tests
    int[][] original = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] copied = copy(original);

    System.out.println("Original: " + arrToString(original));
    System.out.println("Copied: " +arrToString(copied));  
  }
}

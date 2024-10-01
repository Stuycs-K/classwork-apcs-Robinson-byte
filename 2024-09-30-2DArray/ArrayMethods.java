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
  

  public static void main(String[] args) {
    // array 2D sum test cases
    System.out.println(arrr2DSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}) == 45);
    System.out.println(arr2DSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}) == 45);

    // arrToString for 2d tests
    System.out.println(arrToString(new int[][] {{1, 2}, {4, 5}, {6, 7}}));

    //swapRC tests
    int[][] result = swapRC(new int[][]{{1, 2, 3},{4, 5, 6}});
    System.out.println(arrToString(result));
  }
}

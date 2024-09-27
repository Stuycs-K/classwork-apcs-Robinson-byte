public class MyArrays{
  public static String aryToString(int[]nums){
    String arrayConvert= "[";
    for (int i = 0; i<= nums.length; i++){
      arrayConvert+=nums[i];
    }
    arrayConvert+="]";
    return arrayConvert;
  }
public static void main(String[] args){
  System.out.println(aryToString(new int[] {1,2,3,4,5}));
  System.out.println(aryToString(new int[] {}));
}
}

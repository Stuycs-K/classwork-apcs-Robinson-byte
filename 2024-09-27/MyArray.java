public class MyArray{
  public static String aryToString(int[]nums){
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
public static void main(String[] args){
  System.out.println("Test 1" + aryToString(new int[]{1,2,3,4,5}));
  System.out.println("Test 2" + aryToString(new int[] {}));
  System.out.println("Test 3" + aryToString(new int[] {321}));
  System.out.println("Test 4" + aryToString(new int[] {3,3,3,3}));
}
}

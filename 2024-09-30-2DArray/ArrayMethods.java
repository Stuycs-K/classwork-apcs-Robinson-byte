// Brian Zheng: brianz76@nycstudents.net
// Robinson Zhang: robinsonz@nycstudents.net

public class ArrayMethods {
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

  
}

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

  public static int[] returnCopy(int[] ary){
    int[] result = new int[ary.length];
    for(int i = 0; i< ary.length; i++){
      result[i]=ary[i];
    }
    return result;
  }

  public static int[] concatArray(int[] ary1, int[] ary2){
    int[] result = new int[ary1.length+ary2.length];
    for (int i =0; i<ary1.length;i++){
      result[i]=ary1[i];
      // a copy of the numbers in ary1 are in result
    }
    for (int i =0; i<ary2.length;i++){
    result[ary1.length+i]=ary2[i];
    //numbers in ary2 are copied into result after the numbers in ary1
    }
    return result;
  }

public static void main(String[] args){
  //Testing aryToString
  System.out.println("Test 1" + aryToString(new int[]{1,2,3,4,5})); //ary with multiple numbers
  System.out.println("Test 2" + aryToString(new int[] {})); //empty ary
  System.out.println("Test 3" + aryToString(new int[] {321})); //one number ary
  System.out.println("Test 4" + aryToString(new int[] {3,3,3,3})); //ary with multiple of the same number

  //Testing returnCopy
  int [] testers=  {1,2,3,4,5,6,7}; //ary with multiple numbers
  int [] mine =returnCopy(testers); //run returnCopy here then compare using aryToString
  System.out.println("Test 1: Original array" + aryToString(testers));
  System.out.println("Test 1: Copied array" + aryToString(mine));

  testers[0]= 777; //changing one number in the ary shouldn't change the copied ary  
  System.out.println("Test 2: Original array" + aryToString(testers));
  System.out.println("Test 2: Copied array" + aryToString(mine));

  int [] testersEmpty=  {}; //empty ary
  int [] mineEmpty =returnCopy(testersEmpty);
  System.out.println("Test 3: Original array" + aryToString(testersEmpty));
  System.out.println("Test 3: Copied array" + aryToString(mineEmpty));

  //Testing concatArry
  //two arrays with numbers in them
  int [] ary1 = {12,3,321,32};
  int [] ary2 = {154,1232,9231};
  int [] myConcat = concatArray(ary1,ary2);
  System.out.println("Concatenated array" + aryToString(myConcat));

  //one empty array
  int [] aryEmpty = {};
  int [] myConcatEmpty = concatArray(aryEmpty,ary2);
  System.out.println("Concatenated array" + aryToString(myConcatEmpty));
}
}

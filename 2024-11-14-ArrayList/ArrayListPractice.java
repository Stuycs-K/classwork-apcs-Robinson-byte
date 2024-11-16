
import java.util.ArrayList;
public class ArrayListPractice{
  public static void main(String[] args){
    ArrayList<String> arr1 = createRandomArray(0);
    ArrayList<String> arr2 = createRandomArray(2);
    ArrayList<String> arr3 = createRandomArray(10);
    ArrayList<String> arr4 = createRandomArray(7);

    System.out.println(arr1);
    System.out.println(arr2);
    System.out.println(arr3);
    System.out.println(arr4);

    replaceEmpty(arr1);
    replaceEmpty(arr2);
    replaceEmpty(arr3);
    replaceEmpty(arr4);

    System.out.println(arr1);
    System.out.println(arr2);
    System.out.println(arr3);
    System.out.println(arr4);

    ArrayList<String> rarr1 = makeReversedList(arr1);
    ArrayList<String> rarr2 = makeReversedList(arr2);
    ArrayList<String> rarr3 = makeReversedList(arr3);
    ArrayList<String> rarr4 = makeReversedList(arr4);

    System.out.println(rarr1);
    System.out.println(rarr2);
    System.out.println(rarr3);
    System.out.println(rarr4);

}

  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> arrayList = new ArrayList<String>(size);
    for(int i = 0; i < size; i++){
      int num = (int)(Math.random() * 11);
      if(num == 0){
        arrayList.add("");
      }
      else{
        arrayList.add(""+num);
      }
    }
    return arrayList;
  }


  public static void replaceEmpty( ArrayList<String> original){
    for(int i = 0; i<original.size(); i++){
      if (original.get(i)== ""){
        original.set(i,"empty");
      }
    }    //Modify the ArrayList such that it has all of the empty strings are
    //replaced with the word "Empty".
  }


public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String> reversed= new ArrayList<String>(original.size());
    for(int i = original.size()-1; i>=0; i--){
      reversed.add(original.get(i));
    }
    return reversed;
  //return a new ArrayList that is in the reversed order of the original.
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    ArrayList<String> combined = new ArrayList<String>(a.size() + b.size());
    for(int i = 0; i < Math.min(a.size(), b.size()); i++){
      combined.add(a.get(i));
      combined.add(b.get(i));
      if (i == a.size()-1){
        // combined.add(b)
      }
    }
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  }
}
ArrayListPractice.java
Displaying ArrayListPractice.java.
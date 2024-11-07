public class Driver{
  public static void main(String[] args){
    Animal a1 = new Animal("moo", 5, "cow");
    a1.speak();
    Bird b1 = new Bird("cheep", 4, "cow2", 1.2, "red");
    b1.speak();
  }
}

// When we overrided the speak method from Animal class to the Bird class,
// it changed the print and added the line The Mighty in from the name variable.
public class Driver{
  public static void main(String[] args){
    Animal a1 = new Animal("moo", 5, "cow");
    a1.speak();
    Bird b1 = new Bird("cheep", 4, "cow2", 1.2, "red");
    b1.speak();

    Bird b2 = new Animal(...);
    Animal a2 = new Bird(...);
  }
}

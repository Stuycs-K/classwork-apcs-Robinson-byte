// When we overrided the speak method from Animal class to the Bird class,
// it changed the print and added the line The Mighty in from the name variable.
// Overriding allows the subclass to moditfy behavior specific to their class even when using superclass methods.
//  The Bird b2 = new Animal(...) doesn't work as not every Animal is a Bird.
//  This recals the is...a relationship as Bird is a type of Animal but not Animals are Birds.
public class Driver{
  public static void main(String[] args){
    Animal a1 = new Animal("moo", 5, "cow");
    a1.speak();

    Bird b1 = new Bird("cheep", 4, "cow2", 1.2, "red");
    b1.speak();

    Bird b2 = new Bird("chirp", 5, "sparrow", 0.5,"brown");
    b2.speak();

    Animal a2 = new Bird("tweet",2,"canary",0.3,"yellow");
    //Bird b3 = new Animal("meow", 5, "cat");
    a2.speak();
  }
}

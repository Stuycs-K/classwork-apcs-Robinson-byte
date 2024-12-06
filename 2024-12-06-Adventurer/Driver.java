public class Driver{
    static void main(String[] args){
        Adventurer loki = new Warrior("Loki", 40);
        Adventurer thor = new Warrior("Thor", 80);

        System.out.println(loki.attacks(thor));
        System.out.println("Thor's health should be <80" + thor.getHP());
    }
}
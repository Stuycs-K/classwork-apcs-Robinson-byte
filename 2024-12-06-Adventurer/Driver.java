public class Driver{
    public static void main(String[] args){
        Adventurer loki = new Warrior("Loki", 40);
        Adventurer thor = new Warrior("Thor", 80);

        System.out.println(loki.attack(thor));
        System.out.println("Thor's damaged health is "+ thor.getHP());

        System.out.println(loki.support(thor));
        System.out.println("Thor's healed health is "+ thor.getHP());

        System.out.println(thor.support());
        System.out.println("Thor's self healed health is "+ thor.getHP());

        System.out.println(loki.specialAttack(thor));

        loki.setSpecial(10);
        System.out.println(loki.specialAttack(thor));
        System.out.println("Thor's health after special attack is "+ thor.getHP());
    }
}
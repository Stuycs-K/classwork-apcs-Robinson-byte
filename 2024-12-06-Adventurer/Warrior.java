import java.util.Random;

public class Warrior extends Adventurer{
    public int rage;
    private final int maxRage;

    public Warrior(String name, int hp){
        super(name,hp);
        this.rage=0;
        this.maxRage=10;
    }

    @Override
    public String getSpecialName(){
        return "Rage";
    }


    @Override
    public int getSpecial(){
        return this.rage;
    }

    @Override
    public void setSpecial(int n){
        if(n>maxRage){
            this.rage = maxRage;
        }
        else if (n<0){
            this.rage =0;
        }
        else{
            this.rage=n;
        }
    }

    @Override
    public int getSpecialMax(){
        return this.maxRage;
    }

    @Override
    public String attack(Adventurer other){
        Random rand = new Random();
        int damage = rand.nextInt(10)+1;
        restoreSpecial(1);
        other.applyDamage(damage);
        return this.getName() + " attacks " + other.getName() + " for " + damage + " damage ";
    }

    @Override
    public String support(Adventurer other){
        Random rand = new Random();
        int heal = rand.nextInt(3)+1;
        other.setHP(Math.min(other.getHP()+heal,other.getmaxHP()));
        return this.getName() + " supports " + other.getName() + " healing for " + heal + " HP ";
    }

    @Override
    public String support(){
        Random rand = new Random();
        int heal = rand.nextInt(3)+1;
        this.setHP(Math.min(this.getHP()+heal,this.getmaxHP()));
        restoreSpecial(2);
        return this.getName() + " heals themselves for " + heal + " HP and gains 2 rage ";
    }

    @Override
    public String specialAttack(Adventurer other){
        if(this.getSpecial()< 3){
            return this.getName() + " tried to use their special, but doesn't have enough Rage";
        }
        else{
            this.setSpecial(this.getSpecial()-3);
            int damage = 15;
            other.applyDamage(damage);
            return this.getName()+ " used a special attack on " + other.getName() + " for 15 damage";
        }
    }


}

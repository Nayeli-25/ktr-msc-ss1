package exceptions;

public class Warrior extends Character {
    
    public Warrior(String name) {
        this.name = name;
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        this.RPGClass = "Warrior";
        System.out.println(this.name + ": My name will go down in history!");
    }

    @Override
    public void attack(String argument) throws WeaponException {
        super.attack(argument);
    }
}

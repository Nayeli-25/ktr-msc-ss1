package exceptions;

public class Mage extends Character {
    
    public Mage(String name) {
        this.name = name;
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        this.RPGClass = "Mage";
        System.out.println(this.name + ": May the gods be with me.");
    }
    
    @Override
    public void attack(String argument) throws WeaponException {
        super.attack(argument);
    }
}

package exceptions;

public abstract class Character implements Movable {
    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    //final String RPGClass = Thread.currentThread().getStackTrace()[1].getClassName();
    protected String RPGClass;

    //---------------------------- Getters -------------------------------------
    public String getName() {
        return name;
    }
    public int getLife() {
        return life;
    }
    public int getAgility() {
        return agility;
    }
    public int getStrength() {
        return strength;
    }
    public int getWit() {
        return wit;
    }
    public String getRPGClass() {
        return RPGClass;
    }
    
    //------------------------- Attack method ----------------------------------
    public void attack(String weapon) throws WeaponException {
        
            if(this.RPGClass == "Warrior" && (weapon == "hammer" || weapon == "sword")) {
                    System.out.println(this.name + ": Rrrrrrrrr....");
                    System.out.println(this.name + ": I'll crush you with my " + weapon + "!");
            }
            else if(this.RPGClass == "Mage" && (weapon == "magic" || weapon == "wand")) {
                    System.out.println(this.name + ": Rrrrrrrrr....");
                    System.out.println(this.name + ": Feel the power of my " + weapon + "!");
            }
            else throw new WeaponException(this.RPGClass, this.name, weapon);
    }
    
    //----------------------- TryToAttack method -------------------------------
    public void tryToAttack(String weapon) {
        try {
            this.attack(weapon);
        } catch (WeaponException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    //----------------------- Movable interface --------------------------------
    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right " + this.getCompliment());
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left " + this.getCompliment());
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward " + this.getCompliment());
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back " + this.getCompliment());
    }
    
    //----------------------- Movments compliment ------------------------------
    private String getCompliment() {
        String compliment = "";
        if (this.RPGClass == "Warrior") { 
            compliment = "like a bad boy.";
        }
        else if (this.RPGClass == "Mage") { 
            compliment = "furtively.";
        }
        return compliment;
    }
    
    //----------------------- Unsheathe method ---------------------------------
    public void unsheathe() {
        System.out.println(this.name + ": *unsheathes his weapon*");
    }
}

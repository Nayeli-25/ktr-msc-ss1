package exceptions;

public class WeaponException extends Exception {

    public String message;

    public WeaponException(String RPGClass, String name, String weapon) {
        if (weapon == "") {
            this.message = name + ": I refuse to fight with my bare hands.";
        }
        else if (RPGClass == "Warrior"){
            this.message = name + ": A " + weapon + "?? What should I do with this?!";
        }
        else if (RPGClass == "Mage"){
            this.message = name + " I don't need this stupid " + weapon + "! Don't misjudge my powers!";
        }
        else this.message = "Error";
    }
    
    @Override
    public String getMessage() {
        return message;
    }
}

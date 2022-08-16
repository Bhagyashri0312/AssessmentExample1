
public class Dog {
    private String name;
    private int numberOfLegs;

    public Dog(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public String bark(String bark, int numberOfTimes, boolean toUppercase) {

        if (toUppercase == true) {
            return bark.repeat(numberOfTimes).toUpperCase();
        } else return bark.repeat(numberOfTimes).toLowerCase();
    }

    public String description() {
        return getName() + " is a dog with " + numberOfLegs + " legs.";
    }

    public String description(boolean exclamation) {
        if (exclamation == true) {
            return getName() + " is a dog with " + numberOfLegs + " legs!";
        } else return getName() + " is a dog with " + numberOfLegs + " legs.";
    }
}

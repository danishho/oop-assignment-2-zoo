
/*
 * Bird class represents a bird in the zoo.
 * It inherits attributes and methods from Animal class.
 */

public class Bird extends Animal {

    private double wingSpanCm;

    // Constructor
    public Bird(String name, int age, String gender, double weightKg, double wingSpanCm) {
        super(name, age, gender, weightKg);
        setWingSpanCm(wingSpanCm);
    }

    public double getWingSpanCm() {
        return wingSpanCm;
    }

    public void setWingSpanCm(double wingSpanCm) {
        this.wingSpanCm = wingSpanCm;
    }

    // Override eat() method from Animal class
    @Override
    public void eat() {
        System.out.println(getName() + " pecks at seeds.");
    }

    // Displays the bird's wingspan when flying
    public void fly() {
        System.out.print(getName() + " flies with a wingspan of " + getWingSpanCm() + " cm.");
    }

    // Checks whether the bird can fly through a gap
    public void canFlyThroughGap(double gapWidthCm) {

        if (gapWidthCm <= getWingSpanCm()) {
            System.out.println(getName() + " can fly through the gap.");
        } else {
            System.out.println("ERROR :: " + getName() + " cannot fly through the gap because the gap is too narrow.");
        }
    }
}

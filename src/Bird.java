
public class Bird extends Animal {

    //attribute
    private double wingSpanCm;

    //constructor
    public Bird(String name, int age, String gender, double weightKg, double wingSpanCm) {
        super(name, age, gender, weightKg);
        setWingSpanCm(wingSpanCm);
    }

    //getter
    public double getWingSpanCm() {
        return wingSpanCm;
    }

    //setter
    public void setWingSpanCm(double wingSpanCm) {
        this.wingSpanCm = wingSpanCm;
    }

    //override eat() method from Animal
    @Override
    public void eat() {
        System.out.println(getName() + " pecks at seeds.");
    }

    //fly method
    public void fly() {
        System.out.println(getName() + " flies with a wingspan of "
                + getWingSpanCm() + " cm.");
    }

    //check whether bird can fly through a gap
    public void canFlyThroughGap(double gapWidthCm) {

        if (gapWidthCm <= getWingSpanCm()) {
            System.out.println(getName() + " can fly through the gap.");
        } else {
            System.out.println(getName() + " cannot fly through the gap.");
        }
    }
}

public class Fish extends Animal {

    private double maxDepthM;

    // Constructor
    public Fish(String name, int age, String gender, double weightKg, double maxDepthM) {
    	super(name, age, gender, weightKg);
        setMaxDepthM(maxDepthM);
    }

    // Getter
    public double getMaxDepthM() {
        return maxDepthM;
    }

    // Setter
    public void setMaxDepthM(double maxDepthM) {
        this.maxDepthM = maxDepthM;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " nibbles plankton.");
    }

    public void swim() {
        System.out.println(getName() + " swims down to " + getMaxDepthM() + " m.");
    }

    public void canDive(double depthM) {
        if (depthM <= getMaxDepthM()) {
            System.out.println(getName() + " can dive to " + depthM + " m.");
        } 
        
        else {
            System.out.println("Error: " + getName() + " cannot dive to " + depthM + " m. Maximum depth is " + getMaxDepthM() + " m.");
		}
	}
}
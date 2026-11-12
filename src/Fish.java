// Represents a fish that inherits from Animal that can eat, swim and dive
public class Fish extends Animal {

    private double maxDepthM;

    // Constructor
    public Fish(String name, int age, String gender, double weightKg, double maxDepthM) {
    	super(name, age, gender, weightKg);
        setMaxDepthM(maxDepthM);
    }

    public double getMaxDepthM() {
        return maxDepthM;
    }

    public void setMaxDepthM(double maxDepthM) {
        this.maxDepthM = maxDepthM;
    }

    // Overrides the eat method from Animal class
    @Override
    public void eat() {
        System.out.println(getName() + " nibbles plankton.");
    }

    public void swim() {
        System.out.println(getName() + " swims down to " + getMaxDepthM() + " m.");
    }
    
    // Checks whether the fish can dive to the given depth
    public void canDive(double depthM) {
        if (depthM <= getMaxDepthM()) {
            System.out.println(getName() + " can dive to " + depthM + " m.");
        } 
        
        else {
            System.out.println("ERROR :: Depth exceeds maximum diving depths.");
		}
	}
}
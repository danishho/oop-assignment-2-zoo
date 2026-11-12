
/**
 * Represents a general animal with basic attributes and behaviours.
 * Subclasses can extend this class to represent specific types of animals.
 */

public class Animal {

    private String name;
    private int age = 0;
    private String gender ;
    private double weightKg = 1.0;

    private static int animalCount = 0;

    private static final int DEFAULT_AGE = 0;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 100;
    
    private static final double DEFAULT_WEIGHT_KG = 1.0;
    private static final double MIN_WEIGHT_KG = 0.0;
    private static final double MAX_WEIGHT_KG = 6000.0;

    // Constructor
    public Animal(String name, int age, String gender, double weightKg) {

        setName(name);
        setGender(gender);

       
        if (validateAge(age)) {
           setAge(age);
        } else {
        	setAge(DEFAULT_AGE);
        }

        // Validate weight
        if (validateWeight(weightKg)) {
        	setWeightKg(weightKg);
        } else {
            setWeightKg(DEFAULT_WEIGHT_KG);
        }

        animalCount++;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
    	
    	 // Validate age
        if (validateAge(age)) {
            this.age = age;
            return true;
        }
        
        return false;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public boolean setWeightKg(double weightKg) {
    	
        if (validateWeight(weightKg)) {
            this.weightKg = weightKg;
            return true;
        }
        
        return false;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
    
    // Checks whether the received age is within the valid range.
    public static boolean validateAge(int age) {
    	return age >= MIN_AGE && age <= MAX_AGE;
    }
    
    // Checks whether the received weight is within the valid range.
    public static boolean validateWeight(double weightKg) {
    	return weightKg > MIN_WEIGHT_KG && weightKg <= MAX_WEIGHT_KG;
    }

    public void eat() {
        System.out.println(name + " (" + age + " years, "+ gender + ", " + weightKg + " kg) is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", gender=" + gender + ", weightKg=" + weightKg + "]";
	}
}



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

       
        if (age >= MIN_AGE && age <= MAX_AGE) {
           setAge(age);
        } else {
        	setAge(DEFAULT_AGE);
        }

        // Validate weight
        if (weightKg > MIN_WEIGHT_KG && weightKg <= MAX_WEIGHT_KG) {
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
        if (age >= MIN_AGE && age <= MAX_AGE) {
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
    	
        if (weightKg > MIN_WEIGHT_KG && weightKg <= MAX_WEIGHT_KG) {
            this.weightKg = weightKg;
            return true;
        }
        
        return false;
    }

    public static int getAnimalCount() {
        return animalCount;
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

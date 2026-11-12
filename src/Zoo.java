public class Zoo {
    public static void main(String[] args) {
        // Zoo Card B: three ordinary animals.
    	Animal animal1 = new Animal("Simba", 3, "Male", 160.5);
        Animal animal2 = new Animal("Stripe", 6, "Female", 240.0);
        Animal animal3 = new Animal("Tusker", 20, "Male", 4100.0);

        System.out.println("=== STEP 3: ANIMALS ===");
        animal1.eat();
        animal1.sleep();
        animal2.eat();
        animal2.sleep();
        animal3.eat();
        animal3.sleep();

        // Zoo Card B: one bird and one fish.
        Bird bird = new Bird("Rio",4,"Male",0.9,35.0);
        Fish fish = new Fish("Finn",2,"Female",0.8,30.0);

        System.out.println("\n=== STEP 4: BIRD AND FISH ===");
        bird.fly();
        System.out.println();
        fish.swim();
        fish.canDive(30.0);

        System.out.println("\n=== STEP 5: ONE ARRAY, ONE LOOP ===");
        Animal[] animals = {animal1, animal2, animal3, bird, fish};
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].sleep();
        }

        System.out.println("\nTotal animals created: " + Animal.getAnimalCount());

        // Step 6A: Gaia is Animal 1 on Zoo Card B
        System.out.println("\n=== STEP 6A: CHANGE SIMBA'S WEIGHT ===");
        animal1.setWeightKg(160.0);
        animal1.eat();
        animal1.setWeightKg(7000.0);
        animal1.eat();
        System.out.println();
        
        
    }
    
}

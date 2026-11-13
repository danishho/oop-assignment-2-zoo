/**
 * Represents a testing class for the Zoo program.
 * Tests the Animal, Bird, and Fish classes using normal,
 * boundary, and invalid values to ensure the methods
 * and behaviours work correctly.
 */
public class ZooTest {

    public static void main(String[] args) {

        // T1: Test animal eating
        System.out.println("===== T1: Normal Animal =====");

        Animal animal1 = new Animal("Simba", 3, "Male", 160.5);
        animal1.eat();


        // T2: Test eating and sleeping for all animals
        System.out.println("\n===== T2: All Animals =====");

        Animal animal2 = new Animal("Simba", 3, "Male", 160.5);
        Animal animal3 = new Animal("Stripe", 6, "Female", 240.0);
        Animal animal4 = new Animal("Tusker", 20, "Male", 4100.0);
        Bird bird1 = new Bird("Rio", 4, "Male", 0.9, 35.0);
        Fish fish1 = new Fish("Finn", 2, "Female", 0.8, 30.0);

        Animal[] animals = {animal2, animal3, animal4, bird1, fish1};

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }


        // T3: Test valid age boundaries
        System.out.println("\n===== T3: Valid Age =====");

        Animal animal5 = new Animal("Tester", 5, "Male", 100.0);

        System.out.println("Set age to 0: " + animal5.setAge(0));
        System.out.println("Set age to 100: " + animal5.setAge(100));
        System.out.println("Final age: " + animal5.getAge());


        // T4: Test invalid age
        System.out.println("\n===== T4: Invalid Age =====");

        Animal animal6 = new Animal("Tester", 5, "Male", 100.0);

        System.out.println("Set age to 101: " + animal6.setAge(101));
        System.out.println("Set age to -1: " + animal6.setAge(-1));
        System.out.println("Final age: " + animal6.getAge());


        // T5: Test invalid weight
        System.out.println("\n===== T5: Invalid Weight =====");

        Animal animal7 = new Animal("Tester", 5, "Male", 100.0);

        System.out.println("Set weight to 0: " + animal7.setWeightKg(0));
        System.out.println("Set weight to -5: " + animal7.setWeightKg(-5));
        System.out.println("Final weight: " + animal7.getWeightKg());


        // T6: Test valid and invalid weight boundaries
        System.out.println("\n===== T6: Weight Boundary =====");

        Animal animal8 = new Animal("Tester", 5, "Male", 100.0);

        System.out.println("Set weight to 6000.0: " + animal8.setWeightKg(6000.0));
        System.out.println("Set weight to 6000.1: " + animal8.setWeightKg(6000.1));
        System.out.println("Final weight: " + animal8.getWeightKg());


        // T7: Test animal counter
        System.out.println("\n===== T7: Animal Counter =====");

        int countBefore = Animal.getAnimalCount();

        Animal animal9 = new Animal("Tester", 5, "Male", 100.0);
        Bird bird2 = new Bird("Rio", 4, "Male", 0.9, 35.0);
        Fish fish2 = new Fish("Finn", 2, "Female", 0.8, 30.0);

        int countAfter = Animal.getAnimalCount();

        System.out.println("Counter before: " + countBefore);
        System.out.println("Counter after: " + countAfter);
        System.out.println("Counter increased by: " + (countAfter - countBefore));


        // T8: Test invalid constructor values
        System.out.println("\n===== T8: Invalid Constructor =====");

        Animal animal10 = new Animal("Tester", 150, "Male", -3.0);

        System.out.println("Age: " + animal10.getAge());
        System.out.println("Weight: " + animal10.getWeightKg());


        // Custom Test 1: Test Bird canFlyThroughGap()
        System.out.println("\n===== O1: Bird =====");

        Bird bird3 = new Bird("Rio", 4, "Male", 0.9, 35.0);

        bird3.canFlyThroughGap(40.0);
        bird3.canFlyThroughGap(30.0);
       

        // Custom Test 2: Test Fish canDive()
        System.out.println("\n===== O1: Fish =====");

        Fish fish3 = new Fish("Finn", 2, "Female", 0.8, 30.0);

        fish3.canDive(20.0);
        fish3.canDive(40.0);

    }
}

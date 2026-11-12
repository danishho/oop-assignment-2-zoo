
public class ZooTest {

	public static void main(String[] args) {
		
		//t1 (eat)
		System.out.println("==== START :: T1 ====");
		System.out.println();
		
		Animal animal1= new Animal("Simba", 3, "Male", 160.5);
		animal1.eat();
		
		System.out.println();
		System.out.println("==== END :: T1 ====");
		System.out.println();
		
		//t2 (eat then sleep)
		System.out.println("==== START :: T2 ====");
		System.out.println();
		
		Animal animal2 = new Animal("Stripe", 6, "Female", 240.0);
		Animal animal3 = new Animal("Tusker", 20, "Male", 4100.0);
		Bird bird1 = new Bird("Rio", 4, "Male", 0.9, 35.0);
		Fish fish1 = new Fish("Finn", 2, "Female", 0.8, 30.0);
		
		Animal[] animals = {animal1, animal2, animal3, bird1, fish1};
		
		for (Animal animal : animals) {
			animal.eat();
			animal.sleep();
		}
		
		System.out.println();
		System.out.println("==== END :: T2 ====");
		System.out.println();
		
	}
	
	
}

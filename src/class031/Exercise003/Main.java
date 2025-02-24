package class031.Exercise003;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Animal("Camel", "Yellow", "Land", 150, 2);
		Fish a2 = new Fish("Shark", "Blue", "Sea", 300, 1, "Fin and Tail");
		Mammal a3 = new Mammal("Bear", "Red", "Land", 180, 0.5, "Honey");
		
		Animal[] animals = new Animal[3];
		animals[0] = a1;
		animals[1] = a2;
		animals[2] = a3;
		
		System.out.println("-------------------------");
		for(Animal animal: animals) {
			System.out.println(animal);
			System.out.println("-------------------------");
		}
	}

}

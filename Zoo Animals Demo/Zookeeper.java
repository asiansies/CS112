import zooanimals.*;

public class Zookeeper {

	public static void main(String[] args) {
		
		Fox mrRipley = new Fox();
		GilaMonster geegee = new GilaMonster();;
		Panda poh = new Panda();
		
		prompt(mrRipley);
		prompt(geegee);
		prompt(poh);
				
	}
	
	public static void prompt(ZooAnimal animal) {
		System.out.println("Zookeeper: What's your favorite food?");
		System.out.println(animal.toString() + ": " + animal.getFavFood());
	}

}

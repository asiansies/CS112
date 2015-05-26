package zooanimals;

public class ZooAnimal {
	
	// favFood is protected so its subclasses can access the field.
	protected String favFood;

	public ZooAnimal() {
		favFood = "";
	}
	
	public String getFavFood() {
		return favFood;
	}
}

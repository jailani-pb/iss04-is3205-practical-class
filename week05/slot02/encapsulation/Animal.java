package week05.slot02.encapsulation;

public class Animal {

	public String name;
	private int hungerLevel;
	protected static int noOfAnimals = 0;
	
	public Animal(String name) {
		this.name = name;
		this.setHungerLevel(0);
	}
	
	public int getHungerLevel() {
		return hungerLevel;
	}
	
	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
		if(this.hungerLevel < 0) {
			this.hungerLevel = 0;
		}
		if(this.hungerLevel > 100) {
			this.hungerLevel = 100;
		}
	}
	
	public String eat() {
		return name + " is eating";
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", hungerLevel=" + hungerLevel + "]";
	}
	
}





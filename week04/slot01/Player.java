package week04.slot01;

public class Player {

	private int id;
	public final String name;
	private int health = 100;
	private static int numberOfPlayers = 0;
	
	public Player(String name) {
		this.name = name;
		numberOfPlayers++;
		id = numberOfPlayers;
	}
	
	public int getId() {
		return id;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void reduceHealth(int damage) {
		if(damage > 0) {
			health = health - damage;
			if(health < 0) {
				health = 0;
			}
		}
	}
	
	public void increaseHealth(int heal) {
		if(heal > 0) {
			health = health + heal;
			if(health > 100) {
				health = 100;
			}
		}
	}
	
	public void attack(NonPlayableCharacter npc) {
		npc.reduceHealth(15);
		npc.hostile = true;
	}
	
	public String interact(NonPlayableCharacter npc) {
		return npc.talk(this);
	}
	
}






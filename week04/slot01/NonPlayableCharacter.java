package week04.slot01;

public class NonPlayableCharacter {

	private int id;
	public final String name;
	private int health = 100;
	private static int numberOfNPC = 0;
	
	private String[] dialogs;
	public boolean hostile = false;
	
	public NonPlayableCharacter(String name, int maxNoDialogs) {
		this.name = name;
		numberOfNPC++;
		id = numberOfNPC;
		if(maxNoDialogs >= 1) {
			dialogs = new String[maxNoDialogs];
		} else {
			dialogs = new String[5];
		}
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
	
	public void addDialog(String dialog) {
		for(int i = 0; i < dialogs.length; i++) {
			if(dialogs[i] == null) {
				dialogs[i] = dialog;
				break;
			} else {
				if(dialogs[i].equals("")) {
					dialogs[i] = dialog;
					break;
				}
			}
		}
	}
	
	public void attack(Player player) {
		player.reduceHealth(10);
	}
	
	public String talk(Player player) {
		if(hostile) {
			this.attack(player);
			return "Antah Kau! " + player.name + " (health: "
					+ player.getHealth() + ").";
		} else {
			int index = (int) (Math.random() * (dialogs.length - 1));
			return dialogs[index];
		}
	}
	
}








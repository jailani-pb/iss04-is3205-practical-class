package week04.slot02;

public class TestGame {

	public static void main(String[] args) {
		System.out.println(Player.getNumberOfPlayers());
		System.out.println(NonPlayableCharacter.getNumberOfNPC());
		System.out.println(Integer.parseInt("123"));
		
		Player player1 = new Player("ABC");
		NonPlayableCharacter npc1 = new NonPlayableCharacter("DEF", 10);
		NonPlayableCharacter npc2 = new NonPlayableCharacter("GHI", 5);
		
		for(int i = 0; i < 10; i++) {
			String dialog = "A";
			for(int j = 0; j < i; j++) {
				dialog = dialog + "A";
			}
			npc1.addDialog(dialog);
		}
		for(int i = 0; i < 5; i++) {
			String dialog = "B";
			for(int j = 0; j < i; j++) {
				dialog = dialog + "B";
			}
			npc2.addDialog(dialog);
		}
		
		System.out.println("player1 interact with npc1");
		System.out.println(player1.interact(npc1));
		System.out.println("player1 interact with npc2");
		System.out.println(player1.interact(npc2));
		
		System.out.println("player1 attack npc2");
		player1.attack(npc2);
		System.out.println("npc1 health: " + npc1.getHealth());
		System.out.println("npc2 health: " + npc2.getHealth());
		
		System.out.println("player1 interact with npc1");
		System.out.println(player1.interact(npc1));
		System.out.println("player1 interact with npc2");
		System.out.println(player1.interact(npc2));
		
		System.out.println();
		System.out.println("Testing Town.java");
		Town town1 = new Town(3, 4);
		town1.setPlayer(player1);
		town1.addNPC(npc1, 0, 1);
		town1.addNPC(npc2, 2, 2);
		
		System.out.println(town1.interactWithNPC(0, 1));
		System.out.println(town1.interactWithNPC(2, 2));
		System.out.println(town1.interactWithNPC(0, 0));
		System.out.println(town1.interactWithNPC(-1, 2));
	}
	
}





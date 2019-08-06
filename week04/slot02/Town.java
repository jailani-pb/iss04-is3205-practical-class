package week04.slot02;

public class Town {

	private Player player;
	private NonPlayableCharacter[][] npcs;
	
	public Town(int width, int height) {
		npcs = new NonPlayableCharacter[width][height];
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	private boolean checkCoordinate(int x, int y) {
		if(x >= 0 && x < npcs.length && y >= 0 && y < npcs[0].length) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addNPC(NonPlayableCharacter npc, int x, int y) {
		if(checkCoordinate(x, y)) {
			npcs[x][y] = npc;
		}
	}
	
	public String interactWithNPC(int x, int y) {
		if(checkCoordinate(x, y)) {
			if(npcs[x][y] != null) {
				return player.interact(npcs[x][y]);
			} else {
				return "Siuk sendiri kau disana!";
			}
		} else {
			return "Kampung mana kan kau aga ani?";
		}
	}
	
}





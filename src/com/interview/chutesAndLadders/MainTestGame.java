
package com.interview.chutesAndLadders;

public class MainTestGame {

	public static void main(String[] args) {
		
		Game game = new Game();
		
		game.addPlayer("Eric:");
		game.addPlayer("Paul");
		game.addPlayer("Zuck");
		
		System.out.println(game.TITLE);
		
		//First Spin to decide who is to go first
		game.firstTurn();
		
		// Display the players and their spin to see the order of turns
		for(Player player: game.getPlayers())
			System.out.println(player.getName() + " id: " + player.getId() + " spin: " + player.getFirstSpinResult());
		System.out.println();
		
		// WhileMovePlayer returns false keep playing
		while(!game.movePlayer()){
			game.changeTurn();
		}
		

	}

}

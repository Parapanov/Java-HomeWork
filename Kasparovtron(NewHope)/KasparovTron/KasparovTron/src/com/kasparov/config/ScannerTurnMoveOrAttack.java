package com.kasparov.config;
import com.kasparov.config.*;
import com.kasparovtron.pieaces.*;
import java.util.Scanner;

	public class ScannerTurnMoveOrAttack {
		
		private Player currentPlayer =  Player.WHITE;
	
		
		public void BordManager() {
			currentPlayer	=	Player.WHITE;
		}
		
		private void swichCurrentPlayer() {
			if(currentPlayer == Player.WHITE ) {
				currentPlayer	=	Player.BLACK;
			}else {
				currentPlayer	=	Player.WHITE;
		}
			
			
	
}
		
		public Player getCurrentPlayer(){
			return currentPlayer;
		}
		
		public boolean isPeiceAttack() {			
			if(PieaceType.class != null) {
				System.out.println("Peice attack");
			}else {
				System.out.println("Peice cant attack");
			}
			return isPeiceMove();
		}
		
		public static boolean isPeiceMove() {
			
			if(PieaceType.class != null){
				System.out.println("Peice move");
			}else {
				System.out.println("NOT Move");
			}
			return true;
		}
		public static void run() {
			isPeiceMove();
		}
}
package com.kasparovtron.test;

import com.kasparov.config.PieaceType;
import com.kasparov.config.PieacesColor;
import com.kasparov.config.Player;
import com.kasparovtron.pieaces.Chudaka;
import com.kasparovtron.pieaces.Pawn;

public class ChudakaTest {

	public static void testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward() {
		System.out.print("testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward");
	
		// 1. Arrange
		Chudaka testChudaka = new Chudaka(PieacesColor.BLACK, 9, 5, Player.BLACK,PieaceType.Chudaka);
		
		//2. act - assert
		boolean isValid = testChudaka.isMovePossible(8, 5);
		String testMessage = (isValid) ? "Valid" : "Fall";
		System.out.println(testMessage);
		
	}
	
	public static void testIfTheAttackPossible() {
		System.out.println("testIfTheAttackPossible");
		Chudaka testChudaka	=	new Chudaka(PieacesColor.BLACK,9 ,5, Player.BLACK, PieaceType.Chudaka);
		
		boolean isValid 	=	testChudaka.isAttackPossible(8, 4);
		String testMessage 	=	(isValid)	?	"Valid"	:	"Fall";
		System.out.print(testMessage);
		
	}
	public static void run() {
		testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward();
		testIfTheAttackPossible();
	}
}

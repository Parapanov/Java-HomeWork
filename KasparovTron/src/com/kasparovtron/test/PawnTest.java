package com.kasparovtron.test;

import com.kasparovtron.pieaces.Pawn;
import com.kasparov.config.PieacesColor;
public class PawnTest {

	public static void testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward() {
		System.out.print("testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward");
	
		// 1. Arrange
		Pawn testPawn = new Pawn(PieacesColor.BLACK, 8, 0);
		
		//2. act - assert
		boolean isValid = testPawn.isMovePossible(7, 0);
		String testMessage = (isValid) ? "Valid" : "Fall";
		System.out.println(testMessage);
		
	}
	public static void testIfMoveOverTwoSquereIsNotPosible() {
		System.out.print("testIfMoveOverTwoSquereIsNotPosible");
		
		Pawn testPawn = new Pawn(PieacesColor.BLACK, 8, 0);
		
		boolean isValid = (testPawn.isMovePossible(6, 0)	==	false);
		String testMessage = (isValid) ? "Valid" : "Fall";
		System.out.println(testMessage);
		
	}
	
	public static void run() {
		testIfMoveOverTwoSquereIsNotPosible();
		testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward();
	}
	
}

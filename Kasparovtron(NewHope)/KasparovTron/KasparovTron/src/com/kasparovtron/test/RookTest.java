package com.kasparovtron.test;

import com.kasparov.config.PieacesColor;
import com.kasparovtron.pieaces.Rook;

public class RookTest {
	public static void testIfThisMetodPossibleToMoveThePieceCorrectlyOFOneTONineSqueres() {
		System.out.println("testIfThisMetodPossibleToMoveThePieceCorrectlyOFOneTONineSqueres");
		
		Rook testRook	=	new Rook(PieacesColor.BLACK,0,0, null, null);
		boolean isValid = testRook.isMovePossible(0, 2);
		String testMessage	=	(isValid) ? "Valid" : "Fall";
		System.out.println(testMessage);
		}
	public static void testIfMoveOneSquereDiagonalNotPosible() {
		System.out.println("testIfMoveOneSquereDiagonalNotPosible");
		
		Rook testRook = new Rook(PieacesColor.BLACK,1,1, null, null);
		boolean isValid = (testRook.isMovePossible(0, 2)	 ==		false);
		String testMassage =	(isValid) ? "Valid" : "Fall";
		System.out.println(testMassage);
		
		}
	public static void run() {
		testIfThisMetodPossibleToMoveThePieceCorrectlyOFOneTONineSqueres();
		testIfMoveOneSquereDiagonalNotPosible();	
	}
	

}

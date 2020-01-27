package com.kasparovtron.test;

import com.kasparov.config.PieacesColor;
import com.kasparovtron.pieaces.King;

public class KingTest {
	public static void testIfTheMoveMethodPositionThePieceCorrectlyOneSquereDiagonal() {
		System.out.print("testIfTheMoveMethodPositionThePieceCorrectlyOneSquereDiagonal");
		
		King testKing	=	new	King(PieacesColor.BLACK, 1, 5, null, null);
		boolean	isValid	=	testKing.isMovePossible(1, 5);
		String testMessage	=	(isValid)	?	"Valid"	:	"Fall";
		System.out.println(testMessage);
		
	}
	public static void testIfMoveOverTwoSquereIsNotPosible() {
		System.out.print("testIfMoveOverTwoSquereIsNotPosible");
		
		King	testKing	=	new	King(PieacesColor.BLACK,0,5, null, null);
		boolean isValid	=	(testKing.isMovePossible(2, 5) == 	false);
		String testMessage	=	(isValid)	?	"Valid"	:	"Fall";
		System.out.println(testMessage);
	}
	public static void run() {
		
		testIfTheMoveMethodPositionThePieceCorrectlyOneSquereDiagonal();
		testIfMoveOverTwoSquereIsNotPosible();
	}
}
				
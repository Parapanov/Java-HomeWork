package com.kasparovtron.test;

import com.kasparov.config.PieacesColor;
import com.kasparovtron.pieaces.Knight;

public class KnightTest {
	
	public static void testIfTheMoveMethodPositionThePieceCorrectlyTreeAndOneLeftOrRightSquereForward() {
		System.out.println("testIfTheMoveMethodPositionThePieceCorrectlyTreeAndOneLeftOrRightSquereForward");
		
		Knight testKnight	=	new	Knight(PieacesColor.WHITE, 0, 1, null, null);
		
		boolean isValid	=	testKnight.isMovePossible(2, 2);
	String testMessage	=	(isValid) ? "Valic"	:	"Fall";
	System.out.println(testMessage);
	}
	public static void testIfMoveOverOneSquereIsNotPosible() {
		System.out.println("testIfMoveOverOneSquereIsNotPosible");
		Knight	testKnight	=	new	Knight(PieacesColor.WHITE,0,1, null, null);
		
		boolean isValid	=	(testKnight.isMovePossible(1,1)	==	false);
		String	testMessage	=	(isValid)	?	"Valid"	:	"Fall";
		System.out.println(testMessage);
		
		}
	public static void run() {
		testIfTheMoveMethodPositionThePieceCorrectlyTreeAndOneLeftOrRightSquereForward();
		testIfMoveOverOneSquereIsNotPosible();
	}

}

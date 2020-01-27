package com.kasparovtron.test;

import com.kasparov.config.PieacesColor;
import com.kasparov.config.Player;
import com.kasparovtron.pieaces.Bishop;

public class BishopTest {
	
public static void	testIfTheMoveMethodPositionThePieceCorrectlyMoveDiagonal() {
	System.out.println("testIfTheMoveMethodPositionThePieceCorrectlyOneToSevenSquereDiagonal");
	
	Bishop testBishop =	new Bishop(PieacesColor.WHITE,2 , 0, Player.WHITE, null);

	boolean isValid = testBishop.isMovePossible(1, 1);
	String testMessage	=	(isValid) ? "Valid" : "Fall";
	System.out.println(testMessage);
	
	}
public static void testIfMoveOverOneSquereIsNotPossible() {
	System.out.println("testIfMoveOverOneSquereIsNotPossible");	
	
	Bishop testBishop	=	new Bishop(PieacesColor.WHITE,	0,	2, null, null);
		
	boolean isValid	=	(testBishop.isMovePossible(1, 2)	==	false);
	String testMessage	=	(isValid)	?	"Valid"	:	"Fail";
	System.out.println(testMessage);
	}
public static void run() {

	testIfTheMoveMethodPositionThePieceCorrectlyMoveDiagonal();
	testIfMoveOverOneSquereIsNotPossible();
}


}

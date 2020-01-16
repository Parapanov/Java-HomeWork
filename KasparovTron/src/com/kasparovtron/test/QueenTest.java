package com.kasparovtron.test;

import com.kasparov.config.PieacesColor;
import com.kasparovtron.pieaces.Queen;

public class QueenTest {
	public static void testIfTheMoveMethodPositionThePieceCorrectlyDiagonalAndVerticlSquereForward() {
		System.out.print("testIfTheMoveMethodPositionThePieceCorrectlyDiagonalAndVerticlSquereForward");

		Queen testQueen		=	new Queen(PieacesColor.BLACK, 0, 4);
		boolean isValid 	=	testQueen.isMovePossible(4, 0);
		String testMessage	=	(isValid)	?	"Valid"	:	"Fall";
		System.out.println(testMessage);
		
}
	public static void run() {
		testIfTheMoveMethodPositionThePieceCorrectlyDiagonalAndVerticlSquereForward();
		}
	}

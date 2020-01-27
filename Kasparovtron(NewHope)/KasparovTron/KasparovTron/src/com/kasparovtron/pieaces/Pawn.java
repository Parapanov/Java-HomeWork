package com.kasparovtron.pieaces;

import com.kasparov.config.PieaceType;
import com.kasparov.config.Player;

public class Pawn extends Peice{
	
	public Pawn(String inputColor, int row, int col,Player player, PieaceType type){
		super(inputColor, row , col, player,  type);
		this.power  =	1;
		this.id		=	1;		
	}
	
	public boolean isMovePossible(int moveRow, int moveCol) {
		
		int moveRowCoeficient	=	(this.row - moveRow);
		int moveColCoeficient	=	(this.col - moveCol);
		
		boolean isRowMovementPossible = (moveRowCoeficient == 1);
		boolean isColMovementPossible = (moveColCoeficient == 0);
		
		return isRowMovementPossible && isColMovementPossible;
		
	}
	
	
	public void move(int moveRow, int moveCol) {
	
		if(this.isMovePossible(moveRow, moveCol)) {
			
			this.row	=	moveRow;
			this.col	=	moveCol;		
		}
	}
	
	public void attack(int attackRow , int attackCol) {
		
		
	}
}


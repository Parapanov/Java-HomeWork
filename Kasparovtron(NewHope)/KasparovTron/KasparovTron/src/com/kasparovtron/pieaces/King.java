package com.kasparovtron.pieaces;

import com.kasparov.config.PieaceType;
import com.kasparov.config.Player;

public class King	extends Peice {

	
	public	King(String color,int row,  int col,Player player, PieaceType type){
		super(color, row, col, player, type);
		
		this.power  =	6;
		this.id		=	6;	
	}
	public boolean isMovePossible(int moveRow, int moveCol) {
		
		int moveRowCoeficient	=	(this.row - moveRow);
		int moveColCoeficient	=	(this.col - moveCol);
		
		boolean isRowMovementPossible = (moveRowCoeficient == 0	|| moveRowCoeficient	==	1);
		boolean isColMovementPossible = (moveColCoeficient == 1	||	moveColCoeficient	==	0);
		
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

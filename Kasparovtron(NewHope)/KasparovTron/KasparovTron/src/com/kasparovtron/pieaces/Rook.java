package com.kasparovtron.pieaces;

import com.kasparov.config.PieaceType;
import com.kasparov.config.Player;

public class Rook extends Peice {
	

	public Rook(String color, int row, int col,Player player, PieaceType type){
		super(color, row, col, player, type);
		
		this.power  =	5;
		this.id		=	2;	
		
	}
	public boolean isMovePossible(int moveRow,int moveCol) {
		
		int moveRowCoeficent = (this.row - moveRow);
		int moveColCoeficent =	(this.col - moveCol);
	
		boolean isRowMovingPossible	=	(moveRowCoeficent ==	0);
		boolean isColMovingPossible	=	(moveColCoeficent <=	9);
		
		return isRowMovingPossible && isColMovingPossible;
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
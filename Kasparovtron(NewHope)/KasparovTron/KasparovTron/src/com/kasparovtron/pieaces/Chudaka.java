package com.kasparovtron.pieaces;

import com.kasparov.config.*;


public class Chudaka 
	extends Peice	
	implements CanBlast{

	public Chudaka(String color, int row , int col,Player player, PieaceType type) {
		super(color, row , col, player,  type);
		this.power =	15;
		this.id		=	7;
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
	@Override
	public void blast(int row, int col) {
		// TODO Auto-generated method stub
	if(row == 2 &&  col == 0	) {
		System.out.println("Blast Attack");
		}else return;}
	
			
public boolean isAttackPossible(int attackRow, int attackCol) {
		
		int attackRowCoeficient	=	(this.row - attackRow);
		int attackColCoeficient	=	(this.col - attackCol);
	
		boolean isRowAttackingPossible = (attackRowCoeficient == 1);
		boolean isColAttackingPossible = (attackColCoeficient >= 1);
		
		return isRowAttackingPossible && isColAttackingPossible;
		}
		
		
	
		
	@Override
	public void attack(int attackRow, int attackCol) {
		// TODO Auto-generated method stub
		if(this.isMovePossible(attackRow, attackCol)) {
		this.row	=	attackRow;
		this.col 	=	attackCol;
		
		}
	}
}

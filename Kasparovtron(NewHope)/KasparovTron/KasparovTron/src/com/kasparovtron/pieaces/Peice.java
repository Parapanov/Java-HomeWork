package com.kasparovtron.pieaces;

import com.kasparov.config.PieaceType;
import com.kasparov.config.Player;

public abstract class Peice {
	
	private PieaceType type;
	private Player player;
	public String color;
	public int power;
	public int id;
	
	public int row;
	public int col;

	public Peice(String color, int row, int col	,Player player, PieaceType type) {
		this.type=type;
		this.player=player;
		
		this.color	=	color;
		this.row	=	row;
		this.col	=	col;
	}
	public String toString() {
	
	return player.toString()+type.toString();
	}
	public Player getPlayer(){return player;}
	public PieaceType getType() {return type;}
	public abstract void move(int moveRow, int moveCol);
		
	
	public abstract void attack(int attackRow , int attackCol);
}


package com.kasparov.config;

public enum PieaceType {
	KING("k"), KNIGHT("n"),ROOK("r"), QUEEN("q"),BISHOP("b"),PAWN("p"),Chudaka("ch");

	private String value;
	PieaceType(String value){
		this.value	=	value;
	}
	
	public String toString() {
		return this.value;
	}
	public static PieaceType fromString(String value) {
		for(PieaceType pieace : PieaceType.values()) {
			if(pieace.value.equalsIgnoreCase(value)) {
				return pieace;
			}
		}
		return null;
	}
}

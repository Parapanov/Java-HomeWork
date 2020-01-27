package com.kasparov.config;

	public	enum Player{
		WHITE("W"),BLACK("B");
		
	
	
	private String value;
	
	 Player(String value){
		this.value	=	value;
		}
	
	@Override
	public String toString() {
	return value;
	}
}


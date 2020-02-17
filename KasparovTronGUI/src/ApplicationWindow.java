import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ApplicationWindow extends JPanel {
	public static int clickCountes = 0;
	private final int tileSize = 50;
    
     
     
	 public void paint(Graphics g) {
		
		//g.setColor(Color.CYAN);
		//g.fillRect(10, 10, 100, 100);
		for(int row = 0 ; row < 10 ; row++) {
			for(int col = 0; col < 10 ; col++ ) {
				render(g, row, col);
			}
		}
		
	}
	
	  private void render(Graphics g, int row , int col) {
		
		boolean isRowEven =	( row % 2 == 0);
		boolean isColEven	=	(col % 2 == 0);
		boolean isTileWhite = (isRowEven && isColEven)	||	(!isRowEven && !isColEven);
		
		Color tileColor		=	(isTileWhite)	? Color.WHITE : Color.BLACK;
		int x = col * tileSize;
		int y = row * tileSize;
		g.setColor(tileColor);
		g.fillRect(x, y, tileSize, tileSize);
	
	
	
	 
	  }
	  

	  
}
	  
		
	
		
	
	



	


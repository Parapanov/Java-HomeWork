
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.PaintEvent;
import java.io.ObjectInputStream.GetField;
import java.util.Random;

import javax.swing.Box.Filler;
import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout.Constraints;



public class ApplicationMain {
	private static int clickCountes = 0;
	public static void main(String[ ]args) {
		
		
		
		JFrame windowFrame = new JFrame();
		ApplicationWindow m = new ApplicationWindow();
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(500, 500);
		windowFrame.add(new ApplicationWindow());
		windowFrame.setVisible(true);
		windowFrame.add(m);
		 class MouseAction implements MouseListener{
			   
			  
			  
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				        
					windowFrame.getMousePosition();
						
							if(clickCountes == 1) {
								clickCountes = 0;
							}else {
								clickCountes = 1;
							}
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					if(clickCountes  == 1) {
						windowFrame.setBackground(Color.RED);
					}else {
						windowFrame.setBackground(Color.blue);
					}
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
		 
		  
		  }
		
	}


}
		
	
	


package com.chessmaster.Visualization;

import com.chessmaster.config.PieceColor;
import com.chessmaster.manager.CordinateXY;
import com.chessmaster.manager.GameBoard;
import com.chessmaster.pieces.Pawn;
import com.chessmaster.pieces.Pieces;
import com.chessmaster.pieces.Rook;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

import static com.chessmaster.manager.GameBoard.board;
import static com.chessmaster.manager.GameBoard.isClicked;

public class BoardUI extends JPanel {
	private final int Tile_Side = 50;
	private boolean isCurrentPieaceSelected = false;
	private int currentRow = -1;
	private int currentCol = -1;
	
	private String currentPlayerWB =PieceColor.WHITE;
	
	private int selectedRow = -1;
	private int selectedCol = -1 ;
	
	public BoardUI() {
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			selectedRow = y / Tile_Side;
			selectedCol = x / Tile_Side;
			System.out.print(selectedRow + "" + selectedCol);
			updateUI();
			move();
				
			}
		});
	}
	public void paint(Graphics g) {

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                render(g, row, col);
            }
        }
        g.setColor(Color.gray);
        g.fillRect(500,25,90,250);
        g.setColor(Color.black);
        g.drawString("Current Player",300,50);
        g.drawString("Black Points",320,125);
        g.drawString(String.valueOf(GameBoard.blackPlayerPoints),320,160);
        g.drawString("White Points",320,200);
        g.drawString(String.valueOf(GameBoard.whitePlayerPoints),320,200);
        if(currentPlayerWB == PieceColor.WHITE){
            g.setColor(Color.white);
        } else {g.setColor(Color.black);


        g.fillRect(320,50,25,25);}
	private void render(Graphics g,int row, int col) {
		boolean isRowEven= (row % 2 == 0);
		boolean isColEvent = (col % 2 == 0);
		
		boolean isWhite = (isRowEven && isColEvent) || (!isRowEven && !isColEvent);
		
		Color titleColor = isWhite ? Color.WHITE : Color.BLACK;
		
		boolean isSelected = (row == selectedRow) && (col == selectedCol);
		int titleX = col * Tile_Side;
		int tileY = row * Tile_Side;
		
		if(isSelected) {
			titleColor = new Color(50,205,50);
			g.setColor(titleColor);
			
			g.fillRect(titleX, tileY, Tile_Side, Tile_Side);
		return;
		}
		g.setColor(titleColor);
			g.fillRect(titleX, tileY, Tile_Side, Tile_Side);
			drawFiure(g, titleX, tileY);
			
			if(selectedRow >=0 && selectedCol >= 0 && board[selectedRow][selectedCol] != null && board[selectedRow][selectedCol].getColor()==currentPlayerWB){
			
			  if ((board[selectedRow][selectedCol].isMoveActionValid(tileY / 50, tileX / 50))) {
	                isCurrentPieaceSelected = true;
	                currentRow = (selectedRow);
	                currentCol = selectedCol;


	                g.setColor(new Color(215, 00, 00, 150));
	                g.fillRect(titleX, tileY, Tile_Side, Tile_Side);
	            }
				 public void move() {
				        if (isCurrentPieaceSelected) {


				            if (board[currentRow][currentCol].isMoveValid(selectedRow, selectedCol)) {
				                isCurrentPieaceSelected = false;
				                board[currentRow][currentCol].move(selectedRow, selectedCol);

				                if (currentPlayerWB == PieceColor.WHITE) {
				                    currentPlayerWB = PieceColor.BLACK;
				                } else {
				                    currentPlayerWB = PieceColor.WHITE;
				                }

				            }

				        }
				    }
				 public void attack() {
				        if (isCurrentPieaceSelected) {


				            if (board[currentRow][currentCol].isThereSomethingToTake(selectedRow, selectedCol) &&
				                    board[currentRow][currentCol].isThereSomethingToTake(selectedRow,selectedCol)
				            ) {
				            	isCurrentPieaceSelected = false;
				                if(currentPlayerWB==PieceColor.WHITE){
				                	currentPlayerWB+=board[selectedRow][selectedCol].getPoints();
				                } else  {currentPlayerWB+=board[selectedRow][selectedCol].getPoints();}
				                board[currentRow][currentCol].attack(selectedRow, selectedCol);

				                if (currentPlayerWB == PieceColor.WHITE) {
				                	currentPlayerWB = PieceColor.BLACK;
				                } else {
				                	currentPlayerWB = PieceColor.WHITE;
				                }

				            }

				        }
				    }

				    public void drawFiure(Graphics g, int tileX,int titleY) {

				        if (board[tileY / 50][tileX / 50] != null) {
				            BufferedImage myPicture = null;

				            try {
				                myPicture = ImageIO.read(new File(board[tileY / 50][tileX / 50].getImage()));

				            } catch (IOException | NullPointerException ex) {
				                ex.printStackTrace();
				            }
				            g.drawImage(myPicture, tileX, tileY, null);
				        }
				    }

				}


		}
	}
    
package com.chessmaster.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.chessmaster.Visualization.BoardUI;

public class UndoAddControler implements ActionListener,KeyListener {
private GameBoard board;
private BoardUI view;

}
public void Add(GameBoard move) {
	if(move != null) {
		String player = "";
		if(board.currentPlayer) {
			player = "PlayerW:";
			
		}else if(board.currentPlayer) {
			player="PlayerB:";
		}
	}
}
public void undoControll(GameBoard move) {
	if(move != null) {
		view.add(new Record(BoardUI));
	}
}

void undo() {
	removeRecord(action.undo());
}
void back() {
	addRecord(action.redo());
}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getKeyCode() == KeyEvent.VK_M) {
			action.undo();
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_N) {
			action.back();
			return;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource() == view.back()) {
		System.out.println("Back");
		action.back();
	return;	
	}if(e.getSource() == view.undo()) {
		System.out.println("undo");
		action.undo();
		return;
	}
	}
	
	public GameBoard getBoard() {
		return board;
	}
	public BoardUI getView() {
		return view;
	}

}

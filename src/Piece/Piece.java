package Piece;

import java.util.ArrayList;

public abstract class Piece {
	
	int x,y;
	int color;//black=0, white=1
	abstract ArrayList<Coordinate> getAllMoves(Piece[][] board);
	Piece(int x1,int y1,int c1){
		x = x1;
		y = y1;
		color = c1;
	}
	boolean isValidMove(Piece[][] board,Coordinate step) {
		ArrayList<Coordinate> ret = getAllMoves(board);
		for(int i=0;i<ret.size();i++) {
			if( ret.get(i).equals(step) ) return true;
		}	
		return false;
	}
	
}

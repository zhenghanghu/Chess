package Piece;

import java.util.ArrayList;

public abstract class Piece {
	
	int x,y;
	int color;//black=0, white=1
	abstract ArrayList<Coordinate> getAllMoves(Piece[][] board);
	
	boolean isValidMove(Piece[][] board,Coordinate step) {
		ArrayList<Coordinate> ret = getAllMoves(board);
		for(int i=0;i<ret.size();i++) {
			if( ret.get(i).equals(step) ) return true;
		}	
		return false;
	}
	
}

package Piece;

import java.util.ArrayList;

public abstract class Piece {
	
	int x,y;
	int color;//black=0, white=1
	abstract ArrayList<Coordinate> getAllMoves(Piece[][] board);
	abstract boolean isValidMove(Piece[][] board,Coordinate step);
	
}

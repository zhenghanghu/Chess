package Piece;

import java.util.ArrayList;

public class Bishop extends Piece{
	
	Bishop(int x1,int y1,int c1){
		super(x1,y1,c1);
	}
	
	ArrayList<Coordinate> getAllMoves(Piece[][] board) {
		
		ArrayList<Coordinate> ret = new ArrayList<>();
		//move diagonally
		for(int i=x+1,j=y+1;i<=7 && j<=7;i++,j++) {
			if( board[i][j]==null ) ret.add(new Coordinate(i,j));
			else {
				if( color==board[i][j].color ) break;
				else {
					ret.add(new Coordinate(i,j));
					break;
				}
			}
		}
		
		for(int i=x+1,j=y-1;i<=7 && j>=0;i++,j--) {
			if( board[i][j]==null ) ret.add(new Coordinate(i,j));
			else {
				if( color==board[i][j].color ) break;
				else {
					ret.add(new Coordinate(i,j));
					break;
				}
			}
		}
		
		for(int i=x-1,j=y-1;i>=0 && j>=0;i--,j--) {
			if( board[i][j]==null ) ret.add(new Coordinate(i,j));
			else {
				if( color==board[i][j].color ) break;
				else {
					ret.add(new Coordinate(i,j));
					break;
				}
			}
		}
		
		for(int i=x-1,j=y+1;i>=0 && j<=7;i--,j++) {
			if( board[i][j]==null ) ret.add(new Coordinate(i,j));
			else {
				if( color==board[i][j].color ) break;
				else {
					ret.add(new Coordinate(i,j));
					break;
				}
			}
		}
		
		return ret;
	}
}

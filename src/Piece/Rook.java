package Piece;

import java.util.ArrayList;

public class Rook extends Piece{
	
	Rook(int x1,int y1,int c1){
		super(x1,y1,c1);
	}
	
	ArrayList<Coordinate> getAllMoves(Piece[][] board) {
		
		ArrayList<Coordinate> ret = new ArrayList<>();
		for(int i=x-1;i>=0;i--) {//move to left
			if( board[i][y]==null ) ret.add(new Coordinate(i,y));
			else {
				if( color==board[i][y].color ) break;
				else {
					ret.add(new Coordinate(i,y));
					break;
				}
			}
		}
		for(int i=x+1;i<=7;i++) {//move to right
			if( board[i][y]==null ) ret.add(new Coordinate(i,y));
			else {
				if( color==board[i][y].color ) break;
				else {
					ret.add(new Coordinate(i,y));
					break;
				}
			}
		}
		
		for(int i=y+1;i<=7;i++) {//move up
			if( board[x][i]==null ) ret.add(new Coordinate(x,i));
			else {
				if( color==board[i][y].color ) break;
				else {
					ret.add(new Coordinate(x,i));
					break;
				}
			}
		}
		
		for(int i=y-1;i>=0;i--) {//move down
			if( board[x][i]==null ) ret.add(new Coordinate(x,i));
			else {
				if( color==board[i][y].color ) break;
				else {
					ret.add(new Coordinate(x,i));
					break;
				}
			}
		}
		
		return ret;
	}

}

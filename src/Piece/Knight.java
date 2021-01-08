package Piece;

import java.util.ArrayList;

public class Knight extends Piece{
	
	ArrayList<Coordinate> getAllMoves(Piece[][] board) {
		
		ArrayList<Coordinate> ret = new ArrayList<>();
		int x1[] = {-2,-1,1,2,2,1,-1,-2};
		int y1[] = {1,2,2,1,-1,-2,-2,-1};
		for(int k=0;k<8;k++) {
			int i = x+x1[k], j = y+y1[k];
			if( i>7 || i<0 || j>7 || j<0 ) continue;
			if( board[i][j]==null || board[i][j].color!=color ) ret.add(new Coordinate(i,j));
		}
		
		return ret;
	}
}

package com.markaldrich.chess.chessGame;

/**
 * Created by maste on 7/2/2016.
 */
public class ChessMove {
	private int ax, ay, bx, by;

	public ChessMove(int ax, int ay, int bx, int by) {
		this.ax = ax;
		this.ay = ay;
		this.bx = bx;
		this.by = by;
	}

	public int getAx() {
		return ax;
	}

	public int getAy() {
		return ay;
	}

	public int getBx() {
		return bx;
	}

	public int getBy() {
		return by;
	}

	public void setAx(int ax) {
		this.ax = ax;
	}

	public void setAy(int ay) {
		this.ay = ay;
	}

	public void setBx(int bx) {
		this.bx = bx;
	}

	public void setBy(int by) {
		this.by = by;
	}
	
	public boolean isValidMove(ChessBoard board) {
		return ChessBoard.inBounds(ax, ay) && ChessBoard.inBounds(bx, by) 
				&& board.getPiece(ax, ay) != null
				&& board.getPiece(ax, ay).getPossibleMoves(ax, ay, board).contains(new Coordinate(bx, by));
	}
	
	@Override
	public String toString() {
		return "ChessMove{" +
				"ax=" + ax +
				", ay=" + ay +
				", bx=" + bx +
				", by=" + by +
				'}';
	}
}

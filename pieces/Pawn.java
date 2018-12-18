package pieces;

import board.ChessBoard;
import javafx.scene.paint.Color;

public class Pawn extends Piece {

	private boolean hasMoved = false;

	public Pawn(Color c) {
		super(c);
	}

	@Override
	public void showMove(int row, int col) {
		if (this.getColor() == Color.BLACK) {

			if (ChessBoard.all_squares.size() <= row + 1) {
				return;
			}

			if (col+1 <= 7) {
				if (ChessBoard.all_squares.get(row + 1).get(col + 1).hasPiece()) {
					if (ChessBoard.all_squares.get(row + 1).get(col + 1).getPieceColor() != this.getColor()){
						ChessBoard.all_squares.get(row + 1).get(col + 1).moveMark();
					}
				}
			}
			if (col-1 >= 0) {
				if (ChessBoard.all_squares.get(row + 1).get(col - 1).hasPiece()) {
					if (ChessBoard.all_squares.get(row + 1).get(col - 1).getPieceColor() != this.getColor()){
						ChessBoard.all_squares.get(row + 1).get(col - 1).moveMark();
					}
				}
			}
			if (ChessBoard.all_squares.get(row + 1).get(col).hasPiece()) {
				return;
			}
			if(ChessBoard.all_squares.get(row+1).get(col).hasPiece()){
				return;
			}
			ChessBoard.all_squares.get(row + 1).get(col).moveMark();

			if (ChessBoard.all_squares.size() <= row + 2 || hasMoved) {
				return;
			}
			if (ChessBoard.all_squares.get(row + 2).get(col).hasPiece()) {
				return;
			
			}
			ChessBoard.all_squares.get(row + 2).get(col).moveMark();

		} 
		else if (this.getColor() == Color.WHITE) {
			if (0 > row - 1) {
				return;
			}
			
			if (col+1 <= 7) {
 				if (ChessBoard.all_squares.get(row - 1).get(col + 1).hasPiece()) {
					if (ChessBoard.all_squares.get(row - 1).get(col + 1).getPieceColor() != this.getColor()){
						ChessBoard.all_squares.get(row - 1).get(col + 1).moveMark();
 					}
				}
			}
			if (col-1 >= 0) {
 				if (ChessBoard.all_squares.get(row - 1).get(col - 1).hasPiece()) {
					if (ChessBoard.all_squares.get(row - 1).get(col - 1).getPieceColor() != this.getColor()){
						ChessBoard.all_squares.get(row - 1).get(col - 1).moveMark();
					}
				}
			}
			if (ChessBoard.all_squares.get(row - 1).get(col).hasPiece()) {
				return;
			}

			ChessBoard.all_squares.get(row - 1).get(col).moveMark();

			if (0 > row - 2 || hasMoved) {
				return;
			}
			if (ChessBoard.all_squares.get(row - 2).get(col).hasPiece()) {
				return;
			}

			ChessBoard.all_squares.get(row - 2).get(col).moveMark();

		}

	}

	@Override
	public void Move() {
		hasMoved = true;
	}

}

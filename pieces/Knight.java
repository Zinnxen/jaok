package pieces;

import board.ChessBoard;
import javafx.scene.paint.Color;

public class Knight extends Piece {

	public Knight(Color c) {
		super(c);
	}

	@Override
	public void showMove(int row, int col) {
		if (row <= 5 && col != 7) {
			if (ChessBoard.all_squares.get(row + 2).get(col + 1).hasPiece()) {
				if (ChessBoard.all_squares.get(row + 2).get(col + 1).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row + 2).get(col + 1).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row + 2).get(col + 1).moveMark();
			}
		}
		if (row <= 5 && col != 0) {

			if (ChessBoard.all_squares.get(row + 2).get(col - 1).hasPiece()) {
				if (ChessBoard.all_squares.get(row + 2).get(col - 1).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row + 2).get(col - 1).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row + 2).get(col - 1).moveMark();
			}
		}
		if (row >= 2 && col != 7) {
			if (ChessBoard.all_squares.get(row - 2).get(col + 1).hasPiece()) {
				if (ChessBoard.all_squares.get(row - 2).get(col + 1).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row - 2).get(col + 1).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row - 2).get(col + 1).moveMark();
			}
		}
		if (row >= 2 && col != 0) {
			if (ChessBoard.all_squares.get(row - 2).get(col - 1).hasPiece()) {
				if (ChessBoard.all_squares.get(row - 2).get(col - 1).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row - 2).get(col - 1).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row - 2).get(col - 1).moveMark();
			}
		}
		if (col <= 5 && row != 7) {
			if (ChessBoard.all_squares.get(row + 1).get(col + 2).hasPiece()) {
				if (ChessBoard.all_squares.get(row + 1).get(col + 2).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row + 1).get(col + 2).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row + 1).get(col + 2).moveMark();
			}
		}
		if (col <= 5 && row != 0) {

			if (ChessBoard.all_squares.get(row - 1).get(col + 2).hasPiece()) {
				if (ChessBoard.all_squares.get(row - 1).get(col + 2).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row - 1).get(col + 2).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row - 1).get(col + 2).moveMark();
			}
		}
		if (col >= 2 && row != 7) {
			if (ChessBoard.all_squares.get(row + 1).get(col - 2).hasPiece()) {
				if (ChessBoard.all_squares.get(row + 1).get(col - 2).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row + 1).get(col - 2).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row + 1).get(col - 2).moveMark();
			}
		}
		if (col >= 2 && row != 0) {

			if (ChessBoard.all_squares.get(row - 1).get(col - 2).hasPiece()) {
				if (ChessBoard.all_squares.get(row - 1).get(col - 2).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row - 1).get(col - 2).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row - 1).get(col - 2).moveMark();
			}
		}
	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub

	}
}

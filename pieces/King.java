package pieces;

import board.ChessBoard;
import javafx.scene.paint.Color;

public class King extends Piece {

	public King(Color c) {
		super(c);
	}

	@Override
	public void showMove(int row, int col) {

		if (row != 0) { // UPP
			if (ChessBoard.all_squares.get(row - 1).get(col).hasPiece()) {
				if (ChessBoard.all_squares.get(row - 1).get(col).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row - 1).get(col).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row - 1).get(col).moveMark();
			}
		}
		if (row != 0 && col != 7) { // UPP HÖGER
			if (ChessBoard.all_squares.get(row - 1).get(col + 1).hasPiece()) {

				if (ChessBoard.all_squares.get(row - 1).get(col + 1).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row - 1).get(col + 1).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row - 1).get(col + 1).moveMark();
			}
		}
		if (col != 7) { // HÖGER
			if (ChessBoard.all_squares.get(row).get(col + 1).hasPiece()) {

				if (ChessBoard.all_squares.get(row).get(col + 1).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row).get(col + 1).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row).get(col + 1).moveMark();
			}
		}
		if (row != 7 && col != 7) { // NER HÖGER
			if (ChessBoard.all_squares.get(row + 1).get(col + 1).hasPiece()) {

				if (ChessBoard.all_squares.get(row + 1).get(col + 1).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row + 1).get(col + 1).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row + 1).get(col + 1).moveMark();
			}
		}
		if (row != 7) { // NER
			if (ChessBoard.all_squares.get(row + 1).get(col).hasPiece()) {

				if (ChessBoard.all_squares.get(row + 1).get(col).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row + 1).get(col).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row + 1).get(col).moveMark();
			}
		}
		if (row != 7 && col != 0) { // NER VÄNSTER
			if (ChessBoard.all_squares.get(row + 1).get(col - 1).hasPiece()) {

				if (ChessBoard.all_squares.get(row + 1).get(col - 1).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row + 1).get(col - 1).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row + 1).get(col - 1).moveMark();
			}
		}
		if (col != 0) { // VÄNSTER
			if (ChessBoard.all_squares.get(row ).get(col - 1).hasPiece()) {

				if (ChessBoard.all_squares.get(row).get(col - 1).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row).get(col - 1).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row).get(col - 1).moveMark();
			}
		}
		if (row != 0 && col != 0) { // UPP VÄNSTER
			if (ChessBoard.all_squares.get(row - 1).get(col - 1).hasPiece()) {

				if (ChessBoard.all_squares.get(row - 1).get(col - 1).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row - 1).get(col - 1).moveMark();
				}
			} else {
				ChessBoard.all_squares.get(row - 1).get(col - 1).moveMark();
			}
		}

	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub

	}
}

package pieces;

import board.ChessBoard;
import javafx.scene.paint.Color;

public class Rook extends Piece {

	public Rook(Color c) {
		super(c);
	}

	@Override
	public void showMove(int row, int col) {

		for (int i = 1; i < ChessBoard.all_squares.size() - row; i++) {
			if (ChessBoard.all_squares.get(row + i).get(col).hasPiece()) {
				if (ChessBoard.all_squares.get(row + i).get(col).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row + i).get(col).moveMark();
				}
				break;
			} else {
				ChessBoard.all_squares.get(row + i).get(col).moveMark();
			}
		}

		for (int i = 1; i < ChessBoard.all_squares.size() - col; i++) {
			if (ChessBoard.all_squares.get(row).get(col + i).hasPiece()) {
				if (ChessBoard.all_squares.get(row).get(col + i).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row).get(col + i).moveMark();
				}
				break;
			} else {
				ChessBoard.all_squares.get(row).get(col + i).moveMark();
			}
		}

		for (int i = 1; i < row+1; i++) {
			if (ChessBoard.all_squares.get(row - i).get(col).hasPiece()) {
				if (ChessBoard.all_squares.get(row - i).get(col).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row - i).get(col).moveMark();
				}
				break;
			} else {
				ChessBoard.all_squares.get(row - i).get(col).moveMark();
			}
		}

		for (int i = 1; i < col+1; i++) {
			if (ChessBoard.all_squares.get(row).get(col - i).hasPiece()) {
				if (ChessBoard.all_squares.get(row).get(col - i).getPieceColor() != this.getColor()) {
					ChessBoard.all_squares.get(row).get(col - i).moveMark();
				}
				break;
			} else {
				ChessBoard.all_squares.get(row).get(col - i).moveMark();
			}
		}

	}

	@Override
	public void Move() {

	}
}

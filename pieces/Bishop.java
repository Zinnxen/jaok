package pieces;

import board.ChessBoard;
import javafx.scene.paint.Color;

public class Bishop extends Piece {

	public Bishop(Color c) {
		super(c);
	}

	@Override
	public void showMove(int row, int col) {
		for (int i = 1; i < ChessBoard.all_squares.size() - row; i++) {
			if (i < ChessBoard.all_squares.size() - col) {
				if (ChessBoard.all_squares.get(row + i).get(col + i).hasPiece()) {
					if (ChessBoard.all_squares.get(row + i).get(col + i).getPieceColor() != this.getColor()) {
						ChessBoard.all_squares.get(row + i).get(col + i).moveMark();
					}
					break;
				} else {
					ChessBoard.all_squares.get(row + i).get(col + i).moveMark();
				}
			} else {
				break;
			}
		}

		for (int i = 1; i < row + 1; i++) {
			if (i < ChessBoard.all_squares.size() - col) {
				if (ChessBoard.all_squares.get(row - i).get(col + i).hasPiece()) {
					if (ChessBoard.all_squares.get(row - i).get(col + i).getPieceColor() != this.getColor()) {
						ChessBoard.all_squares.get(row - i).get(col + i).moveMark();
					}
					break;
				} else {
					ChessBoard.all_squares.get(row - i).get(col + i).moveMark();
				}
			} else {
				break;
			}
		}

		for (int i = 1; i < row + 1; i++) {
			if (i < col + 1){
				if (ChessBoard.all_squares.get(row - i).get(col - i).hasPiece()) {
					if (ChessBoard.all_squares.get(row - i).get(col - i).getPieceColor() != this.getColor()) {
						ChessBoard.all_squares.get(row - i).get(col - i).moveMark();
					}
					break;
				} else {
					ChessBoard.all_squares.get(row - i).get(col - i).moveMark();
				}
			}
		}

		for (int i = 1; i < ChessBoard.all_squares.size() - row; i++) {
			if (i < col + 1) {
				if (ChessBoard.all_squares.get(row + i).get(col - i).hasPiece()) {
					if (ChessBoard.all_squares.get(row + i).get(col - i).getPieceColor() != this.getColor()) {
						ChessBoard.all_squares.get(row + i).get(col - i).moveMark();
					}
					break;
				} else {
					ChessBoard.all_squares.get(row + i).get(col - i).moveMark();
				}
			} else {
				break;
			}
		}
	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub

	}

}

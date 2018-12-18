package board;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import pieces.King;
import pieces.Pawn;
import pieces.Piece;

public class Square extends Group {

	public static final double SIZE = 80;
	private Rectangle bg;
	private Color originalColor;
	private Piece piece;
	public static Square active;
	private static int turnCounter = 0;
	public static ArrayList<Square> moveMarked = new ArrayList<Square>();
	public boolean whiteTurn = false;
	public static boolean WhiteKingAlive = true; // true = Alive false == dead
	public static boolean BlackKingAlive = true; // true = Alive false == dead
	public static boolean GameEnd = false;
	public static boolean WhiteWin = false;
	public static boolean BlackWin = false;

	public Square(Color c) {
		originalColor = c;
		bg = new Rectangle(SIZE, SIZE, c);
		this.getChildren().add(bg);
		
		this.setOnMouseClicked(event -> {
			if (GameEnd != true) {
				if (hasMoveMark()) {
					Piece p = active.piece;
					active.piece = null;
					active.makeInactive();
					turnCounter++;
					kingAlive();
					this.addPiece(p);
					this.piece.Move();
					return;
				}

				if (hasPiece()) {
					turn(turnCounter);
					if (whiteTurn == true) {
						System.out.println("WHITE TURN");
					}
					if (whiteTurn == false) {
						System.out.println("BLACK TURN");
					}
					if (whiteTurn == true && this.getPieceColor() == Color.WHITE) {

						makeActive();

						int row = row();
						int col = col();
					}
					if (whiteTurn == false && this.getPieceColor() != Color.WHITE) {
						makeActive();

						int row = row();
						int col = col();
					}

				} else {
					if (active != null) {

						active.makeInactive();
					}

				}
			}
		});

	}

	private boolean hasMoveMark(){
		return this.getChildren().get(this.getChildren().size() - 1) instanceof Circle;
	}

	private int col() {
		for (int i = 0; i < ChessBoard.all_squares.size(); i++) {
			if (ChessBoard.all_squares.get(i).contains(this)) {
				return ChessBoard.all_squares.get(i).indexOf(this);
			}
		}
		return -1;
	}

	public int row() {
		for (int i = 0; i < ChessBoard.all_squares.size(); i++) {
			if (ChessBoard.all_squares.get(i).contains(this)) {
				return i;
			}
		}
		return -1;
	}

	public void moveMark() {
		if (this.hasPiece()) {
			if (this.piece.getColor() != active.piece.getColor()) {
				attackMark();
			}
			return;
		}

		Circle cir = new Circle(SIZE / 2, SIZE / 2, SIZE / 8);
		this.getChildren().add(cir);
		moveMarked.add(this);
	}

	private void attackMark() {
		Circle cir = new Circle(SIZE / 2, SIZE / 2, SIZE / 8, Color.RED);
		this.getChildren().add(cir);
		moveMarked.add(this);
	}

	private void makeActive() {
		if (active != null) {
			active.makeInactive();
		}

		active = this;
		this.piece.showMove(row(), col());
		this.getBackground().setFill(Color.RED);

	}

	private void makeInactive() {
		for (Square square : moveMarked) {
			square.removeMoveMark();
		}
		moveMarked.clear();
		active = null;
		this.getBackground().setFill(originalColor);

	}

	private void removeMoveMark() {
		this.getChildren().remove(this.getChildren().size() - 1);

	}

	public void addPiece(Piece p) {
		if (this.piece != null) {
			this.getChildren().remove(this.piece);
		}
		this.piece = p;
		this.getChildren().add(p);
	}

	public boolean hasPiece() {
		return this.piece != null;
	}

	public Color getPieceColor() {
		return this.piece.getColor();
	}

	public Rectangle getBackground() {
		return this.bg;
	}

	public void turn(int i) {
		if (i % 2 == 0) {
			whiteTurn = true;
			System.out.println("true");
		} else {
			whiteTurn = false;
			System.out.println("false");
		}
	}

	public void kingAlive() {

		for (int i = 0; i < ChessBoard.all_squares.size(); i++) {
			for (int j = 0; j < ChessBoard.all_squares.size(); j++) {
				if (ChessBoard.all_squares.get(i).get(j).hasPiece()) {
					if (this.piece instanceof King && this.getPieceColor() == Color.WHITE) {
						WhiteKingAlive = true;
						BlackWin = true;
						GameEnd =true;
					}

				}
			}
		}

		for (int i = 0; i < ChessBoard.all_squares.size(); i++) {
			for (int j = 0; j < ChessBoard.all_squares.size(); j++) {
				if (ChessBoard.all_squares.get(i).get(j).hasPiece()) {
					if (piece instanceof King && this.getPieceColor() == Color.BLACK) {
						BlackKingAlive = true;
						WhiteWin = true;
						GameEnd =true;
						break;
					}
				}
			}
		}
		if (WhiteWin == true) {
			System.out.println("WHITE WIN");
			return;
		}
		if (BlackWin == true) {	
			System.out.println("BLACK WIN");
			return;
		}
	}

}

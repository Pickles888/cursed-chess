package org.chess;

import java.util.ArrayList;
import java.util.List;

import org.chess.Piece.PieceType;
import org.chess.utils.Coordinate;
import org.chess.utils.Vector2d;

public class Board {
	public final Piece[][] pieces;
	public final List<Piece> taken;

	public Board(Piece[][] pieces, List<Piece> taken) {
		this.pieces = pieces;
		this.taken = taken;
	}

	public Board() {
		this.pieces = Constants.startingBoard;
		this.taken = new ArrayList<>();
	}

	public Board(Piece[][] pieces) {
		this.pieces = pieces;
		this.taken = new ArrayList<>();
	}

	public Board move(Coordinate coord, Vector2d transform) {
		Piece[][] finalBoard = this.pieces;

		List<Piece> taken = new ArrayList<>();
		taken.addAll(this.taken);

		Coordinate transformed = transform.moveCoordinate(coord);
		Piece selectedPiece = pieces[coord.x][coord.y];

		finalBoard[coord.x][coord.y] = new Piece(PieceType.NONE); // sets where the piece was to an empty piece

		if (!(finalBoard[transformed.x][transformed.y].type == PieceType.NONE))
			taken.add(finalBoard[transformed.x][transformed.y]);

		finalBoard[transformed.x][transformed.y] = selectedPiece;

		return new Board(finalBoard, taken);
	}

	public boolean isValidMove(Vector2d transform, Coordinate currentCoord) {
		Coordinate transformed = transform.moveCoordinate(currentCoord);

		if (transformed.x < 0 || transformed.x > 7)
			return false;
		if (transformed.y < 0 || transformed.y > 7)
			return false;

		switch (pieces[currentCoord.x][currentCoord.y].type) {
			case BISHUP:
				if (Math.abs(transform.x) == Math.abs(transform.y))
					return true;
				else
					return false;
			case KING:
				if (Math.abs(transform.x) <= 1 && Math.abs(transform.y) <= 1)
					return true;
				else
					return false;
			case KNIGHT:
				if (Math.abs(transform.x) == 1 && Math.abs(transform.y) == 2)
					return true;
				else
					return false;
			case PAWN:
				if (transform.x == 0 && transform.y == 1)
					return true;
				else
					return false;
			case QUEEN:
				if (Math.abs(transform.x) == Math.abs(transform.y) || (transform.x == 0 || transform.y == 0))
					return true;
				else
					return false;
			case ROOK:
				if (transform.x == 0 || transform.y == 0)
					return true;
				else
					return false;
			default:
				return false;
		}
	}

	public void print() {
		for (int i = 0; i < pieces.length; i++) {
			for (int j = 0; j < pieces[i].length; j++) {
				System.out.print(pieces[j][i].print());
			}
			System.out.println();
		}
	}
}

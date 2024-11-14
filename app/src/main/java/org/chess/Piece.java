package org.chess;

import java.util.Arrays;

import org.chess.utils.Coordinate;
import org.chess.utils.Vector2d;

public class Piece {
	public enum PieceType {
		ROOK,
		BISHUP,
		KNIGHT,
		PAWN,
		QUEEN,
		KING,
		NONE,
	}

	public final PieceType type;

	public Piece(PieceType type) {
		this.type = type;
	}

	public static Piece[][] fromTypes(PieceType[][] pieceTypes) {
		return Arrays.stream(pieceTypes).map(a -> Arrays.stream(a).map(b -> new Piece(b)).toArray(Piece[]::new))
				.toArray(Piece[][]::new);
	}

	public String print() {
		switch (type) {
			case BISHUP:
				return "[B]";
			case KING:
				return "[+]";
			case KNIGHT:
				return "[K]";
			case PAWN:
				return "[P]";
			case QUEEN:
				return "[Q]";
			case ROOK:
				return "[R]";
			default:
				return "[ ]";

		}
	}
}

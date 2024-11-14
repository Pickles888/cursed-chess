package org.chess;

import org.chess.Piece.PieceType;

public class Constants {
	public static final Piece[][] startingBoard = Piece.fromTypes(new PieceType[][] {
			new PieceType[] { PieceType.ROOK, PieceType.PAWN, PieceType.NONE, PieceType.NONE, PieceType.NONE,
					PieceType.NONE, PieceType.PAWN, PieceType.ROOK, },
			new PieceType[] { PieceType.KNIGHT, PieceType.PAWN, PieceType.NONE, PieceType.NONE, PieceType.NONE,
					PieceType.NONE, PieceType.PAWN, PieceType.KNIGHT },
			new PieceType[] { PieceType.BISHUP, PieceType.PAWN, PieceType.NONE, PieceType.NONE, PieceType.NONE,
					PieceType.NONE, PieceType.PAWN, PieceType.BISHUP },
			new PieceType[] { PieceType.KING, PieceType.PAWN, PieceType.NONE, PieceType.NONE, PieceType.NONE,
					PieceType.NONE, PieceType.PAWN, PieceType.KING },
			new PieceType[] { PieceType.QUEEN, PieceType.PAWN, PieceType.NONE, PieceType.NONE, PieceType.NONE,
					PieceType.NONE, PieceType.PAWN, PieceType.QUEEN },
			new PieceType[] { PieceType.BISHUP, PieceType.PAWN, PieceType.NONE, PieceType.NONE, PieceType.NONE,
					PieceType.NONE, PieceType.PAWN, PieceType.BISHUP },
			new PieceType[] { PieceType.KNIGHT, PieceType.PAWN, PieceType.NONE, PieceType.NONE, PieceType.NONE,
					PieceType.NONE, PieceType.PAWN, PieceType.KNIGHT },
			new PieceType[] { PieceType.ROOK, PieceType.PAWN, PieceType.NONE, PieceType.NONE, PieceType.NONE,
					PieceType.NONE, PieceType.PAWN, PieceType.ROOK, }
	});
}

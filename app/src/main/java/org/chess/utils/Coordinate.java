package org.chess.utils;

public class Coordinate {
	public final int x;
	public final int y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static Coordinate fromString(String s) {
		String[] split = s.split(",");

		int x = Integer.parseInt(split[0]);
		int y = Integer.parseInt(split[1]);

		return new Coordinate(x, y);
	}

	public Vector2d toVector2d() {
		return new Vector2d(this.x, this.y);
	}
}

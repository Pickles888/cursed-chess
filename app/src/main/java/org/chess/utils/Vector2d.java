package org.chess.utils;

public class Vector2d {
	public final int x;
	public final int y;

	public Vector2d(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static Vector2d fromCoordinates(Coordinate a, Coordinate b) {
		return new Vector2d(b.x - a.x, b.y - a.y);
	}

	// gets the length of the vector
	public int length() {
		return ((int) Math.floor(Math.sqrt(
				Math.pow(this.x, 2) + Math.pow(this.y, 2))));
	}

	public Coordinate moveCoordinate(Coordinate a) {
		return new Coordinate(this.x + a.x, this.y + a.y);
	}

	// add two vectors
	public Vector2d add(Vector2d a) {
		return new Vector2d(this.x + a.x, this.y + a.y);
	}

	// get dot product of two vectors
	public Vector2d dot(Vector2d a) {
		return new Vector2d(this.x * a.x, this.y * a.y);
	}
}

package org.chess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.chess.utils.Coordinate;
import org.chess.utils.Vector2d;

public class Game implements Runnable {
	public final List<Board> boards = new ArrayList<>();

	public Game() {
		boards.add(new Board());
	}

	public void gameLoop() {
		Scanner input = new Scanner(System.in);

		while (true) {
			boards.getLast().print();

			String nextLine = input.nextLine();

			if (nextLine.equals("q"))
				break;

			String[] split = nextLine.split(" ");

			Coordinate coords = Coordinate.fromString(split[0]);
			Vector2d vec = Coordinate.fromString(split[1]).toVector2d();

			if (boards.getLast().isValidMove(vec, coords))
				boards.add(boards.getLast().move(coords, vec));
			else {
				System.out.println("Invalid Move");
			}
		}

		input.close();
	}

	public void run() {
		gameLoop();
	}
}

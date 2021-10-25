package mcmillan.jeff.tictactoe;

public class TicTacToe {

	private static Input input;
	private static Board board;
	private static final char[] cols = {'a', 'b', 'c'};
	private static final char[] rows = {'1', '2', '3'};
	private static State turn;
	
	public static void main(String[] args) {
		input = new Input();
		board = new Board();
		turn = State.X;
		
		while (true) {
			boolean gameComplete = false;
			State winner = State.EMPTY;
			while (!gameComplete) {
				board.print();
				System.out.println(turn.toString() + "'s turn!");
				boolean validMove = false;
				while (!validMove) {
					char[] coord = input.readTwoChars("Coordinates: ", cols, rows);
					validMove = board.attemptMove(turn, coord[0], coord[1]);
					System.out.println(validMove ? "\n" : coord[0] +""+ coord[1] + " not empty!");
				}
				Pair<State, Boolean> status = board.gameStatus();
				gameComplete = status.snd;
				winner = status.fst;
				newTurn();
			}
			board.print();
			System.out.println("GAME OVER! " + winner.getWinner() + " wins!");
			return; // TODO: Restart game logic.
		}
	}
	
	public static void newTurn() {
		if (turn == State.X) {
			turn = State.O;
		} else {
			turn = State.X;
		}
	}

	
}
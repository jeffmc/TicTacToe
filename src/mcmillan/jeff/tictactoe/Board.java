package mcmillan.jeff.tictactoe;

public class Board {
	
	private static final int size = 3;
	
	private State[][] field;
	
	public Board() {
		field = new State[size][size];
		for (int y=0;y<size;y++) {
			for (int x=0;x<size;x++) {
				field[x][y] = State.EMPTY;
			}
		}
		System.out.println(field[0][0]);
	}
}

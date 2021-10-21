package mcmillan.jeff.tictactoe;

public class TicTacToe {

	private static Input input;
	private static Board board;
	
	private static final char[] cols = {'a', 'b', 'c'};
	private static final char[] rows = {'1', '2', '3'};
	
	public static void main(String[] args) {
		input = new Input();
		board = new Board();
		
		State currentTeam = State.X; // X always starts.
		
//		System.out.println(input.readTwoChars("Coordinates: ", cols, rows));
	}

	
}

//	public static char validateChar(final char[] o, char c) {
//
//		String r = "";
//		String txt = "Not ";
//		if (o.length <= 0) throw new IllegalArgumentException("Char array is length <= 0!");
//		else if (o.length == 1) txt += "'" + o[0] + "'.";
//		else if (o.length == 2) txt += "'" + o[0] + "' or '" + o[1] + "'.";
//		else {
//			for (int i = 0; i < o.length-1; i++) {
//				txt += "'" + o[i] + "', ";
//			}
//			txt += "or '" + o[o.length-1] + "'.";
//		};
//		char c;
//		while (true) {
//			try {
//				r = console.nextLine().toLowerCase();
//				
//				if (r.length() == 1) {
//					c = r.charAt(0);
//					for (char t : o) {
//						if (t == c) return t;
//					}
//				};
//				throw new Exception(txt);
//			} catch (Exception e) {
//				System.out.print(txt);
//			}
//		}
//	}

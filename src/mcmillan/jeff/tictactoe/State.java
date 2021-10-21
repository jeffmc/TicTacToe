package mcmillan.jeff.tictactoe;

public enum State {
	EMPTY("empty"),X("x"),O("O");
    private String name;
	State(String s) {
		name = s;
	}
	@Override
	public String toString() {
		return name;
	}
}

package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
<<<<<<< HEAD
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. "
					+ "Valid values are from a1 to h8.");
=======
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Erros instantiating ChessPosition. Valid values are from a1 to h8.");
>>>>>>> c69ba8329afde6b89e96ff502a2975b1a664a0f0
		}
		this.column = column;
		this.row = row;
	}
<<<<<<< HEAD
=======

>>>>>>> c69ba8329afde6b89e96ff502a2975b1a664a0f0
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
<<<<<<< HEAD
	protected Position toPosition() {
=======
	protected Position toPosition(Position p) {
>>>>>>> c69ba8329afde6b89e96ff502a2975b1a664a0f0
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
<<<<<<< HEAD
=======
	
>>>>>>> c69ba8329afde6b89e96ff502a2975b1a664a0f0
}

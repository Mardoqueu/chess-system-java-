package chess;

import boardgame.Position;

public class ChessPosition {
	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	public int getRow() {
		return row;
	}	
<<<<<<< HEAD

	protected Position toPosition() {
		return new Position (8 - row, column - 'a');
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColummn()), 8 - position.getRow());

	} 

=======
	
	protected Position toPosition() {
		return new Position (8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColummn()), 8 - position.getRow());
		
	} 
	
>>>>>>> 99b40ee278055f0c6897b540dcbc353e2d737a3e
	@Override
	public String toString() {
		return "" + column + row;
	}
<<<<<<< HEAD

}
=======
	
}
>>>>>>> 99b40ee278055f0c6897b540dcbc353e2d737a3e

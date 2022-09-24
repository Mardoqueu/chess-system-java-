package boardgame;

public class Position {
	private int row;
	private int column;
	
	public Position(int row, int colummn) {
		this.row = row;
		this.column = colummn;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColummn() {
		return column;
	}

	public void setColummn(int colummn) {
		this.column = colummn;
	}
	
	@Override
	public String toString() {
		return row + ", " + column; 
	}
	
	
}

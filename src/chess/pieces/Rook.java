package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);

		// above
		p.setValues(position.getRow() - 1, position.getColummn());
		while (getBoard().positinoExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColummn()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positinoExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColummn()] = true;
		}

		// left
		p.setValues(position.getRow(), position.getColummn() - 1);
		while (getBoard().positinoExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColummn()] = true;
			p.setColummn(p.getColummn() - 1);
		}
		if (getBoard().positinoExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColummn()] = true;
		}

		// right
		p.setValues(position.getRow(), position.getColummn() + 1);
		while (getBoard().positinoExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColummn()] = true;
			p.setColummn(p.getColummn() + 1);
		}
		if (getBoard().positinoExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColummn()] = true;
		}

		// below
		p.setValues(position.getRow() + 1, position.getColummn());
		while (getBoard().positinoExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColummn()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positinoExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColummn()] = true;
		}
		
		
		return mat;
	}
}
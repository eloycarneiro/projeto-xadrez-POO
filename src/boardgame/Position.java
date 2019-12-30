package boardgame;

public class Position {
//Classe da camada de tabuleiro que representa uma posição no tabuleiro.
//Recebe uma linha e uma coluna para definição de posição.
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
	
}

package boardgame;

public class Piece {
	
//Posição simples de matriz, ainda não é a posição no tabuleiro, por isso
//Não podemos permitir que ela seja vista na camada de xadrez.
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public Piece[][] possibleMoves() {
		return null;
	}
	
	public Boolean possibleMoves(Position position) {
		return null;
	}
	
	public Boolean isThereAnyPossibleMove() {
		return null;
	}
	
	

	
}

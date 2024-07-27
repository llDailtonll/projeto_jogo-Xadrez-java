package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	//aqui no board criamos uma variavel da classe board porque eles irao ter correlaçacao
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
	//apagamos o set para que o tabuleiro nao seja alterado
	
	
	
}

package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//O tabuleiro tem varias pecas ou seja iremos definir isso em uma matriz
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) { 
			throw new BoardException("Erro pra criar o tabuleiro: tem que ter pelo menos 1 linha e 1 coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	//1
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("posicao nao encontrada no tabuleiro");
		}
		return pieces[row][column];
	}
	
	//2
	//sobrecarga do metodo Piece
	public Piece piece(Position position) {		
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("Tem um peca ja nessa posicao do tabuleiro" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	//testando pra ver se a posicao existe
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("posicao nao encontrada no tabuleiro");
		}
		return piece(position) != null;
	}
	
}

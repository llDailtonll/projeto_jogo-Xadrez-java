package chess;

import boardgame.Board;

public class ChessMatch {
	//aqui vai ser o principal do jogo
	
	//o board é meu tabuleiro
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	//esse metodo irar retorna 
	//uma matriz de pecas de xadrez
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i <board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}

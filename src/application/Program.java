package application;

import chess.ChessMatch;

public class Program {

	//C:\Irlan\Udemy\Projetos\chess_system
	
	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}

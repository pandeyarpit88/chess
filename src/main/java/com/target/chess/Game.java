package com.target.chess;

import com.target.chess.board.Board;
import com.target.chess.fen.FENParser;
import com.target.chess.fen.FenData;
import com.target.chess.fen.fenvalidator.ValidateFen;
import com.target.chess.players.Player;

public class Game {

    private Board board;
    private Player playerWhite, playerBlack;
    private String turn;
    private boolean over;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public void newGame() {
        FenData fenData = new FenData("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
        loadExistingGame(fenData);
    }

    public void loadExistingGame(FenData fenData) {
        this.board = new FENParser().fenToBoard(fenData);
        new ValidateFen().validate(fenData);
        this.turn = fenData.getTurn();
        playerWhite = new Player(this.board);
        playerBlack = new Player(this.board);
    }

    public void move(String source, String dest) {
      if (turn.equalsIgnoreCase("w")) {
          playerWhite.move(source, dest);
          turn = "b";
      }
      else {
          playerBlack.move(source, dest);
          turn = "w";
      }
    }
}

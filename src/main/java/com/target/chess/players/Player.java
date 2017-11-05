package com.target.chess.players;

import com.target.chess.board.Board;
import com.target.chess.board.Cell;
import com.target.chess.piece.ChessPiece;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by APandey1 on 21-09-2017.
 */
public class Player {
    Board board;
    String playerName;

    ArrayList<String> moves = new ArrayList<>();
    public Player(Board board) {
        this.board = board;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void move(String source, String destination) {
        board.move(source, destination);
    }
}

package com.target.chess.piece;

import com.target.chess.board.Cell;

import java.util.List;

/**
 * Created by APandey1 on 20-09-2017.
 */
public abstract class ChessPiece {
    Character name;

    public ChessPiece(Character name) {
        this.name = name;
    }

    public abstract boolean isValidMove(Cell oldSpot, Cell newSpot);

    public Character getName() {
        return name;
    }

    public void setName(Character name) {
        this.name = name;
    }

    //optional feature for actual game hints if needed
    public abstract List<Cell> captureFreeMove(ChessPiece piece);

    public abstract List<Cell> attackSquares(ChessPiece piece);
}

package com.target.chess.piece.pieces;

import com.target.chess.board.Cell;
import com.target.chess.piece.ChessPiece;

import java.util.List;

/**
 * Created by APandey1 on 20-09-2017.
 */
public class Bishop extends ChessPiece {
    public Bishop(Character name) {
        super(name);
    }

    @Override
    public boolean isValidMove(Cell oldSpot, Cell newSpot) {
        return false;
    }

    @Override
    public List<Cell> captureFreeMove(ChessPiece piece) {
        return null;
    }

    @Override
    public List<Cell> attackSquares(ChessPiece piece) {
        return null;
    }
}

package com.target.chess.board;

import com.target.chess.piece.ChessPiece;

/**
 * Created by APandey1 on 20-09-2017.
 */
public class Cell {
    ChessPiece piece;

    public Cell(ChessPiece piece) {
        this.piece = piece;
    }

    public ChessPiece getPiece() {
        return piece;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = piece;
    }

    public void printPiece() {
        if (piece == null)
            System.out.print("- " );
        else
            System.out.print(piece.getName() + " ");
    }
}

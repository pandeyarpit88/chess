package com.target.chess.piece;

import com.target.chess.piece.pieces.*;

/**
 * Created by APandey1 on 20-09-2017.
 */
public class ChessPieceFactory {
    public static ChessPiece getNewPieceofType(Character pieceType) {

        if(Character.toLowerCase(pieceType) == 'b')
            return new Bishop(pieceType);
        else if (Character.toLowerCase(pieceType) == 'k')
            return new King(pieceType);
        else if (Character.toLowerCase(pieceType) == 'n')
            return new Knight(pieceType);
        else if(Character.toLowerCase(pieceType) == 'p')
            return new Pawn(pieceType);
        else if (Character.toLowerCase(pieceType) == 'q')
            return new Queen(pieceType);
        else if (Character.toLowerCase(pieceType) == 'r')
            return new Rook(pieceType);
        else
            return null;
    }
}

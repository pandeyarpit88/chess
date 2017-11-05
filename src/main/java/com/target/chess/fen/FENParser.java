package com.target.chess.fen;

import com.target.chess.board.Board;
import com.target.chess.piece.ChessPieceFactory;

/**
 * Created by APandey1 on 22-09-2017.
 */
public class FENParser {
    public Board fenToBoard(FenData fenData) {
        Board board = new Board();
        int i=0;
        for(String row : fenData.getPiecePosition().split("/")) {
            int j=0;
            for(Character ch : row.toCharArray()) {
                if (Character.isDigit(ch)) {
                    j = j + Character.getNumericValue(ch);
                } else {
                    board.updateBoardByIndex(i,j, ChessPieceFactory.getNewPieceofType(ch));
                    j++;
                }
            }
            i++;
        }
        return board;
    }
}

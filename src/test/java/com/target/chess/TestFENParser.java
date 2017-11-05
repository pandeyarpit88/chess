package com.target.chess;

import com.target.chess.fen.FENParser;
import com.target.chess.fen.FenData;
import org.junit.Test;

/**
 * Created by APandey1 on 26-09-2017.
 */
public class TestFENParser {
    String validFen = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";
    String invalidFenForInput = "rnbqkbn/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";
    String invalidFenForTurn = "rnbqkbn/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR k KQkq - 0 1";
    String invalidFenForCastling = "rnbqkbn/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR k KQkq - 0 1";

    @Test
    public void validateBoard() {
        FENParser parser = new FENParser();
    }
}

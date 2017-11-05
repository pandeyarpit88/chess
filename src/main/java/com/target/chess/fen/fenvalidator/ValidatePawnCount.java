package com.target.chess.fen.fenvalidator;

import com.target.chess.fen.FenData;

/**
 * Created by APandey1 on 26-09-2017.
 */
public class ValidatePawnCount implements FENInputValidationRule {

    public void validate(FenData fenData) {
        long count = fenData.getPiecePosition().toLowerCase().chars().filter(num -> num == 'p').count();
        if(count > 16)
            throw new IllegalArgumentException("More than 16 pawn found!!!");
    }
}

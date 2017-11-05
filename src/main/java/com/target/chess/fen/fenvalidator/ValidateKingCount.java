package com.target.chess.fen.fenvalidator;

import com.target.chess.fen.FenData;

/**
 * Created by APandey1 on 26-09-2017.
 */
public class ValidateKingCount implements FENInputValidationRule {
    @Override
    public void validate(FenData fenData) {
        long count = fenData.getPiecePosition().toLowerCase().chars().filter(num -> num == 'k').count();
        if(count > 2)
            throw new IllegalArgumentException("More than two king found!!!");
    }
}

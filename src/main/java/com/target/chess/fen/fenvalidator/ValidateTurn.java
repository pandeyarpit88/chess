package com.target.chess.fen.fenvalidator;

import com.target.chess.fen.FenData;

/**
 * Created by APandey1 on 26-09-2017.
 */
public class ValidateTurn implements FENInputValidationRule {
    @Override
    public void validate(FenData fenData) {
        String turn = fenData.getTurn();
        if(!turn.equalsIgnoreCase("w") && !turn.equalsIgnoreCase("b"))
            throw new IllegalArgumentException("Turn is not defined properly!!!");
    }
}

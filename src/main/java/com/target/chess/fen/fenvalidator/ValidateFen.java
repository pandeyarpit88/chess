package com.target.chess.fen.fenvalidator;

import com.target.chess.fen.FenData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by APandey1 on 21-09-2017.
 */
public class ValidateFen implements FENInputValidationRule {
    public void validate(final FenData fenData) {
        List<FENInputValidationRule> rules = new ArrayList<FENInputValidationRule>();
        rules.add(new ValidateInputCharecters());
        rules.add(new ValidateBoardRowAndCol());
        rules.add(new ValidateKingCount());
        rules.add(new ValidatePawnCount());
        rules.add(new ValidateTurn());
        rules.add(new ValidateInputCharectersForCastling());
        rules.forEach(fen -> fen.validate(fenData));
    }
}

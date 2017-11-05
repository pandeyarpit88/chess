package com.target.chess.fen.fenvalidator;

import com.target.chess.fen.FenData;

/**
 * Created by APandey1 on 20-09-2017.
 */
@FunctionalInterface
public interface FENInputValidationRule {
    void validate(FenData fenData);
}

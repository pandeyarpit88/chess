package com.target.chess.fen.fenvalidator;

import com.target.chess.fen.FenData;

import java.util.regex.Pattern;

/**
 * Created by APandey1 on 20-09-2017.
 */
public class ValidateInputCharectersForCastling implements FENInputValidationRule {
    //only allowed chars are numbers[1-9] and chars [p,P,k,K,q,Q,b,B,r,R,n,N]
    public static final Pattern pattern = Pattern.compile("^[kq-]+$", Pattern.CASE_INSENSITIVE);

    public void validate(FenData fenData) {
        //Todo: need to verify not more than 4 char
        if ( !pattern.matcher(fenData.getCastlingAbility()).matches()) {
            throw new IllegalArgumentException("FEN string has unknown characters for castling segment!!!");
        }
    }
}

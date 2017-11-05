package com.target.chess.fen.fenvalidator;

import com.target.chess.fen.FenData;

/**
 * Created by APandey1 on 20-09-2017.
 */

public class ValidateBoardRowAndCol implements FENInputValidationRule {
    public void validate(FenData fenData) {
        //number of rows should not be more than 8
        String fenDataArr[] = fenData.getPiecePosition().split("/");
        if ( fenDataArr.length != 8) {
            throw new IllegalArgumentException("FEN string does not have 8*8 !!!");
        }

        //validate each row content
        for (String fen : fenDataArr) {
            char [] fenChars = fen.toCharArray();
            int total =0;
            for(char ch : fenChars) {
                if (Character.isDigit(ch))
                    total += Character.getNumericValue(ch);
                else
                    total += 1;
            }
            if(total != 8)
                throw new IllegalArgumentException("FEN string does not have proper complete row for : " + fen);
        }
    }
}

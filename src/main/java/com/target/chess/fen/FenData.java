package com.target.chess.fen;

/**
 * Created by APandey1 on 20-09-2017.
 */
public class FenData {
    //http://www.fam-petzke.de/cp_fen_en.shtml
    private String piecePosition;
    private String turn;
    private String castlingAbility;
    private String targetSquare;
    private String halfMoveCounter;
    private String fullMoveCounter;

    public FenData(String fen) {
        String[] fenArray = fen.split(" ");
        if(fenArray.length != 6)
            throw new IllegalArgumentException("FEN string does not have proper complete row for : " + fen);
        this.piecePosition = fenArray[0];
        this.turn = fenArray[1];
        this.castlingAbility = fenArray[2];
        this.targetSquare = fenArray[3];
        this.halfMoveCounter = fenArray[4];
        this.fullMoveCounter = fenArray[5];
    }

    public String getPiecePosition() {
        return piecePosition;
    }

    public void setPiecePosition(String piecePosition) {
        this.piecePosition = piecePosition;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getCastlingAbility() {
        return castlingAbility;
    }

    public void setCastlingAbility(String castlingAbility) {
        this.castlingAbility = castlingAbility;
    }

    public String getTargetSquare() {
        return targetSquare;
    }

    public void setTargetSquare(String targetSquare) {
        this.targetSquare = targetSquare;
    }

    public String getHalfMoveCounter() {
        return halfMoveCounter;
    }

    public void setHalfMoveCounter(String halfMoveCounter) {
        this.halfMoveCounter = halfMoveCounter;
    }

    public String getFullMoveCounter() {
        return fullMoveCounter;
    }

    public void setFullMoveCounter(String fullMoveCounter) {
        this.fullMoveCounter = fullMoveCounter;
    }
}

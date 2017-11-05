package com.target.chess.board;

import com.target.chess.piece.ChessPiece;

import java.util.Arrays;
import java.util.List;

/**
 * Created by APandey1 on 20-09-2017.
 */
public class Board {
    private String[] ranks = {"a", "b", "c", "d", "e", "f", "g", "h"};
    private String[] files = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private List<String> rankList;
    private Cell[][] boardCells;

    public Board() {
        boardCells = new Cell[8][8];
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                boardCells[i][j] = new Cell(null);
            }
        }
        rankList = Arrays.asList(ranks);
    }

    public Cell getIndividualCell(int i, int j) {
        return boardCells[i][j];
    }

    public void updateBoardByIndex(int rankInt, int fileInt, ChessPiece piece) {
        boardCells[rankInt][fileInt].setPiece(piece);
    }

    public void printBoard() {
        for(int i=0; i<8; i++) {
            for (int j=0; j<9; j++) {
                if (j == 0) {
                    System.out.print(files[i] + "|  ");
                    continue;
                }
                getIndividualCell(i, j-1).printPiece();
            }
            System.out.println(" |" + files[i]);
        }
        System.out.print("  --");
        for(int i=0; i<8; i++) {
            System.out.print("--");
        }
        System.out.println();
        System.out.print("    ");
        for(int i=0; i<8; i++) {
            System.out.print(ranks[i] + " ");
        }
    }

    public void move(String source, String destination) {
        char[] sourceCellLocation = source.toCharArray();
        char[] destCellLocation = destination.toCharArray();
        if(sourceCellLocation.length != 2 || destCellLocation.length != 2) {
            throw new IllegalArgumentException("Source or Destination is not properly defined!!!");
        }

        ChessPiece piece = boardCells[rankList.indexOf(sourceCellLocation)][Character.getNumericValue(sourceCellLocation[1])].getPiece();
        boardCells[rankList.indexOf(sourceCellLocation)][Character.getNumericValue(sourceCellLocation[1])].setPiece(null);
        boardCells[rankList.indexOf(destCellLocation)][Character.getNumericValue(destCellLocation[1])].setPiece(piece);
    }
}

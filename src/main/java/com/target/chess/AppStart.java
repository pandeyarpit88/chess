package com.target.chess;

import com.target.chess.fen.FenData;

import java.util.Scanner;

/**
 * Created by APandey1 on 26-09-2017.
 */
public class AppStart {
    public static void main(String[] args) {
        //http://chessprogramming.wikispaces.com/Forsyth-Edwards+Notation
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        System.out.println("To start a new game press 1");
        System.out.println("To start an existing game from FEN press 2");
        int choice = scanner.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Wrong Input.. Give Correct Input : ");
            choice = scanner.nextInt();
        }

        if(choice == 1) {
            game.newGame();
            game.getBoard().printBoard();
        } else {
            scanner.nextLine();
            String fen = scanner.nextLine();
            FenData fenData = new FenData(fen);

            game.loadExistingGame(fenData);
            game.getBoard().printBoard();
        }
        System.out.println("Enter Player 1 Name : ");
        String p1 = scanner.nextLine();
        System.out.println("Enter Player 2 Name : ");
        String p2 = scanner.nextLine();
        System.out.println("Enter source position : ");
        String source = scanner.nextLine();
        String destination = scanner.nextLine();

        game.move(source, destination);
    }
}

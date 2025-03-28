package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.Color;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static ChessPosition readChessPosition(Scanner sc) {
        try {
            String s = sc.nextLine();
            char column = s.charAt(0);
            int row = Integer.parseInt(s.substring(1));
            return new ChessPosition(column, row);
        } catch (RuntimeException e) {
            throw new InputMismatchException("Error reading ChessPosition. Valid values are from a1 to h8");
        }

}

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i=0; i<pieces[0].length; i++){
            System.out.println();
            System.out.print((8-i) + " ");
            for (int j=0; j<pieces[1].length; j++){
                printPiece(pieces[i][j]);
            }
        }
        System.out.println();
        System.out.print("  a b c d e f g h");

    }

    private static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.print("-");
        } else {
            if (piece.getColor() == Color.WHITE) {
                System.out.print(ANSI_WHITE + piece + ANSI_RESET);
            } else {
                System.out.print(ANSI_YELLOW + piece + ANSI_RESET);
            }
        }
        System.out.print(" ");

    }
}

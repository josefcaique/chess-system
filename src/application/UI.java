package application;

import chess.ChessMatch;
import chess.ChessPiece;

import java.util.ArrayList;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {

        for (int i=pieces[0].length-1; i>=0; i--){
            System.out.println();
            System.out.print((i + 1) + " ");
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
            System.out.print(piece);
        }
        System.out.print(" ");

    }
}

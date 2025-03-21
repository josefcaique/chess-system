package application;

import chess.ChessMatch;
import chess.ChessPiece;

import java.util.ArrayList;

public class UI {

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
            System.out.print(piece);
        }
        System.out.print(" ");

    }
}

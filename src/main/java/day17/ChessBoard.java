package day17;

public class ChessBoard {

    private ChessPiece[][] pieces;

    public ChessBoard(ChessPiece[][] pieces) {
        this.pieces = pieces;
    }

    public void print() {
        for (ChessPiece[] piece : pieces) {
            for (ChessPiece chessPiece : piece) {
                System.out.print(chessPiece.getDesignation());
            }
            System.out.println();
        }
    }
}

import javafx.geometry.Pos;

import javax.swing.text.Position;

public class Gameplay {

//    private final Player player2;
//    private final Player player1;
    private Board board;
    private final int white = 1;
    private final int black = -1;
    private int activeplayer = white;

    public void getBoard(Board board) {
        this.board = board;
        for (int row = 0; row < board.getHeight(); row++) { // sprawdzenie poprawności wyświetlania szachownicy
               for (int column = 0; column < board.getWidth(); column++) {
                    System.out.print(board.getSquare(column,row));
                }
                System.out.println();
            }
    }

    public Gameplay(){
        this.board = new Board();
//        this.player1 = new Player("player1", 12, white);
//        this.player2 = new Player("player2", 12, black);

    }
    public void make_move(Possition p_from, Possition p_to) {
        if(validMove(p_from, p_to)) {
            board.getSquare(p_to).putPiece(board.getSquare(p_from).getPiece());
            board.getSquare(p_from).removePiece();
            activeplayer = -1*activeplayer;
//            if(activeplayer == white) activeplayer = black;
//            else if(activeplayer == black) activeplayer = white;
        }
    }

    public boolean validMove(Possition p_from, Possition p_to){
        if(this.board.getSquare(p_from) == null || this.board.getSquare(p_from).getPiece() == null ){
            return false;
        }
//        if(this.board.getSquare(p_from).getPiece().getColor() == activeplayer) {
//           return true;
//       }
//        else{
//            return false;
//       } // ale tutaj w valid mow sprawdzamy tylko ten obiekt p_from bo p_to sprawdzamy w fukcjni may_i_move, wiec moze usunac p_to?
       return  true;
    }

    public int getActiveplayer() {
        return activeplayer;
    }
    //    public void make_move(Possition p_from, Possition p_to) {
//        if(this.board.getSquare(p_from) == null || this.board.getSquare(p_from).getPiece() == null );
//        if(this.board.getSquare(p_from).getPiece().getColor() != activeplayer) throw new WybranaFiguraZlegoGraczaException();
//        if(this.board.zrobRuchOrazCzyByloBicie(board.getSquare(p_from), board.getSquare(p_to)))this.gracze.get(this.kolorObecnegoGracza).zmniejszLiczbeFigur();
//        activeplayer = activeplayer * (-1);
//    }
    
    
}

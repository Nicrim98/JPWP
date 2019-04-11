public class Square { // definicja pojedynczego kafelka, będzie potrzeba np. do sprawdzania czy figura stacjonuje na danym polu ;)

    private int column;
    private int row;
    private String piece_type;
    private int what_square = 0;

    public Square(int column, int row) {
        this.column = column;
        this.row = row;
    }


    public Square(String piece_type){
        this.piece_type = piece_type;
        if (piece_type.equals("W")){   // white pawn
            what_square = 1;
        }
        if (piece_type.equals("B")){   // black pawn
            what_square = 2;
        }
        if (piece_type.equals("WQ")){   // white queen
            what_square = 3;
        }
        if (piece_type.equals("BQ")){   // black queen
            what_square = 4;
        }
    }


/*    public String toString(){       // metoda z poprzednim pomysłem i wyświetlaniem pól

        String squareString;

        String[] list_of_rows = { "1", "2", "3", "4", "5", "6", "7", "8"};
        String[] list_of_columns = { "A", "B", "C", "D", "E", "F", "G", "H"};

        squareString = list_of_columns[column] + list_of_rows[row] + " ";
        return squareString ;

    }*/

    public String toString(){       // metoda z poprzedniego projektu pokerowego

        String squareString;

        String[] list_of_possible_squares = { "-", "W", "B", "WQ", "BQ"};

        squareString = list_of_possible_squares[what_square] + " ";
        return squareString ;

    }

   // public Piece setPiece(Piece type_of_piece, int column, int row){
   //     return
    //}
    //public Piece getPiece(); // coś takiego gość proponuje z filmika na Youtube
                                        // jakby ogarnąć te klasy abstract i tak dalej
                                        // to mógłby to być fajny materiał do demonstracji
}
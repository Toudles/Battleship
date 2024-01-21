public class Board {


    //set our 2-dimensional array for the board
    private final char[][] board;



    //constructor for Board class (determine the size of the board)
    public Board(int sizey, int sizex){
        this.board = new char[sizey][sizex];
        createBoard();
    }

    //private method because only should be accessible within this class. Creating the board
    private void createBoard(){

        for(int rows = 0; rows < board.length; rows++){
            for(int columns = 0; columns < board[rows].length; columns++){
                board[rows][columns] = ' ';
            }
        }

    }

    //method for printing the board (public so other classes can see)
    public void printboard() {

    	//depending on what the user selects as the size.
        if (board.length == 4){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D");
            System.out.print(" - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < board.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < board[rows].length; columns++) {

                    System.out.print(board[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - -");
            }
        } else if (board.length == 5){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E");
            System.out.print(" - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < board.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < board[rows].length; columns++) {

                    System.out.print(board[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - -");
            }

        } else if (board.length == 6){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E" + "   " + "F");
            System.out.print(" - - - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < board.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < board[rows].length; columns++) {

                    System.out.print(board[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - - - -");
            }

        } else if (board.length == 7){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E" + "   " + "F" + "   " + "G");
            System.out.print(" - - - - - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < board.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < board[rows].length; columns++) {

                    System.out.print(board[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - - - - - -");
            }

        } else if (board.length == 8){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E" + "   " + "F" + "   " + "G" + "   " + "H");
            System.out.print(" - - - - - - - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < board.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < board[rows].length; columns++) {

                    System.out.print(board[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - - - - - - - -");
            }

        } else if (board.length == 9){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E" + "   " + "F" + "   " + "G" + "   " + "H" + "   " + "I");
            System.out.print(" - - - - - - - - - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < board.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < board[rows].length; columns++) {

                    System.out.print(board[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - - - - - - - - - -");
            }

        } else{
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E" + "   " + "F" + "   " + "G" + "   " + "H" + "   " + "I" + "   " + "J");
            System.out.print(" - - - - - - - - - - - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < board.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < board[rows].length; columns++) {

                    System.out.print(board[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - - - - - - - - - - - -");
            }
        }
    }

    //method to return the board for the user to see
    public char[][] returnBoard(){
        return board;
    }

    //method to reset board (public so other classes can see the reset board)
    public void resetBoard() {
        for (int rows = 0; rows < board.length; rows++) {
            for (int columns = 0; columns < board[rows].length; columns++) {
                board[rows][columns] = ' ';
            }
        }
    }

}
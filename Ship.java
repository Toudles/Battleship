public class Ship {
    //purpose of this class is to create an identical board using the Board class but also add the ship
    //purpose is to compare the 2 boards when playing the game.


    private final char[][] shipBoard;
    private int SHIP_SIZE;
    private int firstX;
    private int firstY;


    //same as Board class
    public Ship(int sizey, int sizex) {
        this.shipBoard = new char[sizey][sizex];
        createShipBoard();
        placeShip();
        //printShipBoard();
        //System.out.println(SHIP_SIZE);
    }

    //private method because only should be accessible within this class. Creating the board
    private void createShipBoard() {

        for (int rows = 0; rows < shipBoard.length; rows++) {
            for (int columns = 0; columns < shipBoard[rows].length; columns++) {
                shipBoard[rows][columns] = ' ';
            }
        }

    }

    //placing the ship on a random coordinate on our ship board
    private void placeShip() {
    		//creates a random size between 2-4
            this.SHIP_SIZE = (int) (Math.random() * 3 + 2);
            // Generate random starting position
            this.firstX = (int)(Math.random() * (shipBoard.length - SHIP_SIZE + 1));
            this.firstY = (int)(Math.random() * (shipBoard.length - SHIP_SIZE + 1));

            //determine whether the ship goes in a row or a column
            int shipPlacement = (int) (Math.random() * 2);

            if (shipPlacement == 0) {
                // Place the ship horizontally
                for (int i = 0; i < SHIP_SIZE; i++) {
                    shipBoard[firstY][firstX + i] = '*';
                }
            } else {
                // Place the ship vertically
                for (int i = 0; i < SHIP_SIZE; i++) {
                    shipBoard[firstY + i][firstX] = '*';
                }
            }
        }


    public void printShipBoard() {

    	//same as board class depending on size of the board the user selects
        if (shipBoard.length == 4){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D");
            System.out.print(" - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < shipBoard.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < shipBoard[rows].length; columns++) {

                    System.out.print(shipBoard[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - -");
            }
        } else if (shipBoard.length == 5){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E");
            System.out.print(" - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < shipBoard.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < shipBoard[rows].length; columns++) {

                    System.out.print(shipBoard[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - -");
            }

        } else if (shipBoard.length == 6){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E" + "   " + "F");
            System.out.print(" - - - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < shipBoard.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < shipBoard[rows].length; columns++) {

                    System.out.print(shipBoard[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - - - -");
            }

        } else if (shipBoard.length == 7){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E" + "   " + "F" + "   " + "G");
            System.out.print(" - - - - - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < shipBoard.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < shipBoard[rows].length; columns++) {

                    System.out.print(shipBoard[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - - - - - -");
            }

        } else if (shipBoard.length == 8){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E" + "   " + "F" + "   " + "G" + "   " + "H");
            System.out.print(" - - - - - - - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < shipBoard.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < shipBoard[rows].length; columns++) {

                    System.out.print(shipBoard[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - - - - - - - -");
            }

        } else if (shipBoard.length == 9){
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E" + "   " + "F" + "   " + "G" + "   " + "H" + "   " + "I");
            System.out.print(" - - - - - - - - - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < shipBoard.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < shipBoard[rows].length; columns++) {

                    System.out.print(shipBoard[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - - - - - - - - - -");
            }

        } else{
            System.out.println("   A" + "   " + "B" + "   " + "C" + "   " + "D" + "   " + "E" + "   " + "F" + "   " + "G" + "   " + "H" + "   " + "I" + "   " + "J");
            System.out.print(" - - - - - - - - - - - - - - - - - - - - -");
            System.out.println();

            for (int rows=0; rows < shipBoard.length; rows++) {
                System.out.print((rows)+"| ");

                for (int columns=0; columns < shipBoard[rows].length; columns++) {

                    System.out.print(shipBoard[rows][columns] + " | ");

                }
                System.out.println();
                System.out.println(" - - - - - - - - - - - - - - - - - - - - -");
            }
        }
    }
    //for our own convenience during testing
    public int getShipSize() {
        return SHIP_SIZE;
    }

    //returns the board to us so we can compare the user board and the ship board
    public char[][] returnShipBoard(){
        return shipBoard;
    }
}




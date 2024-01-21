import java.util.Scanner;
public class BattleshipGame {

    //instantiate 2 players (player1/2 from the Player class)
    private final Player player1;
    private final Player player2;
    //instantiate a currentPlayer from Player class to alternate players.
    private Player currentPlayer;
    private int shipHits = 0;

    char play1;

    //Our constructor method with the player names and player's turn
    public BattleshipGame(){

        player1 = new Player("Player 1");
        player2 = new Player("Player 2");

        //determine who gets to go first
        if (Math.random() < 0.5) {
            currentPlayer = player1;
            play1 = 'x';
            System.out.println("Player 1 will start and determine the board size");
        } else {
            currentPlayer = player2;
            System.out.println("Player 2 will start and determine the board size");
            play1 = 'o';
        }

    }

    //method to switch players if the whole ship isn't found
    private void switchPlayer(){
        if(currentPlayer == player1){
            currentPlayer = player2;
            System.out.println("Player 2's turn");
        }else{
            currentPlayer = player1;
            System.out.println("Player 1's turn");
        }
    }

    //method to playGame that starts the whole game
    public void playGame(){

        Scanner in = new Scanner(System.in);
        System.out.println("What size do you want your board? (4-10)");
        int board = in.nextInt();
        
        Ship shipMatrix = new Ship(board, board);
        final Board matrix = new Board(board, board);

        boolean gameOver = false;
        int Score = 0;
        int p1Score = 0;
        int p2Score = 0;

        while(!gameOver) {

            if(currentPlayer == player1){
                play1 = 'x';
            }else{
                play1 = 'o';
            }

            matrix.printboard();
            int chance = 0;
            String[] coordinate = {" ", " "};
            String colUser = " ";
            int colBoard = 0;
            int rowBoard = 0;

            while(true) {

                try {
                	Scanner coord = new Scanner(System.in);
                    System.out.print("Enter your coordinate: ");
                    colUser = coord.nextLine();
                    coordinate = colUser.split("");

                    if (coordinate[0].equalsIgnoreCase("A")) {
                        colBoard = 0;
                    } else if (coordinate[0].equalsIgnoreCase("B")) {
                        colBoard = 1;
                    } else if (coordinate[0].equalsIgnoreCase("C")) {
                        colBoard = 2;
                    } else if (coordinate[0].equalsIgnoreCase("D")) {
                        colBoard = 3;
                    } else if (coordinate[0].equalsIgnoreCase("E")) {
                        colBoard = 4;
                    } else if (coordinate[0].equalsIgnoreCase("F")) {
                        colBoard = 5;
                    } else if (coordinate[0].equalsIgnoreCase("G")) {
                        colBoard = 6;
                    } else if (coordinate[0].equalsIgnoreCase("H")) {
                        colBoard = 7;
                    } else if (coordinate[0].equalsIgnoreCase("I")) {
                        colBoard = 8;
                    } else if (coordinate[0].equalsIgnoreCase("J")) {
                        colBoard = 9;
                    } else {
                    	colBoard = -1;
                    }

                    rowBoard = Integer.parseInt(coordinate[1]);

                    if(colBoard < 0 || rowBoard < 0 || colBoard > 10 || rowBoard > 10) {
                        System.out.println("Out of bounds. Please try again.");
                    } else if (coordinate.length > 2) {
                        System.out.println("Out of bounds. Please try again.");
                    } else if (matrix.returnBoard()[rowBoard][colBoard] == '#') {
                        System.out.println("Already made a guess here.");
                    } else if (matrix.returnBoard()[rowBoard][colBoard] == 'X') {
                        System.out.println("Already made a hit here.");
                    } else {
                        break;
                    }
                }
                catch (Exception e) {
                    System.out.println("Not a valid input");
                }
            }

            //check user input and see if the other array containing the ship matches.
            if (shipMatrix.returnShipBoard()[rowBoard][colBoard] == ' ') {
                matrix.returnBoard()[rowBoard][colBoard] = '#';
                Score++;
                if(currentPlayer == player1){
                    p1Score++;
                }else{
                    p2Score++;
                }
                matrix.resetBoard();
                switchPlayer();
                shipHits = 0;

            } else if (shipMatrix.returnShipBoard()[rowBoard][colBoard] == '*') {
                matrix.returnBoard()[rowBoard][colBoard] = (play1);
                Score++;
                shipHits++;
                if(currentPlayer == player1){
                    p1Score++;
                }else{
                    p2Score++;
                }

            }

            if (shipHits == shipMatrix.getShipSize()) {
                if(currentPlayer == player1){
                    System.out.println("Player 1 has won in " + p1Score + " tries on their turn with a total of " + Score + " turns!");
                }else{
                    System.out.println("Player 2 has won in " + p2Score + " tries on their turn with a total of " + Score + " turns!");
                }
                gameOver = true;
            }


        }
        // display the board
        matrix.printboard();
    }

    //check if win
    public static char hasWinner(char [][] matrix) {
        int chance = 0;

        //check rows
        for (int row = 0; row < matrix.length; row++) {
        	//check columns
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 'X') {
                    chance++;
                }
                }
            }


        //return char
        return ' ';


    }
    //check if the board is full
    public static boolean fullBoard(char [][] matrix) {
        for(int row = 0; row < matrix.length; row ++) {
            for (int column = 0; column < matrix.length; column ++) {
                if (matrix[row][column] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}


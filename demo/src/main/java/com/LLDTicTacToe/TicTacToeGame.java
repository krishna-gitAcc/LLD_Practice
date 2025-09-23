package com.LLDTicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.LLDTicTacToe.Model.Board;
import com.LLDTicTacToe.Model.Pair;
import com.LLDTicTacToe.Model.PieceType;
import com.LLDTicTacToe.Model.Player;
import com.LLDTicTacToe.Model.PlayingPiece;
import com.LLDTicTacToe.Model.PlayingPieceO;
import com.LLDTicTacToe.Model.PlayingPieceX;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame(){
        players = new LinkedList<>();
        PlayingPiece crossPiece = new PlayingPieceX();
        PlayingPiece noughtsPiece = new PlayingPieceO();

        Player player1 = new Player(crossPiece, "p1");
        Player player2 = new Player(noughtsPiece, "p2");

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){

            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();

            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            System.err.print("Player:" + playerTurn.getName() + " Enter row, column: " );
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            // try (Scanner inputScanner = new Scanner(System.in)) {
            //     s = inputScanner.nextLine();
            // }
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputCol, playerTurn.playingPiece);
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputCol, playerTurn.playingPiece.pieceType);

            if(winner){
                return playerTurn.name;
            }
        }
        return "Tie";
    }

    public boolean isThereWinner(int row, int col, PieceType pieceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //rowMatch && colMatch
        for(int i = 0; i<gameBoard.size; i++){
            if(gameBoard.board[row][i] == null || !gameBoard.board[row][i].pieceType.equals(pieceType)){
                rowMatch = false;
            }
            if(gameBoard.board[i][col] == null || !gameBoard.board[i][col].pieceType.equals(pieceType)){
                colMatch = false;
            }
        }

        //diagonal match
        for(int i = 0, j = 0; i<gameBoard.size; i++, j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType){
                diagonalMatch = false;
            }
        }

        //antiDiagonal
        for(int i = 0, j= gameBoard.size-1; i<gameBoard.size; i++, j--){
            if(gameBoard.board[i][j] == null || !gameBoard.board[i][j].pieceType.equals(pieceType));{
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;

    }


}

package com.LLDSnakeLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Deque<Player> playerList = new LinkedList<>();
    Dice dice;
    Player winner;

    public Game(){
        initializeGame();
    }

    private void initializeGame() {
        // Initialize Board
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        // Initialize Players
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        playerList.add(player1);
        playerList.add(player2);
        // Initialize Dice
    }

    public void startGame() {
        while(winner == null){
            Player currentPlayer = playerList.poll();
            System.out.println("Current Player is : " + currentPlayer.Id + " at position : " + currentPlayer.currentPosition);
            int diceValue = dice.rollDice();
            int newPosition = currentPlayer.currentPosition + diceValue;
            newPosition = jumpCheck(newPosition);
            currentPlayer.currentPosition = newPosition;
            System.out.println("Player " + currentPlayer.Id + " rolled a " + diceValue + " and moved to position " + currentPlayer.currentPosition);
            playerList.offer(currentPlayer);
            if(newPosition >= board.cells.length * board.cells.length -1){
                winner = currentPlayer;
            }
        }
        System.out.println("Winner is : " + winner.Id);
    }
    private int jumpCheck(int position){
        if(position > board.cells.length * board.cells.length){
            return position;
        }
        int row = (position - 1) / board.cells.length;
        int col = (position - 1) % board.cells.length;
        Cell cell = board.cells[row][col];
        if(cell.jump != null){
            Jump jump = cell.jump;
            if(jump.start < jump.end){
                System.out.println("Ladder found at position : " + position + " jumping to : " + jump.end);
            } else {
                System.out.println("Snake found at position : " + position + " jumping to : " + jump.end);
            }
            return cell.jump.end;
        }
        return position;
    }
}

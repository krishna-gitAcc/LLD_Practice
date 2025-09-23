package com.LLDSnakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;
    public Board(int size, int numberOfSnakes, int numberOfLadders){
        initializeCells(size);
        addSnakesLadders(numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int boardSize){
        cells = new Cell[boardSize][boardSize];
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                cells[i][j] = new Cell(null);
            }
        }
    }
    private void addSnakesLadders(int numberOfSnakes, int numberOfLadders){
        while(numberOfSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length-2);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, snakeHead);
            Jump snakeObject = new Jump();
            snakeObject.start = snakeHead;
            snakeObject.end = snakeTail;
            int row = (snakeHead) / cells.length;
            int col = (snakeHead) % cells.length;
            if(cells[row][col].jump != null){
                continue;
            }
            cells[row][col].jump = snakeObject;
            numberOfSnakes--;
        }
        while(numberOfLadders > 0){
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length-2);
            int ladderHead = ThreadLocalRandom.current().nextInt(ladderTail, cells.length * cells.length-2);
            Jump ladderObject = new Jump();
            ladderObject.start = ladderTail;
            ladderObject.end = ladderHead;
            int row = (ladderTail - 1) / cells.length;
            int col = (ladderTail - 1) % cells.length;
            if(cells[row][col].jump != null){
                continue;
            }
            cells[row][col].jump = ladderObject;
            numberOfLadders--;
        }
    }
}

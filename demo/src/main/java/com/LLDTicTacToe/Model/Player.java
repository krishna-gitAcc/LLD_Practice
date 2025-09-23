package com.LLDTicTacToe.Model;

public class Player {
    public PlayingPiece playingPiece;
    public String name;
    public Player(PlayingPiece py, String name){
        this.playingPiece = py;
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

package com.LLDSnakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int DiceCount;
    public Dice(int diceCount){
        this.DiceCount = diceCount;
    }
    public int rollDice(){
        return ThreadLocalRandom.current().nextInt(1, 6*DiceCount + 1);
    }
}

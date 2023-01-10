package com.bridgelabz.day4.snakeandladder;

import java.util.Random;

public class UC_3_CheckPosition {
    public static void main(String[] args) {
        Random random = new Random();
        int player = random.nextInt(3);
        int position =0;
        int diceRoll = 1+random.nextInt(6);
        switch (player){
            case 0:position = position;
            break;
            case 1: position = position+diceRoll;
            break;
            default: position=position-diceRoll;
        }
    }
}

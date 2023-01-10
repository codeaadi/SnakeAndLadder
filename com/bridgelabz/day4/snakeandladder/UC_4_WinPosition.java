package com.bridgelabz.day4.snakeandladder;

import java.util.Random;

public class UC_4_WinPosition {
    public static void main(String[] args) {
        Random random = new Random();
        int player = random.nextInt(3);
        int position =0;
        int diceRoll = 1+random.nextInt(6);
        while (position!=100){
        switch (player){
            case 0:position = position;
                break;
            case 1: position = position+diceRoll;
                break;
            default: position=position-diceRoll;
        }
        position++;
        System.out.println(position);
}}
}

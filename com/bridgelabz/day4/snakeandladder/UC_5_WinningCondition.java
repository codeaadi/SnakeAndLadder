package com.bridgelabz.day4.snakeandladder;

import java.util.Random;

public class UC_5_WinningCondition {
    public static void main(String[] args) {
        Random random = new Random();
        int player = random.nextInt();
        int position = 0;
        int WinningPosition=100;
        int diceRoll = 1+random.nextInt(6);
        for(int i=0;i<=WinningPosition;i++){
            int newPosition=i+diceRoll;
            System.out.println("position:"+newPosition);
            if(newPosition>100 && newPosition<0){
                System.out.println("You are not in valid position");
            }else System.out.println("You are in Valid position");
        }

    }
}

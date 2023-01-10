package com.bridgelabz.day4.snakeandladder;

import java.util.Random;

public class UC_6_DicePositionWithPosition {
    static final int WINNING_POSITION = 100;
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game program");

        int position = 0;
        int rollingCount = 0;
        System.out.println("position of single player is :" + position);
        Random random = new Random();

        while(position < WINNING_POSITION ) {
            int options = random.nextInt(3);
            System.out.println("Option :" + options);

            switch (options) {
                case 0:
                    int roll = 1 + random.nextInt(6);
                    System.out.println("after rolling dice position is:" + roll);
                    System.out.println("Ladder i.e. move ahead!");
                    if(position + roll <=100)
                        position += roll ;
                    break;

                case 1:
                    int rolll = 1 + random.nextInt(6);
                    System.out.println("after rolling dice position is:" + rolll);
                    System.out.println("snake i.e. please move back");
                    if(position < 0)
                        position -= rolll;
                    break;

                default:
                    System.out.println("No Play");
            }
            rollingCount ++ ;
            System.out.println("position of single player is = " + position);
        }
        System.out.println("Number of roles to win:" + rollingCount);
}}

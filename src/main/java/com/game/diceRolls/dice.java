package com.game.diceRolls;

import java.util.Random;

/**
 * Created by domin on 16/11/2016.
 */
public class dice {

    public int rollDice(int numberOfDice, int sizeOfDice){

        Random random = new Random();
        int number = 0;

        for (int i = 0; i < numberOfDice; i++) {

            number += random.nextInt(sizeOfDice)+1;
        }

        return number;
    }
}

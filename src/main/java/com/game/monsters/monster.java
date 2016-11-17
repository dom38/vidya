package com.game.monsters;

import com.game.diceRolls.dice;

/**
 * Created by domin on 17/11/2016.
 */
public class monster {

    String name;
    int health;
    int strength;
    int diceRolls;
    int diceSize;
    dice  dice = new dice();

    public int attackDamage() {

        int damage = strength + dice.rollDice(diceRolls, diceSize);
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }
}

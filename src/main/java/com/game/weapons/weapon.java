package com.game.weapons;

import com.game.diceRolls.dice;
import com.game.specialEffects.specialEffect;

/**
 * Created by domin on 16/11/2016.
 */
public class weapon {

    int id;
    int strength;
    int block;
    int diceRolls;
    int diceSize;
    String name;
    dice  dice = new dice();



    public int attackDamage(int strength, int diceRolls, int diceSize) {

        int damage = strength + dice.rollDice(diceRolls, diceSize);
        return damage;
    }

    public int blockDamage(int block, int diceRolls, int diceSize) {

        int damageBlocked = (block/2) + dice.rollDice(diceRolls,diceSize);
        return damageBlocked;
    }

    public specialEffect effectUse() {
        return null;
    }

    public String getName() {
        return name;
    }
}

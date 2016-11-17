package com.game.weapons ;


import com.game.diceRolls.dice;
import com.game.specialEffects.specialEffect;

/**
 * Created by domin on 16/11/2016.
 */
public class weaponWoodenSword extends weapon{

    int id = 1;
    int strength = 5;
    int block = 5;
    int diceRolls = 2;
    int diceSize = 6;
    String name = "Wooden Sword";
    com.game.diceRolls.dice dice = new dice();



    public int attackDamage() {

        int damage = strength + dice.rollDice(diceRolls, diceSize);
        return damage;
    }

    public int blockDamage() {

        int damageBlocked = (block/2) + dice.rollDice(diceRolls,diceSize);
        return damageBlocked;
    }

    public specialEffect effectUse() {

        specialEffect effect = new specialEffect();
        return effect;
    }

    public String getName() {
        return name;
    }
}

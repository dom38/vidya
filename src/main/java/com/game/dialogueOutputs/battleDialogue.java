package com.game.dialogueOutputs;

/**
 * Created by domin on 20/11/2016.
 */
public class battleDialogue extends dialogue {

    StringBuilder stringBuilder = new StringBuilder();

    public String startBattle () {

        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append("What do you want to do? \r\n 1. Attack\r\n2. Block \r\n3. Use Item");

        return stringBuilder.toString();

    }

    public String showDamage (int damage, String weaponName) {

        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append("You did " + damage + " damage with your " + weaponName + ".");

        return stringBuilder.toString();

    }

    public String monsterAttack(String monsterName) {

        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append(monsterName + " attacks!");

        return stringBuilder.toString();
    }

    public String monsterDamage(String monsterName, int monsterDamage, int playerHP ) {

        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append(monsterName + "did " + monsterDamage + ", leaving your HP at" + playerHP + ".");

        return stringBuilder.toString();
    }

    public String blockDamage(String weaponName, int monsterDamageBlocked, int playerHP ) {

        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append("You blocked with your "+weaponName+"and received "+monsterDamageBlocked+" damage, leaving your HP at "+playerHP);

        return stringBuilder.toString();
    }

    public String prepareForBattle(String monsterName ) {

        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append("You're about to fight "+ monsterName + ", pick your weapon!");

        return stringBuilder.toString();
    }

}

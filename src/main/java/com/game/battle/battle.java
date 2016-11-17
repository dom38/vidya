package com.game.battle;

import com.game.monsters.monster;
import com.game.player.player;
import com.game.weapons.weapon;

import java.util.List;

/**
 * Created by domin on 17/11/2016.
 */
public class battle {

    public void doBattle(player player, monster monster){

        prepareForBattle(player, monster);




    }

    public void prepareForBattle(player player, monster monster) {

        System.out.println("You're about to fight "+ monster.getName() + ", pick your weapon!");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        List<weapon> inventory = player.getWeaponInventory();
        for (int i = 0; i < inventory.size(); i++) {

            weapon weapon = inventory.get(i);
            System.out.println(i + ". " + weapon.getName());
        }

        String input = scan.nextLine();
        int index = Integer.getInteger(input);
        scan.close();
        player.setEquippedWeapon(inventory.get(index));
    }
}

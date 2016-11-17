package com.game.events;

import com.game.player.player;
import com.game.weapons.weapon;
import com.game.weapons.weaponWoodenSword;

/**
 * Created by domin on 17/11/2016.
 */
public class eventsChestWoodenSword extends events {

    public void runEvent(player player) {

        System.out.println("You've found a chest here for no raisen, you open the chest");
        System.out.println("Inside is a shitty wooden sword, almost as if this was the beginning of some low-budget game");
        weapon woodenSword = new weaponWoodenSword();
        player.addWeapon(woodenSword);
    }

}

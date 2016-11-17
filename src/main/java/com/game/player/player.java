package com.game.player;

import com.game.weapons.weapon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by domin on 17/11/2016.
 */
public class player {

    int verticalLocation = 0;
    int horizontalLocation = 0;
    int hitPoints = 50;
    List<weapon> weaponInventory = new ArrayList<weapon>();
    weapon equippedWeapon;


    public void addWeapon (weapon weapon) {

        weaponInventory.add(weapon);
    }

    public void gameOver(){}

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setEquippedWeapon(weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public List<weapon> getWeaponInventory() {
        return weaponInventory;
    }

    public int getVerticalLocation() {
        return verticalLocation;
    }

    public int getHorizontalLocation() {
        return horizontalLocation;
    }

    public void setVerticalLocation(int verticalLocation) {
        this.verticalLocation = verticalLocation;
    }

    public void setHorizontalLocation(int horizontalLocation) {
        this.horizontalLocation = horizontalLocation;
    }
}

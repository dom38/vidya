package com.game.weapons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by domin on 17/11/2016.
 */
public class weaponWoodenSwordTest {


    @org.junit.Test
    public void attackDamage() throws Exception {

        weapon sword = new weaponWoodenSword();
        int damage = sword.attackDamage(5,1,1);

        assertEquals(damage, 6);

    }

    @org.junit.Test
    public void blockDamage() throws Exception {

        weapon sword = new weaponWoodenSword();
        int block = sword.blockDamage(5,1,1);

        assertEquals(block, 4, 1);

    }

    @org.junit.Test
    public void effectUse() throws Exception {


        weapon sword = new weaponWoodenSword();
        Object effect = sword.effectUse();

        assertNotNull(effect);

    }

}
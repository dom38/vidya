package com.game.specialEffects;

import com.game.interfaces.specialEffects;

/**
 * Created by domin on 16/11/2016.
 */
public class specialEffect implements specialEffects {

    int magnitude;
    int uses;

    @Override
    public int restoreHealth() {
        return 0;
    }

    @Override
    public int doDamage() {
        return 0;
    }

    @Override
    public int poison() {
        return 0;
    }

    @Override
    public int receiveDamage() {
        return 0;
    }
}

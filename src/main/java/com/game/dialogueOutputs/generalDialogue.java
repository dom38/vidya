package com.game.dialogueOutputs;

/**
 * Created by domin on 20/11/2016.
 */
public class generalDialogue extends dialogue {

    StringBuilder stringBuilder = new StringBuilder();

    public String wrongInput () {

        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append("Please type a number to make your decision.");

        return stringBuilder.toString();

    }
}

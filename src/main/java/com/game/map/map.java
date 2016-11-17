package com.game.map;

import com.game.events.events;
import com.game.player.player;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by domin on 17/11/2016.
 */
public class map {

    public events[][] createNewMap(int verticalSize, int horizontalSize) {

        events[][] gameMap = new events[verticalSize][horizontalSize];

        return gameMap;

    }

    public events[][] populateGameMap(events[] eventsList, int verticalSize, int horizontalSize){

        Random randomEvent = new Random();

        events[][] gameMap = createNewMap(verticalSize, horizontalSize);

        for (int i = 0; i < gameMap[0].length; i++){
            for (int j = 0; j < gameMap.length; j++){
                gameMap[i][j] = eventsList[randomEvent.nextInt(eventsList.length)];
            }
        }

        return gameMap;

    }

    public void movement(player player, events[][] gameMap){

        int x = player.getVerticalLocation();
        int y = player.getHorizontalLocation();

        events currentEvent = gameMap[x][y];
        currentEvent.runEvent(player);

        direction(x, y, player);

        movement(player,gameMap);

    }

    public void direction(int x, int y, player player) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to go: 1. Left, 2. Right, 3. Forward");
        String input = scan.nextLine();

        if (input == "1") {
            x += -1;
        }
        else if (input == "2") {
            x += 1;
        }
        else if (input == "3") {
            y += 1;
        }
        else {
            System.out.println("Enter 1, 2 or 3 nugget");
            System.out.println("Do you want to go: 1. Left, 2. Right, 3. Forward");
        }
        scan.close();

        player.setVerticalLocation(x);
        player.setHorizontalLocation(y);

    }
}

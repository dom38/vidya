package com.game.battle;

import com.game.monsters.monster;
import com.game.player.player;
import com.game.weapons.weapon;

import java.util.List;
import java.util.Scanner;

/**
 * Created by domin on 17/11/2016.
 */
public class battle {

    public void doBattle(player player, monster monster){

        prepareForBattle(player, monster);

        Scanner scan = new Scanner(System.in);

        for (int i = 0; 0 < monster.getHealth(); i++) {

            System.out.println("What do you want to do? \r\n 1. Attack\r\n2. Block \r\n3. Use Item");
            String input = scan.nextLine();

            if (input.equals("1")) {
                weapon weapon = player.getEquippedWeapon();
                int damage = weapon.attackDamage();
                System.out.println("You did "+damage+" damage with your "+weapon.getName()+".");
                monster.setHealth(monster.getHealth() - damage);
                System.out.println(monster.getName() + " attacks!");
                int monsterDamage = monster.attackDamage();
                player.setHitPoints(player.getHitPoints()-monsterDamage);
                System.out.println(monster.getName() + "did " + monsterDamage + ", leaving your HP at" +player.getHitPoints());
            }
            else if (input.equals("2")) {

                weapon weapon = player.getEquippedWeapon();
                int monsterDamageBlocked = monster.attackDamage() - weapon.blockDamage();
                player.setHitPoints(player.getHitPoints()-monsterDamageBlocked);
                System.out.println("You blocked with your "+weapon.getName()+"and received "+monsterDamageBlocked+" damage, leaving your HP at "+player.getHitPoints());
            }

            else if (input.equals("3")){

                //do suttin
            }

//            To do: Item effects (inc inventory, and items list, same as weapons), incorporate special effects from weapons randomly somehow

            else System.out.println("Please type a number to make your decision.");

            if (player.getHitPoints() <= 0) {

                player.gameOver();
            }

        }

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

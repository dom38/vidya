package com.game.battle;

import com.game.dialogueOutputs.battleDialogue;
import com.game.dialogueOutputs.generalDialogue;
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
        battleDialogue battleDialogue = new battleDialogue();
        generalDialogue generalDialogue = new generalDialogue();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; 0 < monster.getHealth(); i++) {

            System.out.println(battleDialogue.startBattle());
            String input = scan.nextLine();
            weapon weapon = player.getEquippedWeapon();

            if (input.equals("1")) {

                attack(weapon, battleDialogue, monster, player);

            }
            else if (input.equals("2")) {

                int monsterDamageBlocked = monster.attackDamage() - weapon.blockDamage();
                player.setHitPoints(player.getHitPoints()-monsterDamageBlocked);
                System.out.println(battleDialogue.blockDamage(weapon.getName(), monsterDamageBlocked, player.getHitPoints()));
            }

            else if (input.equals("3")){

                //do suttin
            }

//            To do: Item effects (inc inventory, and items list, same as weapons), incorporate special effects from weapons randomly somehow

            else System.out.println(generalDialogue.wrongInput());

            if (player.getHitPoints() <= 0) {

                player.gameOver();
            }

        }

        scan.close();

    }

    public void prepareForBattle(player player, monster monster) {

        battleDialogue battleDialogue = new battleDialogue();
        System.out.println(battleDialogue.prepareForBattle(monster.getName()));
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

    public void attack(weapon weapon, battleDialogue battleDialogue, monster monster, player player) {

        int damage = weapon.attackDamage();
        System.out.println(battleDialogue.showDamage(damage,weapon.getName()));
        monster.setHealth(monster.getHealth() - damage);
        System.out.println(battleDialogue.monsterAttack(monster.getName()));
        int monsterDamage = monster.attackDamage();
        player.setHitPoints(player.getHitPoints()-monsterDamage);
        System.out.println(battleDialogue.monsterDamage(monster.getName(),monsterDamage,player.getHitPoints()));

    }
}

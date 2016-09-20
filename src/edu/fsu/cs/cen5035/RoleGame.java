/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        Weapon arrow = WeaponFactory.getWeapon("arrow");
        Weapon axe = WeaponFactory.getWeapon("axe");
        Weapon magicstaff = WeaponFactory.getWeapon("magicstaff");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        //arrow
        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        armor = 3;
        System.out.println("Arrow was able to do " + arrow.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        armor = 10;
        System.out.println("Arrow was able to do " + arrow.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        //axe
        System.out.println("Axe has " + axe.hit() + " of damage.");
        armor = 18;
        System.out.println("Axe was able to do " + axe.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        armor = 21;
        System.out.println("Axe was able to do " + axe.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        //magicstaff
        System.out.println("MagicStaff has " + magicstaff.hit() + " of damage.");
        armor = 20;
        System.out.println("MagicStaff was able to do " + magicstaff.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        armor = 11;
        System.out.println("MagicStaff was able to do " + magicstaff.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        //TODO: Add the remainig weapons here

    }
}

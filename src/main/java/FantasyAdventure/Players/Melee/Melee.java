package FantasyAdventure.Players.Melee;

import FantasyAdventure.Behaviours.IAttack;
import FantasyAdventure.Players.Player;
import FantasyAdventure.Weapons.Weapon;

import java.util.ArrayList;

public abstract class Melee extends Player implements IAttack {

    protected int armour;
    Weapon activeWeapon;
    protected ArrayList<Weapon> weapons;

    public Melee(String name){
        super(name, 100);
        this.armour = 40;
        this.activeWeapon = null;
        this.weapons = new ArrayList<Weapon>();
    }


    public int getArmour() {
        return this.armour;
    }

    public void addWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public int getNumOfWeapons() {
        return this.weapons.size();
    }

    public void setActiveWeapon(Weapon weapon) {
        if(this.weapons.remove(weapon)){
        this.weapons.remove(weapon);
        this.activeWeapon = weapon;}
    }

    public Weapon getActiveWeapon() {
        return this.activeWeapon;
    }

//    public int


}

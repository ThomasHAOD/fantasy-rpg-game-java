package FantasyAdventure.Players.Melee;

public class Knight extends Melee {


    public Knight(String name) {
        super(name);
        this.armour += 30;
        this.hP -= 40;
    }

    public double attack(){
        return this.activeWeapon.getDamage();
    }
}

package FantasyAdventure.Players.Melee;

public class Barbarian extends Melee {

    public Barbarian(String name){
        super(name);
        this.armour -= 20;
    }

    public double attack() {
        return (this.activeWeapon.getDamage() * 1.2);
    }

}

package FantasyAdventure.Players.Melee;

public class Dwarf extends Melee {

    public Dwarf(String name){
        super(name);
        this.hP += 50;
    }

    public double attack() {
        return (this.activeWeapon.getDamage() * 0.9);
    }

}

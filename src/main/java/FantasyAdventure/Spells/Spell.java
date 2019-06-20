package FantasyAdventure.Spells;

public class Spell {

    private double power;
    private String type;

    public Spell(double power, String type){
        this.power = power;
        this.type = type;
    }

    public double getPower() {
        return this.power;
    }
}

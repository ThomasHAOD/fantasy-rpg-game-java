package FantasyAdventure.Players;

import FantasyAdventure.Behaviours.ICollectable;

import java.util.HashMap;

public abstract class Player {

    private String name;
    protected int hP;
    private HashMap<String, ICollectable> inventory;

    public Player(String name, int hP){
        this.name = name;
        this.hP = hP;
        this.inventory = new HashMap<String, ICollectable>();
    }

    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.hP;
    }
}

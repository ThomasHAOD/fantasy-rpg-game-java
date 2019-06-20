package FantasyAdventure.Healer;

import FantasyAdventure.Items.Item;
import FantasyAdventure.Players.Player;
import FantasyAdventure.Spells.Buff;

import java.util.ArrayList;

public abstract class Healer extends Player {

    protected ArrayList<Item> consumables;
    protected ArrayList<Buff> invocations;

    public Healer(String name) {
        super(name, 120);
        this.consumables = new ArrayList<Item>();
        this.invocations = new ArrayList<Buff>();
    }

    public int getNumOfConsumables() {
        return this.consumables.size();
    }

    public void addItemToConsumables(Item item) {
        this.consumables.add(item);
    }

    public void useItem(Item item) {
        this.consumables.remove(item);
    }
}

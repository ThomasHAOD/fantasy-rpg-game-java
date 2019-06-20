package FantasyAdventure.Players.Casters;

import FantasyAdventure.Behaviours.IAttack;
import FantasyAdventure.Familiars.Familiar;
import FantasyAdventure.Players.Player;
import FantasyAdventure.Spells.Spell;

import java.util.ArrayList;

public abstract class Caster extends Player implements IAttack {

    private ArrayList<Spell> spellBook;
    private ArrayList<Familiar> beasts;
    protected int spellSlots;
    protected Spell activeSpell;
    protected Familiar conjuredFamiliar;


    public Caster(String name, int spellSlots) {
        super(name, 60);
        this.spellBook = new ArrayList<Spell>();
        this.beasts = new ArrayList<Familiar>();
        this.spellSlots = spellSlots;
        this.activeSpell = null;
        this.conjuredFamiliar = null;
    }

    public void prepareSpell(Spell spell) {
        this.spellBook.add(spell);
    }

    public int getNumOfSpells() {
        return this.spellBook.size();
    }

    public void setActiveSpell(Spell spell) {
        int spellIndex = this.spellBook.indexOf(spell);
        this.activeSpell = this.spellBook.get(spellIndex);
    }

    public Spell getActiveSpell() {
        return this.activeSpell;
    }

    public void addFamiliar(Familiar familiar) {
        this.beasts.add(familiar);
    }

    public int getNumOfFamiliars() {
        return this.beasts.size();
    }

    public void conjureFamiliar(Familiar familiar) {
        int familiarIndex = this.beasts.indexOf(familiar);
        this.conjuredFamiliar = this.beasts.get(familiarIndex);
    }

    public Familiar getConjuredFamiliar() {
        return this.conjuredFamiliar;
    }

    public double attack(){
        if(this.spellSlots != 0) {
            this.spellSlots -= 1;
            return this.activeSpell.getPower();
        } else {return 0;
        }

    }

    public int getNumOfSpellSLots() {
        return this.spellSlots;
    }
}

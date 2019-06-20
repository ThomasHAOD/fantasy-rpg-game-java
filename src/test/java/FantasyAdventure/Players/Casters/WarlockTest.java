package FantasyAdventure.Players.Casters;

import FantasyAdventure.Familiars.Familiar;
import FantasyAdventure.Spells.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarlockTest {

    Warlock warlock;
    Spell spell;
    Familiar familiar;

    @Before
    public void before(){
        warlock = new Warlock("Spencer");
        spell = new Spell(5.0, "fire");
        familiar = new Familiar("Pikachu", 80);
    }

    @Test
    public void canPrepareSpell(){
        warlock.prepareSpell(spell);
        assertEquals(1, warlock.getNumOfSpells());
    }

    @Test
    public void canSetActiveSpell(){
        warlock.prepareSpell(spell);
        warlock.setActiveSpell(spell);
        assertEquals(spell, warlock.getActiveSpell());
    }

    @Test
    public void canAddFamiliar(){
        warlock.addFamiliar(familiar);
        assertEquals(1, warlock.getNumOfFamiliars());
    }

    @Test
    public void canConjureFamiliar(){
        warlock.addFamiliar(familiar);
        warlock.conjureFamiliar(familiar);
        assertEquals(familiar, warlock.getConjuredFamiliar());
    }

    @Test
    public void canAttack(){
        warlock.prepareSpell(spell);
        warlock.setActiveSpell(spell);
        assertEquals(5.0, warlock.attack(), 0.01);
    }

    @Test
    public void canGetNumberOfSpellSlots(){
        assertEquals(3, warlock.getNumOfSpellSLots());
    }

    @Test
    public void canGetNumberOfSpellSlotsAfterAttack(){
        warlock.prepareSpell(spell);
        warlock.setActiveSpell(spell);
        warlock.attack();
        assertEquals(2, warlock.getNumOfSpellSLots());
    }

}
package FantasyAdventure.Players;

import FantasyAdventure.Players.Melee.Barbarian;
import FantasyAdventure.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon weapon;

    @Before
    public void before() {
        barbarian = new Barbarian("Conan");
        weapon = new Weapon(40);
        barbarian.addWeapon(weapon);
    }

    @Test
    public void hasLowerArmour(){
        assertEquals(20, barbarian.getArmour());
    }

    @Test
    public void attackAreStronger(){
        barbarian.setActiveWeapon(weapon);
        assertEquals(48, barbarian.attack(), 0.01);
    }
}
package FantasyAdventure.Players;

import FantasyAdventure.Players.Melee.Dwarf;
import FantasyAdventure.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Weapon weapon;

    @Before
    public void before(){
        dwarf = new Dwarf("Gimli");
        weapon = new Weapon(40);
    }

    @Test
    public void canGetName(){
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(150, dwarf.getHP());
    }

    @Test
    public void canGetArmour(){
        assertEquals(40, dwarf.getArmour());
    }

    @Test
    public void canAddWeapon(){
        assertEquals(0,dwarf.getNumOfWeapons());
        dwarf.addWeapon(weapon);
        assertEquals(1, dwarf.getNumOfWeapons());
    }

    @Test
    public void weaponDoesLessDamage(){
        dwarf.addWeapon(weapon);
        dwarf.setActiveWeapon(weapon);
        assertEquals(36, dwarf.attack(), 0.01);
    }

    @Test
    public void canSetActiveWeapon(){
        dwarf.addWeapon(weapon);
        dwarf.setActiveWeapon(weapon);
        assertEquals(weapon, dwarf.getActiveWeapon());
    }


}
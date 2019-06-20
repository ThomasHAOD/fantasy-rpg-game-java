package FantasyAdventure.Players;

import FantasyAdventure.Players.Melee.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Jaime Lannister");
    }

    @Test
    public void hasLowerHP(){
        assertEquals(60, knight.getHP());
    }

    @Test
    public void hasHigherArmour(){
        assertEquals(70, knight.getArmour());
    }

}
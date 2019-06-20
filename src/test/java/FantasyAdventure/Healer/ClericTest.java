package FantasyAdventure.Healer;

import FantasyAdventure.Items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    Cleric cleric;
    Item item;

    @Before
    public void before(){
        cleric = new Cleric("Father Brian");
        item = new Item();
    }

    @Test
    public void canGetNumberOfConsumables(){
        assertEquals(0, cleric.getNumOfConsumables());
    }

    @Test
    public void canAddToConsumables(){
        cleric.addItemToConsumables(item);
        assertEquals(1, cleric.getNumOfConsumables());
    }

    @Test
    public void canUseItems(){
        cleric.addItemToConsumables(item);
        cleric.addItemToConsumables(item);
        assertEquals(2, cleric.getNumOfConsumables());
        cleric.useItem(item);
        assertEquals(1, cleric.getNumOfConsumables());
    }


}
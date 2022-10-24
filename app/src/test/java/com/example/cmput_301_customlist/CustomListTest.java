package com.example.cmput_301_customlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;


    /**
     * we create a CustomList object before running
     */
    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Burnaby", "BC"));
        assertEquals(listSize,listSize + 1);
    }

}

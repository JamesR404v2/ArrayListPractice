package com.coderscampus.exercises;

import java.util.ArrayList;

public class DisplayItem
{
    private ArrayList<String> list;

    public DisplayItem(ArrayList<String> list) {
        this.list = list;
    }

    public void displayList() {
        System.out.println("Items in the list: " + list);
    }
}
package com.coderscampus.exercises;

import java.util.ArrayList;

public class DisplayList
{
    private ArrayList<String> list;

    public DisplayList(ArrayList<String> list) {
        this.list = list;
    }

    public void displayList()
    {

//        System.out.println("Items in the list: " + list);
//        this shows the list, but the user later on does not know which item number is which... (making it more difficult to delete or update)
//        So instead,
//        This will display the entire list, prefixing it with the index numbers.
        System.out.println("Items in the list:");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println((i + 1) + ". " + list.get(i));
        }

    }
}

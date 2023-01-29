package com.coderscampus.exercises;

import java.util.ArrayList;

public class arrayListPracticeApp
{

    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args)
    {
        arrayListPracticeApp launch = new arrayListPracticeApp();
        System.out.println("app launching");

        launch.Orchestrator();
    }

    public void Orchestrator()
    {
        System.out.println("app launched");

        AddItem addItem = new AddItem(list);
        addItem.addItemToList();
    }
}

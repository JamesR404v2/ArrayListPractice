package com.coderscampus.exercises;

import java.util.ArrayList;
import java.util.Scanner;


public class AddItem {

    private ArrayList<String> list;

    public AddItem(ArrayList<String> list) {
        this.list = list;
    }

    public void addItemToList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter items to add to the ArrayList, type 'quit' to stop:");
        while (true) {
            String item = scanner.nextLine();
            if (item.equals("quit")) {
                break;
            }
            list.add(item);
        }
        System.out.println("ArrayList: " + list);
    }
}

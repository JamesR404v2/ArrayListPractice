package com.coderscampus.exercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DeleteItem
{
    private ArrayList<String> list;

    public DeleteItem(ArrayList<String> list)
    {
        this.list = list;
    }

    public void deleteItemFromList() {
        // Display the current items
        DisplayList displayList = new DisplayList(list);
        displayList.displayList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index number of the item to delete:");
        try
        {
            int index = scanner.nextInt();
            String item = list.get(index);
            list.remove(index);
            System.out.println("Item '" + item + "' was deleted from the ArrayList");
        }
        catch (InputMismatchException exception)
        {
            System.out.println("Invalid input, please enter a number that matches a line item");
        }
        catch (IndexOutOfBoundsException exception)
        {
            System.out.println("Index not found, please enter a number that matches a line item");
        }
    }
}

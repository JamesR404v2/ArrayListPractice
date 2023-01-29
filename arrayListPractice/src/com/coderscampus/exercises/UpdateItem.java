package com.coderscampus.exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UpdateItem
{
    private ArrayList<String> list;

    public UpdateItem(ArrayList<String> list) {
        this.list = list;
    }

    public void updateItemInList()
    {
        System.out.println("The list currently contains these items");
//      call to display current items
        DisplayList displayList = new DisplayList(list);
        displayList.displayList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the item to update:");
        try
        {
            int index = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the new value for the item:");
            String newValue = scanner.nextLine();
            list.set(index, newValue);
            System.out.println("Item updated in the list.");
        } catch (InputMismatchException exception)
        {
            System.out.println("Invalid input, please enter a number that matches a line item");
        }
        catch (IndexOutOfBoundsException exception)
        {
        System.out.println("Index not found, please enter a number that matches a line item");
        }


    }
}
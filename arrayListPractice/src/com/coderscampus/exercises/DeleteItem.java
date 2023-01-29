package com.coderscampus.exercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DeleteItem
{

    private ArrayList<String> list;

    public DeleteItem(ArrayList<String> list) {
        this.list = list;
    }

    public void deleteItemFromList() {
        System.out.println("Enter item number to delete from the ArrayList:");
        try
        {
            Scanner scanner = new Scanner(System.in);
            String item = scanner.nextLine();
        }
        catch (InputMismatchException exception)
        {
            System.out.println("Invalid input, please enter a number that matches a line item");
        }
        catch (IndexOutOfBoundsException exception)
        {
            System.out.println("Index not found, please enter a number that matches a line item");
        }
        if (list.contains(item)) {
            list.remove(item);
            System.out.println("Item '" + item + "' was deleted from the ArrayList");
        } else {
            System.out.println("Item '" + item + "' was not found in the ArrayList");
        }
    }


}

package com.coderscampus.exercises;

import java.util.ArrayList;
import java.util.Scanner;

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

//        Show user menu for app options:

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add item to the list");
            System.out.println("2. Update item from the list");
            System.out.println("3. Display items from the list");
            System.out.println("4. Delete item from the list");
            System.out.println("5. Quit");

//            Take user choice and launch appropriate CRUD option.

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    AddItem addItem = new AddItem(list);
                    addItem.addItemToList();
                    break;
                case 2:
                    UpdateItem updateItem = new UpdateItem(list);
                    updateItem.updateItemInList();
                    break;
                case 3:
                    DisplayItem displayItem = new DisplayItem(list);
                    displayItem.displayList();
                    break;
                case 4:
                    DeleteItem deleteItem = new DeleteItem(list);
                    deleteItem.deleteItemFromList();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option, try again.");
                    break;
            }
        }

    }
}

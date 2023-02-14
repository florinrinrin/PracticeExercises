package arrayListExercises;
//Create a program that allows the user to add, remove, and view elements in a grocery list.
// The user should be able to enter a grocery item, and it will be added to the list.
// The user should also be able to remove an item from the list and view all items in the list.
//
//        Instructions:
//
//        Create an ArrayList called 'groceryList' to store the grocery items.
//        Use a loop to continuously prompt the user for input until they choose to exit.
//        Use a switch statement to handle the following user inputs:
//        a. "add" - add an item to the grocery list
//        b. "remove" - remove an item from the grocery list
//        c. "view" - view all items in the grocery list
//        d. "exit" - exit the loop and end the program
//        Use the appropriate ArrayList method to add, remove, and view items.
//        Print a message to indicate the success or failure of each action (e.g. item added, item removed, etc.).

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Please select one of the option below:\n"
                    + "1 for adding items\n"
                    + "2 for removing items\n"
                    + "3 for viewing the grocery list\n"
                    + "4 to exit\n");

            try {
                option = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number format");
                continue;
            }

            //option = Integer.parseInt(scanner.next());


            switch (option) {
                case 1 -> {
                    System.out.println("Please type in the name of the item:\n");
                    String item = scanner.next();
                    groceryList.add(item);
                    System.out.println("You have added " + item + " on your shopping list");
                }
                case 2 -> {
                    System.out.println("please type in the name of the item you want to remove: ");
                    String itemToRemove = scanner.next();
                    for (int i = 0; i < groceryList.size(); i++) {
                        if (groceryList.get(i).contains(itemToRemove)) {
                            groceryList.remove(i);
                            i--; //necessary so that the loop continues from the same position. If an item is removed (row above) then the size of the array decreases by 1.
                        }
                    }
                }
                case 3 -> System.out.println(groceryList);
                case 4 -> System.out.println("Exiting the program");
                default -> System.out.println("Please select a valid option");
            }
        } while (option != 4);
    }


    }


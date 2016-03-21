package dataStructures;

/**
 * Created by Brecuero on 3/20/2016.
 */
/*
MyDequeApp class
User input + menu and testing input
*/
import java.util.*;
public class MyDequeApp
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int newInput; // declare an integer to represent the user's input value

        int dequeSize; // declare a variable for the size of the deque

        System.out.println("Welcome to the MyDequeApp. Please specify how large you would like the deque to be in the form of an integer. \n");
        dequeSize = scan.nextInt();

        MyDeque dequeArr = new MyDeque(dequeSize); // create a deque of the specified size

        do
        {
            // provide a list of options:
            System.out.println("\n Please select what you would like to test. Enter -1 to quit.");
            System.out.println("1. Insert to Front");
            System.out.println("2. Insert to Rear");
            System.out.println("3. Remove from Front");
            System.out.println("4. Remove from Rear");
            System.out.println("5. Peek Front");
            System.out.println("6. Peek Rear");
            System.out.println("7. The State\n");
            System.out.println("Enter -1 to quit");

            newInput = scan.nextInt(); // read in the user's choice

            switch(newInput)
            {
                case 1: // insertFront()
                {
                    String id; // create a variable for the item number
                    double price; // create a variable for the item price

                    if(dequeArr.isFull()) // if the deque is full, cannot insert
                        System.out.println("Sorry, the deque is full. Cannot insert.");

                    else
                    {
                        try {
                            System.out.println("Please enter the item number you wish to insert."); // prompt for the item number
                            scan.nextLine(); // clear carriage return
                            id = scan.nextLine();

                            System.out.println("Please enter the item price."); // prompt for the item price
                            price = scan.nextDouble();
                            Item newItem = new Item(id, price); // create an item with the given number and price

                            dequeArr.insertFront(id, price); // insert the item
                        }
                        catch(Exception d)
                        {//makes sure their is no string input by user
                            System.out.println("no Letters Please: \n");
                            scan.next();

                        }

                    } // end else

                    break;
                } // end case 1

                case 2: // insertRear()
                {
                    String id; // create a variable for the item number
                    double price; // create a variable for the item price

                    if(dequeArr.isFull()) // if the deque is full, cannot insert
                        System.out.println("Sorry, the deque is full. Cannot insert.");

                    else
                    {
                        System.out.println("Please enter the item number you wish to insert."); // prompt for the item number
                        scan.nextLine(); // clear carriage return
                        id = scan.nextLine();

                        System.out.println("Please enter the item price."); // prompt for the item price
                        price = scan.nextDouble();

                        Item newItem = new Item(id, price); // create an item with the given number and price

                        dequeArr.insertRear(id, price); // insert the item
                    } // end else

                    break;
                } // end case 2

                case 3: //removeFront()
                {
                    if(dequeArr.isEmpty()) // if the deque is empty, cannot remove
                        System.out.println("Sorry, the deque is empty. Cannot remove.");

                    else
                        System.out.println("You removed: " + dequeArr.removeFront().getId());

                    break;
                } // end case 3

                case 4: // removeRear()
                {
                    if(dequeArr.isEmpty()) // if the deque is empty, cannot remove
                        System.out.println("Sorry, the deque is empty. Cannot remove.");
                    else
                        System.out.println("You removed: " + dequeArr.removeRear().getId());

                    break;
                } // end case 4

                case 5: // peekFront()
                {
                    if(dequeArr.isEmpty()) // if the deque is empty, cannot peek
                        System.out.println("The deque is empty. There is nothing to peek.");
                    else
                        System.out.println("The front is: " + dequeArr.peekFront().getId() + "@ $" + dequeArr.peekFront().getPrice());

                    break;
                } // end case 5

                case 6: // peekRear()
                {
                    if(dequeArr.isEmpty()) // if the deque is empty, cannot peek
                        System.out.println("The deque is empty. There is nothing to peek.");
                    else
                        System.out.println("The rear is: " + dequeArr.peekRear().getId() + "@ $" + dequeArr.peekRear().getPrice());

                    break;
                } // end case 6

                case 7: // toString()
                {
                    System.out.println("The state is: " + dequeArr.toString());

                    break;
                } // end case 7

            } // end switch

//Test for non numeric date


// End test for non-numeric data


        } // end do
        while(newInput != -1);

        System.out.println("\nFin.\n");

    }

}

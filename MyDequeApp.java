
/**
 * Created by Brecuero on 3/19/2016.
 */
package dataStructures;
import java.util.Scanner;
public class MyDequeApp
{

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);//....................................................Allows user to input
            int choice=0;
            int change;
            System.out.println("Dequeue Manipulation Enter Size of Deque \n");
            change = input.nextInt();//.................................................................Allows user to change the size of the Dequeue
            MyDeque theDeQueue = new MyDeque(change);//.................................................Queue holds 5 items
            while(choice!=8)
            {


                System.out.println("Please Select a number in the menu: \n" + " 1: For insert Front \n 2: For insert rear \n 3: For remove Front \n 4: For Remove Rear  " +
                        "\n 5: For Peek Front \n 6: For Peek rear \n 7: For Display queue \n 8: For Quit  ");
                         choice = input.nextInt();//................................................User Options

                switch (choice)
                {//..................................................................................Switch Case Menu
                    case 1:

                        try//........................................................................This is what we want anything else the catch will block it and display a message
                         {
                            String sku;//............................................................Variable for Item Number
                            double Price;//..........................................................Variable for Price
                               if(theDeQueue.isFull())
                                   System.out.println("Is Full");
                            else

                                   System.out.println("Please enter the item number you wish to insert."); // prompt for the item number
                            input.nextLine(); // clear carriage return
                            sku = input.nextLine();

                            System.out.println("Please enter the item price."); // prompt for the item price
                            Price = input.nextDouble();

                            Item newItem = new Item(); // create an item with the given number and price

                            theDeQueue.insertFront(newItem); // insert the item
                         }
                           catch(Exception d)
                              {//...................................................................makes sure their is no string input by user
                                 System.out.println("no Letters Please: \n");
                                input.next();

                            }
                        break;
                    case 2:
                       try//........................................................................This is what we want anything else the catch will block it and display a message
                       {
                       String sku;//............................................................Variable for Item Number
                       double Price;//..........................................................Variable for Price
                            if(theDeQueue.isFull())
                                System.out.println("Is Full");
                            else

                                System.out.println("Please enter the item number you wish to insert."); // prompt for the item number
                            input.nextLine(); // clear carriage return
                            sku= input.nextLine();

                            System.out.println("Please enter the item price."); // prompt for the item price
                            Price= input.nextDouble();

                            Item newItem2 = new Item(); // create an item with the given number and price

                            theDeQueue.insertRear(newItem2); // insert the item
                          }
                        catch(Exception d)
                        {//makes sure their is no string input by user
                            System.out.println("no Letters Please: \n");
                            input.next();

                        }
                        break;
                    case 3:
                        if(theDeQueue.isEmpty()) // if the deque is empty, cannot remove
                            System.out.println("Sorry, the deque is empty. Cannot remove.");

                        else
                            System.out.println("You removed: " + theDeQueue.removeFront().getSku());

                        break;
                    case 4:
                        if(theDeQueue.isEmpty()) // if the deque is empty, cannot remove
                            System.out.println("Sorry, the deque is empty. Cannot remove.");
                        else
                            System.out.println("You removed: " + theDeQueue.removeRear().getSku());

                        break;
                    case 5:
                        if(theDeQueue.isEmpty()) // if the deque is empty, cannot peek
                            System.out.println("The deque is empty. There is nothing to peek.");
                        else
                            System.out.println("The front is: " + theDeQueue.peekFront().getSku() + "@ $" + theDeQueue.peekFront().getItemPrice());

                        break;
                    case 6:
                        if(theDeQueue.isEmpty()) // if the deque is empty, cannot peek
                            System.out.println("The deque is empty. There is nothing to peek.");
                        else
                            System.out.println("The rear is: " + theDeQueue.peekRear().getSku() + "@ $" + theDeQueue.peekRear().getItemPrice());

                        break;
                    case 7:
                        System.out.println("The state is: " + theDeQueue.toString());


                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("You Didn't Enter any of the Options");//..............If User Chooses a number out of bounds
                }
            }
           /* while( !theDeQueue.isEmpty() ) // remove and display
            { // all items
                Item n = theDeQueue.removeFront(); // (40, 50, 60, 70, 80)

                System.out.print(n);
                System.out.print(" ");
            }

            System.out.println("");
            */

        }
    }




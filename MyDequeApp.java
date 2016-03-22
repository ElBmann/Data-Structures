
/**
 * Created by Brecuero on 3/19/2016.
 */
package dataStructures;
import java.util.Scanner;
public class MyDequeApp
{

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);//..................................................................Allows user to input
            int choice=0;
            int change;
            System.out.println("Dequeue Manipulation Enter Size of Deque: ");
            change = input.nextInt();//................................................................................Allows user to change the size of the Dequeue
            MyDeque theDeQueue = new MyDeque(change);//................................................................Dequeue
            while(choice!=8)
            {

                System.out.println("Please Select a number in the menu: \n" + " 1: For insert Front \n " +
                        "2: For insert rear \n 3: For remove Front \n 4: For Remove Rear  " +
                        "\n 5: For Peek Front \n 6: For Peek rear \n 7: For Display queue \n 8: For Quit  ");
                         choice = input.nextInt();//.................................................................. User Options

                switch (choice)
                {//................................................................................................... Switch Case Menu
                    case 1:
                            String sku;//............................................................................. Variable for Item Number
                            double itemPrice;//........................................................................Variable for Price
                               if(theDeQueue.isFull())
                                   System.out.println("Is Full");
                            else
                                     try//.............................................................................This is what we want anything else the catch will block it and display a message
                                     {
                                   System.out.println("Please enter the Sku number you wish to insert.");//............Prompt for the item number
                                   input.nextLine();//.................................................................clear carriage return
                                   sku = input.nextLine();

                                   System.out.println("Please enter the item price.");//...............................Prompt for the item price
                                   itemPrice = input.nextDouble();
                                   Item newItem = new Item(sku,itemPrice);//...........................................Create an item with the given number and price

                                   theDeQueue.insertFront(sku,itemPrice);//............................................Insert the item
                         }
                           catch(Exception d)
                              {//......................................................................................Makes sure their is no string input by user
                                 System.out.println("no Letters Please: \n");
                                input.nextLine();

                            }
                        break;
                    case 2:

                           if(theDeQueue.isFull())
                               System.out.println("Is Full");
                           else
                               try//...................................................................................This is what we want anything else the catch will block it and display a message
                               {
                                   System.out.println("Please enter the Sku number you wish to insert.");//............Prompt for the item number
                                   input.nextLine();//.................................................................clear carriage return
                                   sku = input.nextLine();

                                   System.out.println("Please enter the item price.");//...............................Prompt for the item price
                                   itemPrice = input.nextDouble();
                                   Item newItem = new Item(sku,itemPrice);//...........................................Create an item with the given number and price

                                   theDeQueue.insertRear(sku,itemPrice);//.............................................Insert the item
                               }
                               catch(Exception d) {//..................................................................Makes sure their is no string input by user
                                   System.out.println("no Letters Please: \n");
                                   input.nextLine();
                               }


                        break;
                    case 3:
                        if(theDeQueue.isEmpty())//.....................................................................If the deque is empty, cannot remove
                            System.out.println("There is Nothing HERE SON!!!!");

                        else
                            System.out.println("You removed: " + theDeQueue.removeFront().getSku());//.................All Sku Numbers are Removed From Front

                        break;
                    case 4:
                        if(theDeQueue.isEmpty())//.....................................................................If the deque is empty, cannot remove
                            System.out.println("Sorry, the deque is empty. Cannot remove.");
                        else
                            System.out.println("You removed: " + theDeQueue.removeRear().getSku());

                        break;
                    case 5:
                        if(theDeQueue.isEmpty())//.....................................................................If the deque is empty, cannot peek
                            System.out.println("The deque is empty. There is nothing to peek.");
                        else
                            System.out.println("The front is: " + theDeQueue.peekFront().getSku() + "@ $" + theDeQueue.peekFront().getItemPrice());//.......??

                        break;
                    case 6:
                        if(theDeQueue.isEmpty())//.....................................................................If the deque is empty, cannot peek
                            System.out.println("The deque is empty. There is nothing to peek.");
                        else
                            System.out.println("The rear is: " + theDeQueue.peekRear().getSku() + "@ $" + theDeQueue.peekRear().getItemPrice());//.............??

                        break;
                    case 7:
                        System.out.println("The state is: " + theDeQueue.toString());//................................If Display Queue

                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("You Didn't Enter any of the Options");//...................................If User Chooses a number out of bounds
                }
            }

        }
    }

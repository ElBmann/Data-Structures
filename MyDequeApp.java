
/**
 * Created by Brecuero on 3/19/2016.
 */
package dataStructures;
import java.util.Scanner;
public class MyDequeApp
{

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);//..............................................Reading from System.in


            int choice=0;
            int change;
            System.out.println("Dequeue Manipulation Menu Please Type 1 To Continue. \n");
            change = input.nextInt();
            while(choice!=8)
            {

                MyDeque theDeQueue = new MyDeque(change);//.................................................Queue holds 5 items
                System.out.println("Please Enter: \n" + " 1: For insert Front \n 2: For insert rear \n 3: For remove Front \n 4: For Remove Rear  " +
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
                                   throw new RuntimeException("It is full");
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
                            {//makes sure their is no string input by user
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
                                throw new RuntimeException("It is full");
                            else

                                System.out.println("Please enter the item number you wish to insert."); // prompt for the item number
                            input.nextLine(); // clear carriage return
                            sku= input.nextLine();

                            System.out.println("Please enter the item price."); // prompt for the item price
                            Price= input.nextDouble();

                            Item newItem = new Item(); // create an item with the given number and price

                            theDeQueue.insertRear(newItem); // insert the item
                        }
                        catch(Exception d)
                        {//makes sure their is no string input by user
                            System.out.println("no Letters Please: \n");
                            input.next();

                        }
                        break;
                    case 3:
                        theDeQueue.removeFront();//......................................................Remove 3 items

                        break;
                    case 4:
                        theDeQueue.removeRear();
                        break;
                    case 5:
                        theDeQueue.peekFront();
                        break;
                    case 6:
                        theDeQueue.peekRear();
                        break;
                    case 7:
                        while( !theDeQueue.isEmpty() )//.........................................Remove and display
                        {//......................................................................All items
                            Item n = theDeQueue.removeRear();
                            System.out.print(n);
                            System.out.print(" ");
                        }
                        System.out.println("");
                       // System.out.print(“ “);
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




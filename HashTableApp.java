package Hw4; /**
 * Created by Brian Recuero on 5/7/2016.
 */
import java.util.Scanner;
public class HashTableApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//......................................................................Allows user to input
        System.out.println("Create the size of Hash Table: ");
        int change = input.nextInt();//....................................................................................Allows user to change the size of the HashTable
        HashTable theHashing = new HashTable(change);//....................................................................HashTable
        int menu = 0;

        do {

            System.out.println("Please Select a number in the menu: \n" + " 1: For insert \n " +
                    "2: For Search \n 3: For Delete \n 4: For Display " +
                    "\n 5: To leave \n ");
            menu = input.nextInt();//..................................................................................User Options

            switch (menu) {//........................................................................................................Switch Case Menu
                case 1:

                    System.out.println("Type in word ");
                    String hashWord = input.next();
                    //theHashing.stringHashFunction(hashWord);
                    theHashing.insert(new DataItem(hashWord));
                    System.out.println("Lets See if this shit Works: "+theHashing.hashArray[Integer.valueOf(theHashing.stringHashFunction(hashWord))]);
                    break;
                case 2:
                    System.out.print("Type in word your searching for");
                    int key = input.nextInt();
                    theHashing.find(key);
                    if(theHashing.find(key)==theHashing.insert(key))
                    {
                        
                    }

                    break;
                case 3:
                    System.out.println(" Pick word you want to delete");
                    int deleteWord = input.nextInt();
                    theHashing.delete(deleteWord);
                    break;
                case 4:
                    displayTable(theHashing);

                    break;
    /* case 5:
                    if(theDeQueue.isEmpty())//.........................................................................If the deque is empty, cannot peek
                        System.out.println("The deque is empty. There is nothing to peek.");
                    else
                        System.out.println("The Item Sku is: " + theDeQueue.peekFront().getSku() + "\nThe Price is: $" + theDeQueue.peekFront().getItemPrice());
                    break;
                case 6:
                    if(theDeQueue.isEmpty())//.........................................................................If the deque is empty, cannot peek
                        System.out.println("The deque is empty. There is nothing to peek.");
                    else
                        System.out.println("The Item Sku is: " + theDeQueue.peekRear().getSku() + "\nThe Price is: $" + theDeQueue.peekRear().getItemPrice());//.............Displays peek Rear
                    break;
                case 7:
                    System.out.println("Your Dequeue Elements: " + theDeQueue.toString());//...........................If Display Queue
                    break;
                case 8://write something along the lines of YOu clicked Exit have a good one
                    break;
     */
                default:
                    System.out.println("You Failed to pick the right option");//.......................................If User Chooses a number out of bounds
            }
        }
        while (menu != 5);
    }

    //}
    public static void displayTable(HashTable theHashing)//Hashing Table
    {
        System.out.print("Table:");
        for(int j=0; j<theHashing.getArraySize(); j++)
        {
            if(!theHashing.isItNull(j) && theHashing.getHashArray(j) != -1)
            {
                System.out.print(theHashing.getHashArray(j) + " ");
            }
            else
                System.out.print(" ** ");

        }

        System.out.println("");
    }

}//End App Class

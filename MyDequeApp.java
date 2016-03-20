
/**
 * Created by Brecuero on 3/19/2016.
 */
package dataStructures;
import java.util.Scanner;
public class MyDequeApp {

        public static void main(String[] args)//might have to remove static
        {
            Scanner input = new Scanner(System.in);  // Reading from System.in
            //MyDeque D1= new MyDeque();//........fixBug
            //System.out.println(D1.toString());
            MyDeque theDeQueue = new MyDeque(5); //........................................queue holds 5 items
            int choice=0;
            int choice2=0;
            String choice3 = null;
            while(choice!=8) {

                System.out.println("Please Enter: \n" + " 1: For insert Front \n 2: For insert rear \n 3: For remove Front \n 4: For Remove Rear  " +
                        "\n 5: For Peek Front \n 6: For Peek rear \n 7: For Display queue \n 8: For Quit  ");
                choice = input.nextInt();


                switch (choice) {
                    case 1:
                        //System.out.println("Enter an Item: ");
                        //choice3 = input.nextLine();
                        System.out.println("Enter The Price: ");
                        choice2= input.nextInt();
                        theDeQueue.insertRear(choice2);
                        break;
                    case 2:
                        System.out.println("Enter an Item: ");
                        choice2 = input.nextInt();
                        System.out.println("Enter The Price: ");
                        choice3= input.nextLine();
                        theDeQueue.insertRear(choice2);
                        theDeQueue.insertRear(choice3);// insert 4 items
                        break;
                    case 3:
                        theDeQueue.removeFront(); // remove 3 items

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
                        while( !theDeQueue.isEmpty() )    // remove and display
                        {                            //    all items
                            long n = theDeQueue.removeFront();
                            System.out.print(n);
                            System.out.print(" ");
                        }
                        System.out.println("");
                       // System.out.print(“ “);
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("You Didn't Enter any of the Options");
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




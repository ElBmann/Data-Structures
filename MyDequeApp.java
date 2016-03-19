
package dataStructures;


/**
 * Created by Brecuero on 3/19/2016.
 */
import java.util.Scanner;
public class MyDequeApp {

        public static void main(String[] args)//might have to remove static
        {

            Scanner input = new Scanner(System.in);  // Reading from System.in
            //MyDeque D1= new MyDeque();//........fixBug
            //System.out.println(D1.toString());
            MyDeque theDeQueue = new MyDeque(5); //........................................queue holds 5 items
            int choose=0;
            int choose2=0;

            while(choose!=8) {

               System.out.println("Please Enter: \n" + " 1: For insert Front \n 2: For insert rear \n 3: For remove Front \n 4: For Remove Rear  " +
                       "\n 5: For Peek Front \n 6: For Peek rear \n 7: For Display queue \n 8: For Quit  ");
               choose = input.nextInt();
           }

           switch(choose) {
               case 1:
                   System.out.println("Enter a number to insert: ");
                   choose2 = input.nextInt();
                   input.nextLine();
                   theDeQueue.insertFront(choose2); // insert 4 items
                   break;
               case 2:
                   System.out.println("Enter a number to insert: ");
                   choose2 = input.nextInt();
                   theDeQueue.insertRear(choose2); // insert 4 items
                   break;
               case 3:
                   theDeQueue.removeFront(); // remove 3 items

                   theDeQueue.removeFront(); // (10, 20, 30)

                   theDeQueue.removeFront();
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
                   //theDeQueue.MyDeque();//problem
                   break;
               case 8:
                   break;
               default:System.out.println("You Didn't Enter any of the Options");
           }

            while( !theDeQueue.isEmpty() ) // remove and display
            { // all items
                long n = theDeQueue.removeFront(); // (40, 50, 60, 70, 80)

                System.out.print(n);
                System.out.print(" ");
            }

            System.out.println("");

        }
    }

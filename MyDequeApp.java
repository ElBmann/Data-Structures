package dataStructures;

import dataStructures.MyDeque;

/**
 * Created by Brecuero on 3/19/2016.
 */
public class MyDequeApp {
        public void main(String[] args)
        {
            MyDeque theDeQueue = new MyDeque(5); //........................................queue holds 5 items

            theDeQueue.insertFront(10); // insert 4 items

            theDeQueue.insertFront(20);

            theDeQueue.insertFront(30);

            theDeQueue.insertFront(40);

            theDeQueue.removeFront(); // remove 3 items

            theDeQueue.removeFront(); // (10, 20, 30)

            theDeQueue.removeFront();

            theDeQueue.insertFront(50); // insert 4 more items

            theDeQueue.insertFront(60); // (wraps around)

            theDeQueue.insertFront(70);

            theDeQueue.insertFront(80);

            while( !theDeQueue.isEmpty() ) // remove and display
            { // all items
                long n = theDeQueue.removeFront(); // (40, 50, 60, 70, 80)

                System.out.print(n);
                System.out.print(" ");
            }

            System.out.println("");

        }
    }




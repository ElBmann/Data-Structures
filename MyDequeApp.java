/**
 * Created by Brecuero on 3/19/2016.
 */
public class MyDequeApp {
        public void main(String[] args)
        {
            MyDeque thedeQueue = new MyDeque(5); //........................................queue holds 5 items

            thedeQueue.insertFront(10); // insert 4 items

            thedeQueue.insertFront(20);

            thedeQueue.insertFront(30);

            thedeQueue.insertFront(40);

            thedeQueue.removeFront(); // remove 3 items

            thedeQueue.removeFront(); // (10, 20, 30)

            thedeQueue.removeFront();

            thedeQueue.insertFront(50); // insert 4 more items

            thedeQueue.insertFront(60); // (wraps around)

            thedeQueue.insertFront(70);

            thedeQueue.insertFront(80);

            while( !thedeQueue.isEmpty() ) // remove and display
            { // all items
                long n = thedeQueue.removeFront(); // (40, 50, 60, 70, 80)

                System.out.print(n);
                System.out.print(" ");
            }

            System.out.println("");

        }
    }




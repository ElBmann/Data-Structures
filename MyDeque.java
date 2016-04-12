
/**
 * Created by Brian Recuero on 3/19/2016.
 * My Deque Class is written In Java
 * This class has the Unique set up that allows a user to
 * insert front & rear also Remove front & rear
 * another feature is peek front and peek rear which allows the user
 * to see the front and or rear elements without touching them.
 */
package dataStructures;
public class MyDeque
{
    private int maxSize;//.....................................................................Initialize Variables
    private Item[] dequeArray;//...............................................................Initialize Variables
    private int front;//.......................................................................Initialize Variables
    private int rear;//........................................................................Initialize Variables
    private int nItems=0;//....................................................................Initialize Variables

    // true if queue is empty
    public boolean isEmpty()
    {

        return (nItems == 0);
    }
    // true if queue is full
    public boolean isFull()
    {
        return (nItems == maxSize);

    }
    public MyDeque(int s)
    {//.......................................................................................Constructor

        maxSize = s;//........................................................................Array is 1 cell larger
        dequeArray = new Item[maxSize];//.....................................................Than requested
        front = 0;
        rear = -1;
        nItems=0;
    }
    public void insertFront(Item f)//..........................................................Put item at front of queue
    {

        if(front == 0)//.................................................................Front of queue
        {
            front = maxSize;//.......................................................................Set front
        }
       // front++;//if omitted Causes Try Catch TO think item price is a string
        dequeArray[--front] = f;//.............................................................Increment front and insert
        nItems++;

    }

    public void insertRear(Item r)//............................................................Put item at rear of queue
    {

        if(rear == maxSize-1)//.................................................................Rear is set to rear of queue!
            rear = -1;//........................................................................Initialize the rear
        dequeArray[++rear] = r;//...............................................................Increment and insert
        nItems++;
    }

    public Item removeFront() //................................................................Take item from front of queue
    {

        Item temp=dequeArray[front++];//........................................................Get Value and increment
        if(front == maxSize)//..................................................................Deal w/Wrap Around
            front=0;//..........................................................................Setting the Front
        nItems--;//.............................................................................One Less Item
        return temp;

    }
    //take item from rear of queue
    public Item removeRear()
    {

        Item temp=dequeArray[rear--];//.........................................................Take item from rear of queue
        if(rear==maxSize)//.....................................................................Deal with wrap around
            rear=-1;
        nItems--;
        return temp;

    }
    //peek at Front
    public Item peekFront()
    {
       // if(front== maxSize)//...................................................................Deal with wrap around
         //   front=0;
        return dequeArray[front];

    }
    //peek at Rear
    public Item peekRear()
    {
       // if(rear== maxSize-1)//..................................................................Deal with wrap around
         //   rear=-1;
        return dequeArray[rear];
    }

    //Displays the data stored in the deque
    //in the sequence from ‘front’ to ‘rear’
    //it compares front to rear then
    //then depending if front is greater or
    // rear is greater it returns which ever if
    // statement proves correct
    @Override
    public String toString()
    {
        String frontRear = "";
        if(isEmpty())
            frontRear+="";
        else if(front < rear)
        {
            for (int i = front; i < rear ; i++)
                frontRear += dequeArray[i] + "\n";
        }
        else if(front > rear)
        {
            for (int i = front; i < maxSize; i++)
                frontRear += dequeArray[i] + "\n";

            for (int j = 0; j < rear + 1; j++)
                frontRear += dequeArray[j] + "\n";
        }
        else if(front == rear)
        {
            frontRear += dequeArray[front] + "\n";
        }

        return frontRear;
    }
}//End Deque Class


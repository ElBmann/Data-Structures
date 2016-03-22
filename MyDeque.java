package dataStructures;
/**
 * Created by Brecuero on 3/19/2016.
 */

public class MyDeque {
    private int maxSize;
    private Item[] dequeArray;
    private int front;
    private int rear;
    private int nItems=0;

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
    {//.......................................................................................constructor

        maxSize = s;//........................................................................array is 1 cell larger
        dequeArray = new Item[maxSize];//.....................................................than requested
        front = 0;
        rear = -1;
        nItems=0;
    }
    public void insertFront(String newSku, double newItemPrice)//.............................put item at front of queue
    {
        if (isFull())
          throw new RuntimeException("It is full");

        if(front == maxSize-1)//...................................Front of queue
            front = 0;//...........................................set front
        dequeArray[++front] = new Item(newSku, newItemPrice);//...............................increment front and insert
          nItems++;

    }

    public void insertRear(String newSku, double newItemPrice)//...............................put item at rear of queue
    {
        if (isFull())
            throw new RuntimeException("It is full");

        if(rear == maxSize-1)//...................................rear is set to rear of queue!
            rear = -1;//..........................................initialize the rear
           dequeArray[++rear] = new Item(newSku, newItemPrice);;//..............................increment and insert
           nItems++;
    }

    public Item removeFront() //................................................................take item from front of queue
    {
        if (isEmpty())
            throw new RuntimeException("It is empty");//......FixIT

        Item temp=dequeArray[front++];//........................................................Get Value and increment
        if(front == maxSize)//..................................................................deal w/Wrap Around
            front=0;//..........................................................................setting the Front
            nItems--;//.........................................................................One Less Item
        return temp;

    }
    //take item from rear of queue
    public Item removeRear()
    {
        if (isEmpty())
            throw new RuntimeException("It is empty");//..................Fix IT

        Item temp=dequeArray[rear++];//.........................................................take item from rear of queue
        if(rear==maxSize)//.....................................................................Deal with wrap around
            rear=-1;
        nItems--;
        return temp;

    }
    //peek at Front
    public Item peekFront()
    {
        if(front== maxSize)//...................................................................Deal with wrap around
            front=0;
        return dequeArray[front];

    }
    //peek at Rear
    public Item peekRear()
    {
        if(rear== maxSize-1)//..................................................................Deal with wrap around
            rear=-1;
        return dequeArray[rear];
    }

    //Displays the data stored in the deque
    //in the sequence from ‘front’ to ‘rear’
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
}

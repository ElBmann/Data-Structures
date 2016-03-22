package dataStructures;

/**
 * Created by Brecuero on 3/20/2016.
 */
public class myStack {
    private int maxSize;
    private Item[] stackArray;
    private int top;
    MyDeque deque;
    public myStack(int max) //...................................constructor
    {
        maxSize = max;
        stackArray = new Item[maxSize];
        top = -1;
    }
    public void push(String sku, double itemPrice) //......................put item on top of stack
    {

        stackArray[++top] = new Item(sku,itemPrice);
    }

    public Item pop() //..........................................take item from top of stack
    {

        return stackArray[top--];
    }

    public Item peek() //.........................................peek at top of stack
    {

        return stackArray[top];
   }

    public boolean isEmpty() //...................................true if stack is empty
    {
        return (top == -1);
    }
    public boolean isFull() //....................................true if stack is empty
    {
        return (top == maxSize-1);
    }

} // end class Stack

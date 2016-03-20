package dataStructures;

/**
 * Created by Brecuero on 3/20/2016.
 */
public class myStack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public myStack(int max) //...................................constructor
    {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }
    public void push(char j) //...................................put item on top of stack
    {
        theDeQueue.insertFront(choice2);
        stackArray[++top] = j;
    }

    public char pop() //..........................................take item from top of stack
    {

        return stackArray[top--];
    }

    public char peek() //.........................................peek at top of stack
    {
        return stackArray[top];
   }

    public boolean isEmpty() //...................................true if stack is empty
    {
        return (top == -1);
    }
    public boolean isFull() //....................................true if stack is empty
    {
        return (top == maxSize);
    }

} // end class StackX
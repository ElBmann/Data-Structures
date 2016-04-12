

/**
 * Brian Recuero Written in Java this calls to the
 * Main class so it can use its methods For the stack.
 * this stack is a FILO (first in last out) Principle.
 * It has a pop and a push and like the deque it has a
 * peek and both boolean expressions for if its empty or full.
 */
package dataStructures;
public class MyStack
{
    private int maxSize;
    private MyDeque stackArray;
    //private int top;
   //MyDeque deque;
    public MyStack(int max) //...................................constructor
    {
        maxSize = max;
        stackArray = new MyDeque(maxSize);

    }
    public void push(Item f) //......................put item on top of stack
    {


        stackArray.insertFront(f);
    }

    public Item pop() //..........................................take item from top of stack
    {

       return stackArray.removeFront();
    }

    public Item peek() //.........................................peek at top of stack
    {

        return stackArray.peekFront();
    }

    public boolean isEmpty() //...................................true if stack is empty
    {
        return stackArray.isEmpty();
    }
    public boolean isFull() //....................................true if stack is empty
    {
        return stackArray.isFull();
    }

    @Override
    public String toString()//..............................................To String
    {
        return stackArray.toString();
    }

} // End class Stack

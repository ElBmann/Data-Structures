

/**
 * Created by Brecuero on 3/31/2016.
 */
import java.*;
import java.util.*;
 class RecordList
{
    private Link first, last;//......................sentinel first and last

    public  RecordList()
    {
        first= null;
        last = null;
    }
public boolean isEmpty()//....................................function checks if function is empty
 {
    return first ==null;
}
public void insertFirst(int value)
{
   Link newLink = new Link(value);
    if(isEmpty()) {last = newLink;}
        else {first.prev= newLink;}
        newLink.next=first;
        first = newLink;
    }
    public void insertLast(int value)
    {
       Link newLink = new Link(value);
        if(isEmpty()) {first = newLink;}
        else{last.next=newLink; newLink.prev = last;}
        last = newLink;
}
}

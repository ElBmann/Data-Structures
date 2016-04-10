package HW3;
/**
 * Created by Brecuero on 3/31/2016.
 */

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
public void insertFirst(int value)//..insert first Link
{
   Link newLink = new Link(value);//.......create a new Link
    if(isEmpty()) {last = newLink;}//......new link to last
        else {first.prev= newLink;}//......old first now is the previous
        newLink.next=first;//.....The previous element is now stored in next
        first = newLink;//........the first is assigned to this newest element
    }
    public void insertLast(int value)
    {
       Link newLink = new Link(value);
        if(isEmpty()) {first = newLink;}
        else{last.next=newLink; newLink.prev = last;}
        last = newLink;
}
    public Link deleteFirst()
    {
        Link temp = first;//........
        if (first.next == null) {last = null;}
        else {first.next.prev = null;}
        first = first.next;
        return temp;
    }

    public Link deleteLast()
    {
      Link temp = last;
        if(first.next ==null){first = null;}
        else{last.prev.next=null;}
        last=last.prev;
        return temp;
    }

  /*
    public boolean insertAfter()
    {

    }
    @Override
    public String toString()
    {

    }*/
}

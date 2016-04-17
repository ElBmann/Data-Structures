package HW3;
/**
 * Created by Brecuero on 3/31/2016.
 * Data Structures Doubly Link List
 * Is where we Create all out methods
 * the behind the scenes for the app class
 */

public class RecordList {
    private Link first, last;//......................Sentinel first and last

    public RecordList() {
        first = null;
        last = null;
    }

    public boolean isEmpty()//....................................Function checks if function is empty
    {
        return first == null;
    }

    public void insertFirst(Link newLink)//....Insert first Link
    {
        newLink.next = getFirst();//..................The previous element is now stored in next
        first = newLink;//.....................The first is assigned to this newest element

    }

    public void insertLast(Link newLink) {

        newLink.prev = getLast();//..................The
        last = newLink;//.......................

    }

    public Link deleteFirst() {
        Link temp = first;//........
        if (first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
        }
        first = first.next;
        return temp;
    }

    public Link deleteLast() {
        Link temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.prev.next = null;
        }
        last = last.prev;
        return temp;
    }


    public void insertAfter(String id, Link newLink)//.....Key,Element new Node
    {
        Link current = first;//..................Starts at first link list
        while (current != null) {
            if (current.data.getId().compareTo(id) == 0)//....Make sure that id in data is id
            {
                newLink.next = current.next;
                newLink.prev = current;
                current.next.prev = newLink;
                current.next = newLink;
            } else current = current.next;
        }
    }


    /*   public void insertBefore(String id, Link newLink)
   {
       Link current = last;//.............Starts at last Link
       while(current!= null)
       {
           if (current.data.getId().compareTo(id) == 0)
           {
               newLink.next = current.next;
               newLink.prev = current;
               current.next.prev = newLink;
               current.next = newLink;
           } else current = current.prev;
       }

   }*/
    public Link deleteKey(String id) {//....Need a marker
        Link current = first;
        while (current.data.getId() != id) {
            current = current.next;
            if (current == null)
                return null;
        }
        if (current == first) {
            first = current.next;
        } else {
            current.prev.next = current.prev;
        }
        if (current == last) {
            last = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        return current;
    }

    public Link getFirst() {
        return first;
    }

    public Link getLast() {
        return last;
    }

    public void setLast(Link newLink) {
        last = newLink;
    }

    public void setFirst(Link newLink) {
        first = newLink;
    }
   /* public void insertionSort(Student files )
    {
        Link Current = getFirst().next;
        Link Current2 = getFirst().next;
          for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        }*/


    @Override
    public String toString() {
        Link Temp = getFirst();
        String studentInfo = "";
        while (Temp != null) {
            studentInfo += Temp.toString();
            Temp = Temp.next;

        }
        return studentInfo;
    }
}

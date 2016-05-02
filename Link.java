package HW3;
/**
 * Created by Brecuero on 4/1/2016.
 *Data Structures Doubly Link List
 * Link Is used to initialize prev,and next and the student Data
 */

public class Link
{
    public Link prev, next;//............sentinel before & after
    public Student data;//...............initialize Data student is data now

public Link()
    {
        data=new Student ("", "");//......Default

    }
    public Link(Student newData)
    {
        next = null;//..................set next to null
        prev = null;//..................set prev to null
        data = newData;

    }
    @Override
    public String toString()
    {

        return data.toString();
    }
}

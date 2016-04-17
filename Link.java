package HW3;
/**
 * Created by Brecuero on 4/1/2016.
 *Data Structures Doubly Link List
 * Link Is used to initalize prev,and next and the the student Data
 */

public class Link
{
    public Link prev, next;//..........sentinel before & after
    public Student data;//.................initialize Data student is data now


    public Link(Student files)
    {
        next = null;//..................set next to null
        prev = null;//..................set prev to null
        data = files;

    }
    @Override
    public String toString()
    {
       return data+"";
    }
}

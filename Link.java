package HW3;
/**
 * Created by Brecuero on 4/1/2016.
 *
        */
class Link
{
    public Link prev, next;//..........sentinel before & after
    public int data;//.................initialize Data

    public Link(int d)
    {
        next = null;//..................set next to null
        prev = null;//..................set prev to null
        data =0;
    }
}

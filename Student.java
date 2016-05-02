package HW3;
/**
 * Created by Brecuero on 3/31/2016.
 * Data Structures Doubly Link List
 * Student class is where we put in our default class
 * and our getters and setters
 */
public class Student
{
    private String id;
    private String name;

    public Student()
    {
        id="";
        name="";
    }
 public Student (String newId, String newName)
{
    id=newId;
    name= newName;

}
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
     public void setId(String newId)
     {
       id = newId;
     }
    public void setName(String newName)
    {
       name = newName;
    }
    @Override
    public String toString()
    {
        return "\n User Id#: "+id + " -User Name: " + name;

    }
}

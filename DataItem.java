/**
 * Created by Brian Recuero on 5/7/2016.
 */
package Hw4;
public class DataItem
{
    public String iData; // data item (key)

    public DataItem()//make default null
    {
        iData=null;
    }

//--------------------------------------------------------------

    public DataItem(String ii) // constructor

    { iData = ii; }

//--------------------------------------------------------------

    public String getKey()

    { return iData+""; }

//--------------------------------------------------------------

} // end class DataItem

package Structure;
/*Brian Recuero
 * Prof.Hai
 */
public class MyDeque {

	private int maxSize;
	private long[] dequeArray;
	private int front;
	private int rear;
	private int nItems;
	//private String itemNum;
	


	public MyDeque(int s) 
	{//..........................................................constructor

	maxSize = s+1; //............................................array is 1 cell larger
	dequeArray = new long[maxSize]; //...........................than requested
	front = 0;
	rear = -1;
	nItems=0;
	}
	public void insertFront(long f) //............................put item at front of queue
	{
	if(front == maxSize)//........................................Front of queue
	front = 0;//..................................................set front 
	dequeArray[++front] = f;//....................................increment front and insert
	}
	public void insertRear(long r) //.............................put item at rear of queue
	{
	if(rear == maxSize-1)//.......................................rear is set to rear of queue!

	rear = -1;//..................................................initialize the rear

	dequeArray[++rear] = r;//.....................................increment and insert 
	}

	public long removeFront() //..................................take item from front of queue
	{
		long temp=dequeArray[front++];//..........................Get Value and increment
		if(front == maxSize)//....................................deal w/Wrap Around 
			front=0;//............................................setting the Front
            nItems--;//...........................................One Less Item
            return temp;
           
	}
	//take item from rear of queue 
	public long removeRear()
	{
	long temp=dequeArray[rear++];//...............................take item from rear of queue
	if(rear==maxSize-1)//.........................................Deal with wrap around
		rear=-1;
	    nItems--;
	    return temp;
	
	}
	//peek at Front
	public long peekFront()
	{
		if(front== maxSize)//.....................................Deal with wrap around
			front=0;
		return dequeArray[front];
	
	}
	//peek at Rear
	public long peekRear()
	{
		if(rear== maxSize-1)//.....................................Deal with wrap around
			rear=-1;
		
		return dequeArray[rear];
	
	}
	// true if queue is empty
	public boolean isEmpty() 
	{
	return ( rear+1==front || (front+maxSize-1==rear) );
	}
	 // true if queue is full
	public boolean isFull()
	{
	return ( rear+2==front || (front+maxSize-2==rear) );

	}
	//Displays the data stored in the deque 
	//in the sequence from ‘front’ to ‘rear’
	public String toString() {
		return "Front: " + dequeArray[front] + "\nRear: " + dequeArray[rear];
	}
	
}
	
	


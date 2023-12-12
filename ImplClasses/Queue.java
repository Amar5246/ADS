package ImplClasses;

public class Queue<T> implements Interfaces.Queue<T>{
	private T[] arr; 
	private int size; 
	private int rear; 
	
	@SuppressWarnings("unchecked")
	public Queue(int n) {
		arr = (T[]) new Object[n]; 
		this.size=n; 
		this.rear=-1;
	}

	@Override
	public void enqueue(T a) {
		if(isFull())
		{
			throw new RuntimeException("queue is full");
		} 
		rear++; 
		arr[rear]=a;
	}

	@Override
	public T dqueue() {
		if(isEmpty())
		{
			throw new RuntimeException("queue is empty");
		} 
		T front=arr[0]; 
		for(int i=0;i<rear;i++)
		{
			arr[i]=arr[i+1];
		} 
		rear--;
		return front;
	}

	@Override
	public T peek() {
		if(isEmpty())
		{
			throw new RuntimeException("queue is empty");
		} 
		T front=arr[0]; 
		return front;
	}

	@Override
	public boolean isEmpty() {
		
		return rear==-1;
	}

	@Override
	public boolean isFull() {
		
		return rear==size-1;
	}

	@Override
	public String toString() { 
		String s=""; 
		for(int i=0;i<=rear;i++)
		{   
			s+=arr[i]+",";
		}
		return "["+s+"]";
	} 
	
}

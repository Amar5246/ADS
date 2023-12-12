package ImplClasses;

public class LinkQueue<T> implements Interfaces.Queue<T>{
	private Node<T> front; 
	private Node<T> rear;
	
	@SuppressWarnings("unchecked")
	public LinkQueue() {
		this.rear=null;
		this.front=null;
	}

	@Override
	public void enqueue(T a) {
		Node<T> newNode=new Node<>(a); 
		if(front==null)
		{
			front=newNode; 
			rear=newNode; 
		} 
		rear.next=newNode;  
		rear=newNode;
	}

	@Override
	public T dqueue() {
		if(isEmpty())
		{
			throw new RuntimeException("queue is empty");
		} 
		T data=front.ele;
		front=front.next;
		return data;
	}

	@Override
	public T peek() {
		if(isEmpty())
		{
			throw new RuntimeException("queue is empty");
		} 
		T data=front.ele;
		return data;
	}

	@Override
	public boolean isEmpty() {
		
		return rear==null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public String toString() { 
		String s="";  
		Node<T> f=front; 
		
		while(f!=null)
		{
			s+=f.ele+","; 
			f=f.next;
		}
		return "["+s+"]";
	}  
	
	private static class Node<T>
	{
		private Node<T> next; 
		private T ele; 
		
		public Node(T data ) {
			next=null; 
			this.ele=data;
		}
	}
	
}

package ImplClasses;

import Interfaces.Queue;

public class CircularQueue<T> implements Queue<T> {
	
	private T[] arr; 
	private int size; 
	private int rear;  
	private int front; 
	
	public CircularQueue(int n) {
		arr=(T[]) new Object[n]; 
		this.size=n;
		this.front=-1; 
		this.rear=-1;
	}
	
	@Override
	public void enqueue(T a) {
		// TODO Auto-generated method stub
		if(isFull())
		{
			throw new RuntimeException("queue is full");
		} 
		if(front==-1)
		{
			front++;
		} 
		rear=(rear+1)%size; 
		arr[rear]=a;
	}

	@Override
	public T dqueue() {
		if(isEmpty())
		{
			throw new RuntimeException("queue is Empty");
		} 
		T data=arr[front]; 
		front=(front+1)%size;
		return data;
	}

	@Override
	public T peek() {
		if(isEmpty())
		{
			throw new RuntimeException("queue is Empty");
		} 
		T data=arr[front]; 
		return data;
	}

	@Override
	public boolean isEmpty() {
		return front==rear;
	}

	@Override
	public boolean isFull() {
		return front==((rear+1)%size);
	}

}

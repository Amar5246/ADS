package Interfaces;

public interface Queue<T> {
	public void enqueue(T a); 
	public T dqueue(); 
	public T peek(); 
	public boolean isEmpty(); 
	public boolean isFull();
}

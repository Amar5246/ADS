package Interfaces;

import java.util.List;

public interface Linklist<T> {
	public void add(T a); 
	public void addAll(List<? extends T> list); 
	public T remove(int index);  
	public void reverse(); 
	public int find(T a); 
	public boolean isSorted(); 
	public void uadd(T a);
}

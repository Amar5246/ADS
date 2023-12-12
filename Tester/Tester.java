package Tester;



import ImplClasses.BinaryTree;
import ImplClasses.LinkQueue;
import ImplClasses.Queue;
import ImplClasses.SortedLinkList;
import Interfaces.Linklist;

public class Tester {

	public static void main(String[] args) {
//		Interfaces.Queue<Integer> que=new LinkQueue<>();
//		que.enqueue(10); 
//		que.enqueue(11);
//		que.enqueue(12);
//		que.enqueue(13); 
//		que.enqueue(14);  
//		System.out.println(que.dqueue());
//		System.out.println(que); 
		BinaryTree<Integer> btree=new BinaryTree<>();  		
		Integer a=10;
		btree.add(a);
		btree.add(5);
		btree.add(15);
		btree.add(3);
		btree.add(7);
		btree.add(17); 
		System.out.println(btree);
	}

}

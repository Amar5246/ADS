package ImplClasses;

public class BinaryTree<T extends Comparable<T>> { 
	
	private Node<T> root; 
	
	public BinaryTree() {
		this.root=null;
	}
	
	public void add(T data)
	{
		Node<T> newNode= new Node<>(data); 
		if(root==null)
		{
			root=newNode;
		} 
		else {
		add(root,newNode);
		}
	} 
	 private void add(Node<T> root,Node<T> newNode)
	 {
		 if(root.isLessthan(newNode.data))
		 {
			 if(root.right==null)
			 {
				 root.right=newNode;
			 } 
			 else {
				add(root.right,newNode);
			 }
		 } 
		 else {
			 if(root.left==null)
			 {
				 root.left=newNode;
			 } 
			 else {
				add(root.left,newNode);
			 }
		 }
	 }
	
	private static class Node<T extends Comparable<T>>
	{   
		T data;
		Node<T> left; 
		Node<T> right;
		
		 Node(T data) {
			this.data=data; 
			this.left=null; 
			this.right=null;
		} 
		boolean isLessthan(T a)
		{
			return data.compareTo(a)<0;
		}
	}
	String s="";
    private void print(Node<T> node) { 
        if (node == null) {
            return ;
        }
        print(node.left);
        s+=node.data+",";
        print(node.right);
    }
	@Override
	public String toString() { 
		print(root);
		return "["+s+"]";
	} 
	
	
	
}

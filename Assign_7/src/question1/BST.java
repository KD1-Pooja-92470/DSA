package question1;

public class BST {
	
	public  static class Node{
		
		private int data;
		private Node left,right;
		
		public Node(int data)
		{
			this.data=data;
			this.left=this.right=null;
		}
		
	    public int getData()
	    {
	    	return this.data;
	    }
	}
	
	private Node root;
	public BST()
	{
		this.root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public void addNode(Node root ,int val)
	{
		Node newNode = new Node(val);
		
		if(root==null)
		{
			System.out.println("Entered in root");
			this.root=newNode;
			return ;
		}
		else
		{
					if(root.data<val)
				{
					if(root.right==null)
					{
						root.right=newNode;
						return;
						
					}
					else addNode(root.right,val);
					
				}
				else
				{
					if(root.left==null)
					{
						root.left=newNode;
						return ;
						
					}
					else addNode(root.left,val);
				}
			
		}
	}
	
	public void addNode(int val)
	{
		addNode(root,val);
	}
	
	public void inorder(Node root)
	{
		
		if(root==null)return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public void inorder()
	{
		inorder(root);
		System.out.println();
	}
	
	public Node successor(Node root)
	{
		if(root==null)return null;
		
		Node succ = root.right;
		
		while(succ.left!=null)succ=succ.left;
		
		return succ;
	}
	
	public Node successor()
	{
		Node result = successor(this.root);
		return result;
	}
	

}




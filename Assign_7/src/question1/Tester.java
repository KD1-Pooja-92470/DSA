package question1;

import question1.BST.Node;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST tree = new BST();
		
		tree.addNode(8);
		tree.addNode(3);
		tree.addNode(10);
		tree.addNode(2);
		tree.addNode(6);
		tree.addNode(7);
		tree.addNode(4);
		tree.addNode(14);
		tree.addNode(15);
		tree.inorder();
	
       
	    Node result = tree.successor();
	    if(result==null)System.out.println("Null Tree");
	    else System.out.println("Successor  :" + result.getData());
        
	}

}

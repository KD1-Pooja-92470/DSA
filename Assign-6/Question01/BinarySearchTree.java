package Question01;

public class BinarySearchTree {
	static class Node {
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	private Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	private Node insert(Node root, int value) {
		if (root == null) {
			return new Node(value);
		}
		
		if (value < root.data) {
			root.left = insert(root.left, value);
		} else if (value > root.data) {
			root.right = insert(root.right, value);
		}
		return root;
	}
	
	public void insert(int value) {
		root = insert(root, value);
	}
	
	private Node search(Node root, int key) {
		if (root == null || root.data == key) {
			return root;
		}
		
		if (key < root.data) {
			return search(root.left, key);
		}
		return search(root.right, key);
	}
	
	public Node search(int key) {
		return search(root, key);
	}
	
	 static int findMin(Node root) {
	        while (root.left != null)
	            root = root.left;
	        return root.data;
    }
	
	private Node delete(Node root, int key) {
		if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);

        else if (key > root.data)
            root.right = delete(root.right, key);

        else {
            if (root.left == null && root.right == null)
                return null;

            else if (root.left == null)
                return root.right;

            else if (root.right == null)
                return root.left;

            int minValue = findMin(root.right);
            root.data = minValue;
            root.right = delete(root.right, minValue);
        }

        return root;
	}
	
	public Node delete(int key) {
		return delete(root, key);
	}
}

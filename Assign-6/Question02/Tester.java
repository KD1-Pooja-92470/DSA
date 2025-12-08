package Question02;

public class Tester {
	    static class Node {
	        int data;
	        Node left, right;

	        Node(int data) {
	            this.data = data;
	            left = right = null;
	        }
	    }

	    static Node root = null;

	    static void insert(int value) {
	        Node newNode = new Node(value);

	        if (root == null) {
	            root = newNode;
	            return;
	        }

	        Node trav = root;
	        while (true) {
	            if (value < trav.data) {
	                if (trav.left == null) {
	                    trav.left = newNode;
	                    break;
	                }
	                trav = trav.left;
	            } else if (value > trav.data) {
	                if (trav.right == null) {
	                    trav.right = newNode;
	                    break;
	                }
	                trav = trav.right;
	            } else {
	                break;
	            }
	        }
	    }

	    static int getLevel(int key) {
	        Node trav = root;
	        int level = 0;

	        while (trav != null) {
	            if (key == trav.data)
	                return level;

	            if (key < trav.data)
	                trav = trav.left;
	            else
	                trav = trav.right;

	            level++;
	        }

	        return -1;
	    }

	    public static void main(String[] args) {

	        insert(50);
	        insert(30);
	        insert(70);
	        insert(20);
	        insert(40);
	        insert(60);
	        insert(80);

	        System.out.println("Level of 50 : " + getLevel(50));
	        System.out.println("Level of 30 : " + getLevel(30));
	        System.out.println("Level of 40 : " + getLevel(40));
	        System.out.println("Level of 80 : " + getLevel(80));
	        System.out.println("Level of 100: " + getLevel(100));
	    }
}

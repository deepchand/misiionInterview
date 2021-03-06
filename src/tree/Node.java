package tree;

public class Node {

	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		right = left = null;
	}

	public static void printInOrder(Node root) {
		if (root == null)
			return;
		printInOrder(root.left);
		System.out.print(root.data + " ");
		printInOrder(root.right);
	}
	
	public static void printPreOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
}

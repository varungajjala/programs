import java.util.*;

public class bst{
	static Node root;

	public void addNode(int key, String name){
		Node newNode = new Node(key,name);

		if(root == null){
			root = newNode;
		}else{
			Node focusNode = root;
			Node parent;

			while(true){
				parent = focusNode;
				if(key<focusNode.key){
					focusNode = focusNode.leftChild;
					if(focusNode == null){
						parent.leftChild = newNode;
						return;
					}
				}else{
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public static void inOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);

			inOrderTraverseTree(focusNode.rightChild);
		}
	}
	public static void preOrderTraverseTree(Node focusNode){
		if(focusNode != null){

			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.leftChild);
			inOrderTraverseTree(focusNode.rightChild);

		}
	}
	public static void preOrderTraverseTree(Node focusNode){
		if(focusNode != null){

			inOrderTraverseTree(focusNode.leftChild);
			inOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);

		}
	}

	public static void levelOrderTraversal(Node focusNode){
		Queue q = new LinkedList();
		q.enqueue(focusNode);
		while(!q.empty()){

	}


	public static void main(String[] args){

		bst theTree = new bst();

		theTree.addNode(50,"boss");
		theTree.addNode(20,"Vice");
		theTree.addNode(10,"Varun");
		theTree.addNode(30,"Sec");
		theTree.addNode(45,"Sales");
		theTree.addNode(85,"Hello");

		inOrderTraverseTree(root);
	}
}

class Node{
	int key;
	String name;

	Node leftChild;
	Node rightChild;

	Node(int key, String name){
		this.key = key;
		this.name = name;
	}

	public String toString(){
		return name+"has a key" + key;

	}
}

import java.util.*;

public class subtree{
	public static class CNode{
		int value;
		CNode left;
		CNode right;
		CNode(int value){
			this.value = value;
			left = null;
			right = null;
		}
	}

	public static boolean isIdentical(CNode root1, CNode root2){
		if(root1 == null && root2 == null){
			return true;
		}

		if(root1 == null || root2 == null){
			return false;
		}

		return(root1.value == root2.value &&
				isIdentical(root1.left,root2.left) &&
				isIdentical(root1.right, root2.right));
	}

	public static boolean isSubtree(CNode root1, CNode root2){
		if( root1 == null){
			return false;
		}

		if(root2 == null){
			return true;
		}

		if(isIdentical(root1,root2)){
			return true;
		}

		return isSubtree(root1.left, root2) || isSubtree(root1.right, root2);
	}

	public static void main(String args[]){

		CNode head1 = new CNode(26);
		head1.left = new CNode(10);
		head1.right = new CNode(3);
		head1.left.left = new CNode(4);
		head1.left.right = new CNode(6);
		head1.right.right = new CNode(3);
		head1.left.left.right = new CNode(30);

		CNode head2 = new CNode(10);
		head2.left = new CNode(1);
		head2.right = new CNode(6);
		head2.left.right = new CNode(30);

		System.out.println(isSubtree(head1, head2));
	}
}

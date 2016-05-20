import java.util.*;

public class circlist{

	public static class CNode{
		int value;
		CNode next;
		CNode(int value){
			this.value = value;
			next = null;
		}
	}

	public static CNode insertIntoCircList(CNode head, CNode newNode){

		CNode current = head;
		if (head == null){
			newNode.next = newNode;
			head = newNode;
		}else if(newNode.value <= head.value){
			while(current.next != head && ((current.next.value > newNode.value && current.next.value >= current.value && current.value >= head.value) || current.next.value <= newNode.value)){
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
			head = newNode;

		}else{
			while(current.next != head && current.next.value < newNode.value && current.next.value >= current.value){
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
			head = newNode;
		}

		return head;
	}

	public static void printList(CNode head){
		CNode current = head;
		if (head != null){
			do{
				System.out.println(current.value);
				current = current.next;
			}while(current != head);
		}
		System.out.println("---------");
	}


	public static void main(String args[]){
		
		CNode t1 = new CNode(1);
		CNode t2 = new CNode(5);

		CNode t3 = new CNode(0);
		CNode t4 = new CNode(9);
		CNode t5 = new CNode(-1);
		CNode t6 = new CNode(-1);
		CNode t7 = new CNode(-1);
		CNode t8 = new CNode(-1);
		CNode t9 = new CNode(-2);
		CNode t10 = new CNode(15);
		CNode t11 = new CNode(2);
		CNode t12 = new CNode(100);
		CNode t13 = new CNode(99);
		CNode t14 = new CNode(-11);
		CNode t15 = new CNode(1);

		CNode head = insertIntoCircList(null,t1);
		head = insertIntoCircList(t1,t2);
		head = insertIntoCircList(t1,t3);
		head = insertIntoCircList(t2,t4);
		head = insertIntoCircList(t3,t5);
		head = insertIntoCircList(t3,t6);
		head = insertIntoCircList(t4,t7);
		head = insertIntoCircList(t5,t8);
		head = insertIntoCircList(t3,t9);
		head = insertIntoCircList(t1,t10);
		head = insertIntoCircList(t2,t11);
		head = insertIntoCircList(t6,t12);
		head = insertIntoCircList(t9,t13);
		head = insertIntoCircList(t4,t14);
		head = insertIntoCircList(t7,t15);

		printList(head);
		
	}
}

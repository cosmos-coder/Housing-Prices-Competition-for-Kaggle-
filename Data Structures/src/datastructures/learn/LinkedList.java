package datastructures.learn;

public class LinkedList
{
	static Node head;
	
	static class Node
	{
		int value;
		Node next;
		Node(int d)
		{
			value=d;
			next=null;
		}
	
      }

	public static void main(String[] args) {
		LinkedList obj=new LinkedList();
		LinkedList.head=new Node(1);
		Node sec=new Node(2);
		Node third=new Node(3);
		
		LinkedList.head.next=sec;
		sec.next=third;
		while(LinkedList.head!=null) {
			System.out.print(LinkedList.head.value +"-> ");
			LinkedList.head=LinkedList.head.next;
			
		}
		System.out.println("null");
		// TODO Auto-generated method stub

	}

}

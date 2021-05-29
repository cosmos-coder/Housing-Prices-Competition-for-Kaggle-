
package datastructures.learn;

public class Stack {
	int arr[];
	int top;
	int capacity;
	
	Stack(int size)
	{    arr=new int[size];
		capacity=size;
		top=-1;
	}
	public void push(int x)
	{  if (isFull()) 
	    {
		System.out.println("Stack is Full");
		System.exit(1);
	    }
	else
	   {  arr[++top]=x;
		
	   }
		
	}
	
	public int pop()
	{
		if (isEmpty()) 
		{  System.out.println("Stack is Empty");
			
		}
		return arr[top--];
	}
	
	public int size()
	{ 
		return top+1;
	}
	public Boolean isEmpty() {
		return top==-1;
	}
	public void printStack() 
	{
		for(int i=0;i<top;i++) 
		{
			System.out.println(arr[i]);
		}
	}
	
	public Boolean isFull() 
	{  return top==capacity-1;
		
	}
	

	public static void main(String[] args) {
		Stack st=new Stack(10);
		st.push(2);
		st.push(3);

		st.push(3);

		st.push(4);

		st.push(5);

		st.push(6);
		
		System.out.println(st.pop());

		System.out.println(st.isEmpty());
		st.printStack();

		
		
		// TODO Auto-generated method stub

	}

}

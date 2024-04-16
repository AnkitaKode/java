// Java code to illustrate peek() function 

import java.util.*; 

public class Peek { 
	public static void main(String args[]) 
	{ 
		// Creating an empty Stack 
		Stack<String> STACK = new Stack<String>(); 

		// Use push() to add elements into the Stack 
		STACK.push("Welcome"); 
		STACK.push("To"); 
		STACK.push("Geeks"); 
		STACK.push("For"); 
		STACK.push("Geeks"); 

		// Displaying the Stack 
		System.out.println("Initial Stack: " + STACK); 

		// Fetching the element at the head of the Stack 
		System.out.println("The element at the top of the"
						+ " stack is: " + STACK.peek()); 

		// Displaying the Stack after the Operation 
		System.out.println("Final Stack: " + STACK); 
	} 
} 

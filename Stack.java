package datastructure;

public class Stack {
	 private char[] word;
	    private int top;

	    // Constructor to initialize the stack
	    public Stack(int size) {
	        word = new char[size];
	        top = -1;
	    }

	    // Method to check if the stack is full
	    public boolean isFull() {
	        return top == word.length - 1;
	    }

	    // Method to check if the stack is empty
	    public boolean isEmpty() {
	        return top == -1;
	    }

	    // Method to push an element onto the stack
	    public void push(char item) {
	        if (!isFull()) {
	            word[++top] = item;
	        } else {
	            System.out.println("Stack Overflow!");
	        }
	    }

	    // Method to pop an element from the stack
	    public char pop() {
	        if (!isEmpty()) {
	            return word[top--];
	        } else {
	            System.out.println("Stack Underflow!");
	            return '\0'; // Return null character on underflow
	        }
	    }
	}



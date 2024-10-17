package datastructure;

import java.util.Scanner;

public class StackMain {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();
	        int length = input.length();

	        Stack stack = new Stack(length);

	        // Push all characters of the string onto the stack
	        for (int i = 0; i < length; i++) {
	            stack.push(input.charAt(i));
	        }

	        // Pop all characters from the stack to get the reversed string
	        StringBuilder reversed = new StringBuilder();
	        while (!stack.isEmpty()) {
	            reversed.append(stack.pop());
	        }

	        System.out.println("Reversed String: " + reversed.toString());
	    }
	
}


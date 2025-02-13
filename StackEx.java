package javacollection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> name = new Stack<String>();
		name.push("Ravi");
		name.push("Sachin");
		name.push("Rahul");
		name.push("Ajay");
		System.out.println(name);
		System.out.println(name.peek());
		name.pop();
		System.out.println(name);
		
	}

}

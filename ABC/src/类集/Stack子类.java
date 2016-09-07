package 类集;

import java.util.Stack;

public class Stack子类 {
	public static void main(String args[]) throws Exception{
		Stack<String> all = new Stack<String>();
		all.push("A");
		all.push("B");
		all.push("C");
		System.out.println(all.pop());
		System.out.println(all.pop());
		System.out.println(all.pop());
		System.out.println(all.pop());
	}

}

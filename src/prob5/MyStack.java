package prob5;

import java.util.Arrays;

public class MyStack {
	
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		buffer = new String[capacity];
		top = -1;
	}

	public void push(String s) {
		if (top == buffer.length - 1) {
			growableArray();
		}
		buffer[++top] = s;
	}

	public String pop() throws MyStackException {
		if (top == -1) {
			throw new MyStackException();
		}
		
		String result = buffer[top];
		buffer[top] = null;
		top--;
		
		return result;
	}

	public boolean isEmpty() {
		return top == -1;
	}
	
	public void growableArray() {
		String[] newArr = new String[buffer.length * 2];
		for (int i = 0; i < buffer.length; i++) {
			newArr[i] = buffer[i];
		}
		buffer = newArr;
	}
	
}
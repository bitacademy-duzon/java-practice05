package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	private int capacity;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {

		this.capacity = capacity;
		buffer = new String[capacity];
		top = -1;

	}

	public void push(String s) {
		top++;
		isOverflow();
		buffer[top] = s;

	}

	public String pop() throws MyStackException {

		
		if(isEmpty()) {
			
			throw new MyStackException();
		}
		
		String temp = buffer[top];
		buffer[top] = "";
		top--;

		return temp;

	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void expendArray() {
		
		String temp[] = new String[buffer.length + capacity];

		for (int i = 0; i < buffer.length; ++i) {
			temp[i] = buffer[i];
		}

		// link 참조 해제
		buffer = temp;

	}

	public boolean isOverflow() {

		if (top == buffer.length) {

			expendArray();
			return true;

		}

		return false;
	}
}

class MyStackException extends RuntimeException {

	public MyStackException() {
		super("stack is empty");
	}
	
	@Override
	public String toString() {
		return "stack is empty";
	}

	

}
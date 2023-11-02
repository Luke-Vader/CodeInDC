
public class LinkedStack<T> implements StackInterface<T> {

	Node top;
	int size;

	public LinkedStack() {
		this.top = null;
		this.size = 0;
	}

	@Override
	public void push(T data) {
		Node node = new Node(data);
		node.next = this.top;
		this.top = node;
		this.size++;
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			return null;
		}
		T data = this.top.data;
		this.top = this.top.next;
		size--;
		return data;
	}

	@Override
	public T peek() {
		if (isEmpty())
			return null;
		return this.top.data;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void clear() {
		this.top = null;
		this.size = 0;
	}

	private class Node {

		T data;
		Node next;

		Node(T data) {

			this.data = data;
			this.next = null;

		}

	}
	
	public static void main(String[] args) {
		LinkedStack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size);
        System.out.println("Top element: " + stack.size);

        stack.clear();

        System.out.println("Stack size after clear: " + stack.size);

	}

}

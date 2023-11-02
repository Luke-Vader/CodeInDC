import java.util.Arrays;

public class ArrayStack<T> implements StackInterface<T> {

	T[] stack;
	int topIndex;
	boolean integrity;
	static final int DEFAULT_CAPACITY = 50;
	static final int MAX_CAPACITY = 10000;

	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayStack(int initCap) {
		this.integrity = false;
		if (initCap <= MAX_CAPACITY) {
			T[] tempStack = (T[]) new Object[initCap];
			this.stack = tempStack;
			this.topIndex = -1;
		} else {
			// throw Exception
		}
		this.integrity = true;
	}

	public void checkIntegrity() {
		if (!this.integrity) {
			// throw Corrupt Stack Exception
		}
	}

	public void ensureCapacity() {
		if (topIndex == this.stack.length - 1) {
			int newCap = this.stack.length * 2;
			if (newCap > MAX_CAPACITY) {
				// throw Exception
			}
			this.stack = Arrays.copyOf(stack, newCap);
		}
	}

	public int size() {
		return this.topIndex + 1;
	}

	@Override
	public void push(T data) {
		checkIntegrity();
		ensureCapacity();
		stack[++topIndex] = data;

	}

	@Override
	public T pop() {
		checkIntegrity();
		if (!isEmpty()) {
			T top = this.stack[this.topIndex];
			this.stack[this.topIndex] = null;
			this.topIndex--;
			return top;
		} else
			return null;
	}

	@Override
	public T peek() {
		checkIntegrity();
		if (!isEmpty())
			return this.stack[this.topIndex];
		else
			return null;
	}

	@Override
	public boolean isEmpty() {
		return topIndex == -1;
	}

	@Override
	public void clear() {
		checkIntegrity();
		this.stack = (T[]) new Object[this.stack.length];
		this.topIndex = -1;
	}

	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack<Integer>();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("Stack size: " + stack.size());
		System.out.println("Top element: " + stack.peek());

		while (!stack.isEmpty()) {
			System.out.println("Popped: " + stack.pop());
			System.out.println("Peeking: " + stack.peek());
		}
		
		System.out.println("Stack Size: " + stack.size());
	}

}

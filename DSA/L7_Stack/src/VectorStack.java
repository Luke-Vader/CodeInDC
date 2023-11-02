import java.util.Vector;

public class VectorStack<T> implements StackInterface<T> {
	
	Vector<T> stack;
    boolean integrity;
    static final int DEFAULT_CAPACITY = 50;
    static final int MAX_CAPACITY = 10000;

    public VectorStack() {
        this(DEFAULT_CAPACITY);
    }

    public VectorStack(int initialCapacity) {
        integrity = true;
        stack = new Vector<>(initialCapacity);
    }
    
	@Override
	public void push(T data) {
		checkIntegrity();
		stack.add(data);
	}

	@Override
	public T pop() {
		checkIntegrity();
		if (!isEmpty()) {
			T top = this.stack.remove(this.stack.size() - 1);
			return top;
		} else return null;
	}

	@Override
	public T peek() {
		checkIntegrity();
		return (!isEmpty()) ? this.stack.get(this.stack.size() - 1) : null;
	}

	@Override
	public boolean isEmpty() {
		return this.stack.isEmpty();
	}

	@Override
	public void clear() {
		checkIntegrity();
		this.stack.clear();
	}
	
	private void checkIntegrity() {
        if (!this.integrity) {
        	//throw Corrupt Exception
        }
    }

	public int size(){
		return this.stack.size();
	}
	
	public static void main(String[] args) {
        VectorStack<Integer> stack = new VectorStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }	

}

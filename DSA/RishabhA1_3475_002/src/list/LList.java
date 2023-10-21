package list;

/**
 * This class implements the ListInterface and provides the implementation of
 * the methods declared in the interface
 * 
 * @param <T>
 */
public class LList<T> implements ListInterface<T> {

	private Node firstNode;
	private int size;

	public void init() {
		this.firstNode = null;
		this.size = 0;
	}

	public LList() {
		init();
	}

	@Override
	public void add(T newEntry) {
		Node node = new Node(newEntry);
		if (isEmpty()) {
			this.firstNode = node;
		} else {
			Node currentNode = firstNode;
			while (currentNode.hasNext()) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = node;
		}
		this.size++;
	}

	@Override
	public void add(int newPosition, T newEntry) {

		if (newPosition >= 1
				&& newPosition <= this.size + 1) {
			Node node = new Node(newEntry);
			if (newPosition == 1) {
				node.nextNode = this.firstNode;
				this.firstNode = node;
			} else {
				Node previousNode = getNodeAt(newPosition - 1);
				node.nextNode = previousNode.nextNode;
				previousNode.nextNode = node;
			}
			this.size++;
		} else {
			this.raiseException(1);
		}
	}

	public void remove(T element) {
		if (isEmpty()) {
			raiseException(2);
		} else {
			Node node = this.firstNode;
			for (int i = 1; i <= this.size; i++) {
				if (element == node.data) {
					remove(i);
					break;
				} else
					node = node.nextNode;
			}
		}
	}

	@Override
	public T remove(int givenPosition) {

		if (givenPosition > size) {
			this.raiseException(1);
			return null;
		} else if (isEmpty()) {
			this.raiseException(2);
			return null;
		} else if (givenPosition == 1) {
			Node node = this.firstNode;
			this.firstNode = this.firstNode.getNextNode();
			this.size--;
			return node.data;
		} else {
			Node node = getNodeAt(givenPosition);
			Node previousNode = getNodeAt(givenPosition - 1);

			if (givenPosition == size) {
				previousNode.setNextNode(new Node());
				this.size--;
				return node.data;
			} else if (givenPosition != size) {
				previousNode.setNextNode(
						node.getNextNode());
				this.size--;
				return node.data;
			} else
				return null;
		}
	}

	@Override
	public void clear() {
		init();
	}

	@Override
	public T replace(int givenPosition, T newEntry) {

		if (isEmpty()) {
			raiseException(2);
			return null;
		} else if (givenPosition > size) {
			raiseException(1);
			return null;
		} else {
			Node node = getNodeAt(givenPosition);
			node.data = newEntry;
			return node.data;
		}
	}

	@Override
	public T getEntry(int givenPosition) {
		return this.getNodeAt(givenPosition).data;
	}

	@Override
	public T[] toArray() {

		T[] array = (T[]) new Object[size];
		if (this.isEmpty()) {
			array[0] = firstNode.data;
			for (int i = 1; i <= size; i++) {
				Node node = firstNode;
				array[i - 1] = node.nextNode.data;
			}
			return array;
		} else {
			raiseException(2);
			return array;
		}
	}

	@Override
	public boolean contains(T anEntry) {
		if (isEmpty()) {
			raiseException(2);
			return false;
		} else {
			Node node = this.firstNode;
			for (int i = 1; i < this.size; i++) {
				if (anEntry == node.data) {
					return true;
				} else
					node = node.nextNode;
			}
			return false;
		}
	}

	@Override
	public int getLength() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		if (this.size == 0)
			return true;
		else
			return false;
	}

	private Node getNodeAt(int givenPosition) {
		if (!isEmpty()) {
			Node node = this.firstNode;
			for (int i = 1; i < givenPosition; i++)
				node = node.nextNode;
			return node;
		} else
			raiseException(2);
		return null;
	}

	private void raiseException(int exc) {
		switch (exc) {
			case 1 -> // position is greater than size
				throw new IndexOutOfBoundsException(
						"Illegal position provided. Size of current list: "
								+ this.size);
			case 2 -> // empty list
				throw new NullPointerException(
						"List is Empty.");
			default ->
				throw new IllegalArgumentException(
						"Unexpected value");
		}
	}

	/**
	 * inner Node class
	 */
	private class Node {

		/**
		 * data contains the information stored in the node
		 * nextNode is the reference to the node present in the next position
		 */
		private T data;
		private Node nextNode;

		/**
		 * default constructor
		 */
		public Node() {
		}

		/**
		 * constructor to set initial node
		 * 
		 * @param data
		 */
		private Node(T data) {
			this.data = data;
			this.nextNode = null;
		}

		/**
		 * constructor to create node and set next node as well
		 * 
		 * @param data
		 * @param nextNode
		 */
		private Node(T data, Node nextNode) {
			this.data = data;
			this.nextNode = nextNode;
		}

		/**
		 * returns the data store inside the Node
		 * 
		 * @return
		 */
		public T getData() {
			return this.data;
		}

		/**
		 * modifies the data inside the Node
		 * 
		 * @param data
		 */
		public void setData(T data) {
			this.data = data;
		}

		/**
		 * to fetch the next node in the list
		 * 
		 * @return
		 */
		public Node getNextNode() {
			return this.nextNode;
		}

		/**
		 * modifies the next node set to the current node
		 * 
		 * @param nextNode
		 */
		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public boolean hasNext() {
			if (this.nextNode != null)
				return true;
			else
				return false;
		}

	}

}

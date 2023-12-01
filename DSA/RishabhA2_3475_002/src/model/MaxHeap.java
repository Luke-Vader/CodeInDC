/**
 * Author: Rishabh Banerjee
 * Date: Nov 29 2023
 */
package model;

import java.util.Arrays;

public class MaxHeap<T extends Comparable<? super T>> implements HeapInterface<T> {

	private T[] heap; // Array to store heap elements
    private int last; // Index of the last element in the heap
    private boolean integrity = false; // Flag to check the integrity of the heap
    private static final int DEFAULT_CAPACITY = 25; // Default capacity of the heap
    private static final int MAX_CAPACITY = 1000; // Maximum capacity of the heap

	public MaxHeap() {
		this(DEFAULT_CAPACITY);
	}
	
	/**
     * Constructs an empty MaxHeap with the specified initial capacity.
     * 
     * @param initialCapacity the initial capacity of the heap
     * @throws IllegalStateException if the initial capacity exceeds the maximum capacity
     */
	@SuppressWarnings("unchecked")
	public MaxHeap(int initialCapacity) {

		// Ensure the provided capacity is within bounds
    	if (initialCapacity <= DEFAULT_CAPACITY) {
			initialCapacity = DEFAULT_CAPACITY;
		} else if (initialCapacity > MAX_CAPACITY) {				
			throw new IllegalStateException("Attempt to create a heap with a capacity exceeding the maximum.");
		}
    	
    	// Initialize the heap array and set the last index
    	heap = (T[]) new Comparable[initialCapacity];
    	last = 0;   
    	integrity = true;

	}
	
	/**
     * Adds a new entry to the max heap.
     * 
     * @param newEntry The entry to be added.
     */
	@Override
	public void add(T newEntry) {
		checkIntegrity();
		ensureCapacity();
		this.last++;
        heap[last] = newEntry;
        this.heapifyUp(last);
	}

	/**
     * Removes and returns the maximum entry (root) from the max heap.
     * 
     * @return The maximum entry in the max heap.
     */
	@Override
	public T removeMax() {
		checkIntegrity();
		
		if (this.isEmpty()) {
            throw new IllegalStateException("Cannot remove from an empty heap.");
        }
		
		T root = null;
		if (!this.isEmpty()) {
			root = heap[1];
			heap[1] = heap[last];
			heap[last] = null;
			last--;
			this.heapifyDown(1);
		}
		return root;
	}

	/**
     * Gets the maximum entry (root) from the max heap.
     * 
     * @return The maximum entry in the max heap.
     */
	@Override
	public T getMax() {
		checkIntegrity();
		return isEmpty() ? null : heap[1];
	}

	/**
     * Checks if the max heap is empty.
     * 
     * @return True if the heap is empty, false otherwise.
     */
	@Override
	public boolean isEmpty() {
		return last < 1;
	}

	/**
     * Gets the current size of the max heap.
     * 
     * @return The number of elements in the max heap.
     */
	@Override
	public int getSize() {
		return last;
	}

	/**
     * Clears all elements from the max heap.
     */
	@Override
	public void clear() {
		checkIntegrity();
		while (last > -1) {
			heap[last] = null;
			last--;
		}
		last = 0;
	}

	private void ensureCapacity() {
		// Doubles the capacity of the heap array if it is full
		if (last == heap.length - 1) {
			int newCapacity = heap.length * 2;
			if (newCapacity > MAX_CAPACITY)
				throw new IllegalStateException("Heap exceeds maximum capacity.");
			heap = Arrays.copyOf(heap, newCapacity);
		}
	}

	public void checkIntegrity() {
		// Checks if the integrity flag is set, throws an exception if not
		if (!integrity) {
			throw new SecurityException("Heap object is corrupt.");
		}
	}

	private void swap(int index1, int index2) {
		// Swaps elements at index1 and index2 in the heap
		T temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
	}

	/**
     * Displays the contents of the max heap.
     */
	public void display() {

		int ctr = 0;
		for (int i = 1; i <= last; ++i) {
			
			System.out.println("***\t***\t" + i + "\t***\t***");
			System.out.println(heap[i].toString());
			ctr++;
			if (ctr == last + 1) {
				return;
			}
		}
	}
	
	/**
	 * Restores the heap property by moving the element at the specified index up the heap until it's in the correct position.
	 * This method is used when a new element is added to the heap and needs to be moved up to maintain the max heap property.
	 * 
	 * @param index The index of the element to be moved up in the heap.
	 */
	private void heapifyUp(int index) {
        while (index > 1) {
            int parentIndex = index / 2;
            if (heap[index].compareTo(heap[parentIndex]) > 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }	
	
	/**
	 * Restores the heap property by moving the element at the specified index down the heap until it's in the correct position.
	 * This method is typically used when the root element is removed and the last element is moved to the root.
	 * The method ensures that the max heap property is maintained by moving the new root down to its proper position.
	 * 
	 * @param index The index of the element to be moved down in the heap.
	 */
	private void heapifyDown(int index) {
		int largerChild;
        while (index <= last / 2) { // Check for non-leaf nodes
            int leftChild = index * 2;
            int rightChild = leftChild + 1;

            largerChild = leftChild;
            if (rightChild <= last && heap[rightChild].compareTo(heap[leftChild]) > 0) {
                largerChild = rightChild;
            }

            if (heap[largerChild].compareTo(heap[index]) > 0) {
                swap(largerChild, index);
            } else {
                break;
            }

            index = largerChild;
        }
    }

}

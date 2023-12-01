/**
 * Author: Rishabh Banerjee
 * Date: Nov 29 2023
 */

package model;

/**
 * The {@code HeapInterface} represents the basic operations for a heap data structure.
 *
 * @param <T> The type of elements in the heap, must extend {@code Comparable}.
 */
public interface HeapInterface<T extends Comparable<? super T>> {

    /**
     * Adds a new entry to the heap.
     *
     * @param newEntry The entry to be added.
     */
    public void add(T newEntry);

    /**
     * Removes and returns the maximum entry from the heap.
     *
     * @return The maximum entry in the heap, or {@code null} if the heap is empty.
     */
    public T removeMax();

    /**
     * Gets the maximum entry from the heap without removing it.
     *
     * @return The maximum entry in the heap, or {@code null} if the heap is empty.
     */
    public T getMax();

    /**
     * Checks if the heap is empty.
     *
     * @return {@code true} if the heap is empty, {@code false} otherwise.
     */
    public boolean isEmpty();

    /**
     * Gets the current size of the heap.
     *
     * @return The number of elements in the heap.
     */
    public int getSize();

    /**
     * Clears all elements from the heap.
     */
    public void clear();
}

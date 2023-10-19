/**
 *  author: Rishabh Banerjee
 *  date: Oct 16 2023
 *  interface for a linked list 
 */

package list;

public interface ListInterface<T> {
	
	/** Adds a new entry to the end of the list. */
	public void add(T newEntry);
	
	/** Adds a new entry to the list at a given position. */
	public void add(int newPosition, T newEntry);
	
	/** Removes the entry at a given position from the list. */
	public T remove(int givenPosition);
	
	/** Removes all entries from the list. */
	public void clear();
	
	/** Replaces the entry at a given position in the list with a given entry. */
	public T replace(int givenPosition, T newEntry);
	
	/** Retrieves the entry at a given position in the list. */
	public T getEntry(int givenPosition);
	
	/** Retrieves all entries in the list in their current order. */
	public T[] toArray();
	
	/** Sees whether the list contains a given entry. */
	public boolean contains(T anEntry);
	
	/** Gets the number of entries in the list. */
	public int getLength();
	
	/** Sees whether the list is empty. */
	public boolean isEmpty();
}

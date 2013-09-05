package com.sm.dstructs;

/**
 * A Stack is LIFO - Last In First Out, ordered data structure that allows
 * operations from one end only. There are two main operations, push and pop.
 * 
 * @author smdeveloper
 * 
 * @param <T>
 */
public interface Stack<E> {

	/**
	 * Test to see if the stack is empty
	 * 
	 * @return true is size ==0, false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * Push the value on top of the Stack
	 * 
	 * @param value
	 */
	public void push(E value);

	/**
	 * Pop the value from the top of the stack.
	 * 
	 * @return popped off value
	 */
	public E pop();

	/**
	 * Looks at the object at the top of the stack without removing it.
	 * 
	 * @return
	 */
	public E peek();

	/**
	 * Does the stack contain the value.
	 * 
	 * @param value
	 * 
	 * @return true if found, false otherwise
	 */
	public boolean contains(E value);

	/**
	 * Returns the current size of the stack.
	 * 
	 * @return
	 */
	public int size();

}

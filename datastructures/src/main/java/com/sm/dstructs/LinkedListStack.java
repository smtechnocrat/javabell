/**
 * 
 */
package com.sm.dstructs;

import java.util.LinkedList;

/**
 * @author smdeveloper
 * 
 */
@SuppressWarnings("rawtypes")
public class LinkedListStack<E> implements Stack<E> {

	private LinkedList list = new LinkedList<E>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sm.dstructs.Stack#isEmpty()
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sm.dstructs.Stack#push(java.lang.Object)
	 */
	public void push(E value) {
		this.list.addFirst(value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sm.dstructs.Stack#pop()
	 */
	public E pop() {
		// TODO Auto-generated method stub
		return (E) this.list.removeFirst();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sm.dstructs.Stack#peek()
	 */
	public E peek() {
		// TODO Auto-generated method stub
		return (E) this.list.getFirst();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sm.dstructs.Stack#contains(java.lang.Object)
	 */
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sm.dstructs.Stack#size()
	 */
	public int size() {
		// TODO Auto-generated method stub
		return this.list.size();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

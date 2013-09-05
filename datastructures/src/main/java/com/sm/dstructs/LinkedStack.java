/**
 * 
 */
package com.sm.dstructs;

import java.util.NoSuchElementException;

/**
 * @author smdeveloper
 * 
 */
public class LinkedStack<E> implements Stack<E> {

	// Inner class
	private class Node<E> {
		E item;
		Node<E> next;

		private Node(E aItem, Node aNext) {
			this.item = aItem;
			this.next = aNext;
		}
	}

	// Points to the top of the stack
	private Node top = null;
	// size of the stack
	private int size = 0;

	public boolean isEmpty() {
		return this.size == 0;
	}

	/**
	 * Push an item to stack
	 */
	public void push(E item) {
		Node newNode;

		if (size == 0) {
			newNode = new Node<E>(item, null);
		} else {
			newNode = new Node<E>(item, top);
		}
		top = newNode;
		size++;
	}

	public E pop() {
		if (isEmpty())
			throw new IllegalStateException("Cannot pop from an empty stack");

		Node<E> currTop = top;
		top = currTop.next;
		this.size--;
		return currTop.item;
	}

	public E peek() {
		if (isEmpty())
			throw new NoSuchElementException("Cannot peek into an empty stack");

		return (E) this.top.item;
	}

	public boolean contains(E value) {
		return false;
	}

	public int size() {
		return this.size;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

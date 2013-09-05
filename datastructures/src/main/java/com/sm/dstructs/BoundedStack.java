package com.sm.dstructs;

public class BoundedStack<E> implements Stack<E> {

	// An inner class to hold the item.
	private class Node<E> {
		/** the item stored in the stack */
		private E item;
		/** where does it reside in the stack */
		private long index;
		/** When entered. ***/
		private long when;

		Node(E itm, int idx) {
			this.item = itm;
			this.index = idx;
			this.when = System.currentTimeMillis();
		}

	}

	// Maximum size of the size
	private int maxSize = 50;

	// A data structure for the inner representation of the stack.
	private Node<E>[] arrayStack;

	private int arrayIndex = 0;

	// The current top index of the stack.
	private int topIndex = 0;

	// current size of the stack. That means number of valid items in the stack
	private int stackSize = 0;

	// /////////////////////
	// CONSTRUCTOR
	// ////////////////////
	public BoundedStack() {
		this.arrayStack = new Node[maxSize];
	}

	public BoundedStack(int mSize) {
		this.maxSize = mSize;
		this.arrayStack = new Node[maxSize];
	}

	public void push(E value) {
		if (topIndex < maxSize) {
			Node<E> newItem = new Node<E>(value, arrayIndex);
			arrayStack[arrayIndex] = newItem;
			this.stackSize++;
			topIndex = arrayIndex;
			arrayIndex++;
		}

	}

	public E pop() {
		Node<E> topNode = arrayStack[topIndex];
		E item = topNode.item;
		arrayStack[topIndex] = null;
		if (arrayIndex > 0)
			arrayIndex--;
		if (topIndex > 0)
			topIndex--;
		if (stackSize > 0)
			stackSize--;
		return item;
	}

	public E peek() {
		return (E) arrayStack[topIndex].item;
	}

	public boolean contains(E value) {
		return false;
	}

	public int size() {
		return this.stackSize;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> st = new BoundedStack<Integer>();

		for (int i = 0; i < 50; i++) {
			st.push(new Integer(i));
			System.out.println(st.size());
		}

		for (int i = 0; i < 50; i++) {
			st.pop();
			System.out.println(st.size());
		}

		System.out.println(st.peek());

	}
}

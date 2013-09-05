package com.sm.dstructs;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for LinkedStack.
 */
public class LinkedStackTest extends StackTest {

	@Before
	public void makeLinkedStack() {
		s = new LinkedListStack<String>();
	}

}

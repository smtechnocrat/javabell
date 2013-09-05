package com.sm.dstructs;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for LinkedStack.
 */
public class LinkedListStackTest extends StackTest {

	@Before
	public void makeLinkedStack() {
		s = new LinkedStack<String>();
	}

}

/**
 * 
 */
package com.sm.dstructs;

import org.junit.Before;
import org.junit.Test;

/**
 * @author smdeveloper
 * 
 */
public class BoundedStackTest extends StackTest {

	private static int CAPACITY = 40;

	@Before
	public void makeBoundedStack() {
		s = new BoundedStack<String>(CAPACITY);
	}

	@Test(expected = IllegalStateException.class)
	public void testPushToFullStack() {
		for (int i = 0; i < CAPACITY; i++) {
			s.push("abc");
		}
		s.push("abc");
	}

}

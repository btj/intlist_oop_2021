package intlist_oop_2021.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import intlist_oop_2021.IntList;

class IntListTest {

	@Test
	void test() {
		IntList myIntList = new IntList(new int[] {10, 20, 30});
		assertArrayEquals(new int[] {10, 20, 30}, myIntList.getElements());
	}

}

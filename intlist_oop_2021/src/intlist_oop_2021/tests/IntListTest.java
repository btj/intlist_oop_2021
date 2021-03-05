package intlist_oop_2021.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import intlist_oop_2021.IntList;

class IntListTest {

	@Test
	void test() {
		IntList myIntList = new IntList(new int[] {10, 20, 30});
		assertArrayEquals(new int[] {10, 20, 30}, myIntList.getElements());
		
		myIntList.insertElement(0, 40);
		assertArrayEquals(new int[] {40, 10, 20, 30}, myIntList.getElements());
		
		myIntList.insertElement(4, 50);
		assertArrayEquals(new int[] {40, 10, 20, 30, 50}, myIntList.getElements());
		
		myIntList.setElement(3, 100);
		assertArrayEquals(new int[] {40, 10, 20, 100, 50}, myIntList.getElements());

		myIntList.setElement(0, 200);
		assertArrayEquals(new int[] {200, 10, 20, 100, 50}, myIntList.getElements());
		
		myIntList.removeElement(0);
		assertArrayEquals(new int[] {10, 20, 100, 50}, myIntList.getElements());
		
		myIntList.removeElement(2);
		assertArrayEquals(new int[] {10, 20, 50}, myIntList.getElements());
	}

}

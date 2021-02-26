package intlist_oop_2021;

import java.util.Arrays;

/**
 * Each instance of this class represents a sequence of int values.
 * 
 * @invar | getElements() != null
 * 
 * @immutable
 */
public class IntList {

	/**
	 * Returns an array containing the elements of this object.
	 * 
	 * @creates | result
	 */
	public int[] getElements() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * Initializes this object so that it represents the sequence of int values contained in the given array.
	 * 
	 * @pre | elements != null
	 * 
	 * @post | Arrays.equals(getElements(), elements)
	 */
	public IntList(int[] elements) {
		throw new RuntimeException("Not yet implemented");
	}

}

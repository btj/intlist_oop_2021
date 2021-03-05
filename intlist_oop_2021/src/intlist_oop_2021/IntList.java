package intlist_oop_2021;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Each instance of this class represents a sequence of int values.
 * 
 * @invar | getElements() != null
 */
public class IntList {
	
	/**
	 * @invar | elements != null
	 * @representationObject
	 */
	private int[] elements;
	
	/**
	 * Returns an array containing the elements of this object.
	 * 
	 * @creates | result
	 */
	public int[] getElements() {
		return elements.clone();
	}
	
	/**
	 * Initializes this object so that it represents the sequence of int values contained in the given array.
	 * 
	 * @pre | elements != null
	 * 
	 * @post | Arrays.equals(getElements(), elements)
	 */
	public IntList(int[] elements) {
		this.elements = elements.clone();
	}
	
	/**
	 * Inserts the given value at the given index in this object's sequence of values.
	 * 
	 * @mutates | this
	 * 
	 * @pre | 0 <= index && index <= getElements().length
	 * 
	 * @post | getElements().length == old(getElements()).length + 1
	 * @post | IntStream.range(0, index).allMatch(i -> getElements()[i] == old(getElements())[i])
	 * 
	 *     IntStream.range(a, b).allMatch(i -> P(i))
	 *     forall i. a <= i < b ==> P(i)
	 * 
	 * @post | getElements()[index] == value
	 * @post | IntStream.range(index, old(getElements()).length).allMatch(i -> getElements()[i + 1] == old(getElements())[i])
	 */
	public void insertElement(int index, int value) {
		int[] newElements = new int[elements.length + 1];
		System.arraycopy(elements, 0, newElements, 0, index);
		newElements[index] = value;
		System.arraycopy(elements, index, newElements, index + 1, elements.length - index);
		elements = newElements;
	}
	
	/**
	 * Sets the element at the given index to the given value.
	 * 
	 * @mutates | this
	 * 
	 * @pre | 0 <= index && index < getElements().length
	 * 
	 * @post | getElements().length == old(getElements()).length
	 * @post | IntStream.range(0, getElements().length).allMatch(i -> getElements()[i] == (i == index ? value : old(getElements())[i]))
	 */
	public void setElement(int index, int value) {
		elements[index] = value;
	}

	/**
	 * Removes the element at the given index from this object's sequence of values.
	 * 
	 * @mutates | this
	 * 
	 * @pre | 0 <= index && index < getElements().length
	 * 
	 * @post | getElements().length == old(getElements()).length - 1
	 * @post | IntStream.range(0, getElements().length).allMatch(i -> getElements()[i] == old(getElements())[i < index ? i : i + 1])
	 */
	public void removeElement(int index) {
		int[] newElements = new int[elements.length - 1];
		System.arraycopy(elements, 0, newElements, 0, index);
		System.arraycopy(elements, index + 1, newElements, index, newElements.length - index);
		elements = newElements;
	}

}

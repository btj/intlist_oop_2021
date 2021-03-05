package intlist_oop_2021;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Each instance of this class represents a sequence of int values.
 * 
 * @invar | getElements() != null
 */
public class IntList {
	
	private static class Node {
		private int value;
		/**
		 * @peerObject
		 */
		private Node next;
		
		private static boolean hasLength(Node node, int length) {
			if (length == 0)
				return node == null;
			else
				return length > 0 && node != null && hasLength(node.next, length - 1);
		}
	}
	
	/**
	 * @invar | Node.hasLength(head, length)
	 */
	private int length;
	/**
	 * @representationObject
	 */
	private Node head;

	/**
	 * Returns an array containing the elements of this object.
	 * 
	 * @creates | result
	 */
	public int[] getElements() {
		int[] result = new int[length];
		Node node = head;
		int i = 0;
		while (node != null) {
			result[i++] = node.value;
			node = node.next;
		}
		return result;
	}
	
	private static Node createNodes(int[] elements, int index) {
		if (index == elements.length)
			return null;
		else {
			Node head = new Node();
			head.value = elements[index];
			head.next = createNodes(elements, index + 1);
			return head;
		}
	}
	
	/**
	 * Initializes this object so that it represents the sequence of int values contained in the given array.
	 * 
	 * @pre | elements != null
	 * 
	 * @post | Arrays.equals(getElements(), elements)
	 */
	public IntList(int[] elements) {
		this.head = createNodes(elements, 0);
		this.length = elements.length;
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
		throw new RuntimeException("Not yet implemented");
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
		throw new RuntimeException("Not yet implemented");
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
		throw new RuntimeException("Not yet implemented");
	}

}

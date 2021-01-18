package edu.kis.vh.nursery.list;

/**
 * Linked list of Int
 */
public class IntLinkedList {
	/**
	 * Error value
	 */
	public static final int RETURN_VALUE = -1;
	/**
	 * Last value in the list
	 */
	private Node last;

	/**
	 *Add int value to Linked List
	 * @param i int value to add to the listed List
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}
	/**
	 * Check if Linked List is empty
	 * @return true or false if list is empty
	 */
	public boolean isEmpty() {
		return last == null;
	}
	/**
	 * Check if Linked List is full
	 * @return true or false if list is full
	 */
	public boolean isFull() {
		return false;
	}
	/**
	 * Return last value from linked list without removing it
	 * @return last int value from linked list
	 */
	public int top() {
		if (isEmpty())
			return RETURN_VALUE;
		return last.value;
	}
	/**
	 * Return last value from linked list and remove it
	 * @return last int value from linked list
	 */
	public int pop() {
		if (isEmpty())
			return RETURN_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}
	/**
	 * Node class that hold int value , prev pointer and next pointer
	 *
	 */
	private  class Node {
		public int value;
		public Node prev, next;
		public Node(int i) {
			value = i;
		}
	}

}

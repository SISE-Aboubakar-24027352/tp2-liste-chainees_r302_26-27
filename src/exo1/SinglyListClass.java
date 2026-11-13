package exo1;
//import java.util.*;

public class SinglyListClass {
	private Node header;
	
	public SinglyListClass() {
		header = null;
	}
	
	public Node getHeader() {
		return header;
	}

	public int size(){
		return size(header);
	}

	private int size(Node n) {
		if (n == null) {
			return 0;
		}
		return 1 + size(n.getNext());
	}
	
	
	public boolean isEmpty() {
		return header == null;
	}
	
	public Integer first() {
		if(isEmpty()) {
			return null;
		}else {
			return header.getElement();
		}
	}
	
	public Integer last() {
		if(isEmpty()) {
			return null;
		}

		Node current = header;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		return current.getElement();
	}

	public void addFirst(Integer element) {
		Node newNode = new Node(element);
		newNode.setNext(header);
		header = newNode;
	}
	
	public void addLast(Integer element) {
		Node newNode = new Node(element);
		if (header == null) {
			header = newNode;
			return;
		}
		
		Node tmpHeader = header;
		while(tmpHeader.getNext() != null) {
			tmpHeader = tmpHeader.getNext();
		}
		tmpHeader.setNext(newNode);
	}

	
	public Integer removeFirst() {
		if (isEmpty()) {
			return null;
		}

		Integer removed = header.getElement();
		header = header.getNext();
		return removed;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node current = header;

		while (current != null) {
			sb.append(current.getElement());

			if (current.getNext() != null) {
				sb.append(", ");
			}

			current = current.getNext();
		}

		sb.append("]");
		return sb.toString();
	}

	private static class Node {
		private Integer element;
		private Node next;
		
		public Node(Integer element) {
			this.element = element;
		}

		public Node(Integer element, Node next) {
			this.element = element;
			this.next = next;
		}
		
		public Integer getElement() { 
			return element;
		}
		
		public Node getNext() { 
			return next;
		}
		
		public void setElement(Integer newElem) { 
			element = newElem;
		}
		
		public void setNext(Node newNxt) { 
			next = newNxt; 
		}

		@Override
		public String toString() {
			return element + "";
		}
		
	}
}

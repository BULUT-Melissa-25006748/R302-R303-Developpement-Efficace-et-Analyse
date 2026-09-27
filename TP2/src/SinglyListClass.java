public class SinglyListClass {
	private Node header;
	public SinglyListClass(Node header) {
		this.header=header;
		}
	public Integer getHeader() {
		return header.element;
	}
	
	public boolean isEmpty( ) {
	if (header == null) {return true;}
	else {return false;}
}
	
	public void addLast(Integer element) {
		Node newNode = new Node(element);
		Node tmpHeader = header;
		if (header == null) {
			header = newNode;
			return;
			}
		while (tmpHeader.getNext() != null) {
			tmpHeader = tmpHeader.getNext();
		}
		//sur que tmpHeader pointe sur le dernier de la liste, et son suivant est null
			tmpHeader.setNext(newNode);
		}
	
	public void addFirst(Integer element) {
		Node newNode = new Node(element);
		newNode.setNext(header);
		header = newNode;
			
		}
	private static class Node {
		private Integer element;
		Node next;
		public Node getNext() {
			return next;
			}
		public void setNext(Node next) {
			this.next = next;
			}
		public Node(Integer element) {
			this.element=element;
			next = null;
		}
		public Integer getElement() {
			return element;
			}
		public void setElement(Integer element) {
			this.element=element;
			}
		public String toString() {
			return element.toString();
		}
	public static void main(String[] args) {
		SinglyListClass maListe = new SinglyListClass(null);
		maListe.addLast(4);
		
		System.out.print(maListe.getHeader());
		}
	}
}

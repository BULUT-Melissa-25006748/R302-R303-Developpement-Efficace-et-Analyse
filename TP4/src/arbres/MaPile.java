package arbres;

import java.util.EmptyStackException;

public class MaPile<T> {	    
	private static class Node<T> {        
		private T value;        
		private Node<T> next;
        
    public Node(T value, Node<T> next) {            
	    this.value = value;            
	    this.next = next;       
	    }    
	}
	 private Node<T> top = null;    
	 private int size = 0;
	    
	 public T empiler(T value) {        
		 top = new Node<>(value, top);        
		 size++;        
		 return value;    
	  }
	  
	  public T depiler() {        
		  if (isEmpty())         
		  {        	
			  throw new EmptyStackException();        
		  }        
		  T value = top.value;        
		  top = top.next;        
		  size--;        
		  return value;    
	  }
	  
	  public T first() {        
		  if (isEmpty())         
		  {        	
			  throw new EmptyStackException();        
		  }        
		  return top.value;    
	  }
	    
	  public boolean isEmpty() {        
		  return top == null;    
	  }
		
		public int size() {        
			return size;    
		}
	}
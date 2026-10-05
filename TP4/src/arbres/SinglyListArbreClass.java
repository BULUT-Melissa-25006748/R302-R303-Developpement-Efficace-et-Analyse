package arbres;

public class SinglyListArbreClass<T> {
		private T value;	
		private SinglyListArbreClass<T> left;	
		private SinglyListArbreClass<T> right;
		
		public SinglyListArbreClass() {				
			this.value = value;        
			this.left = null;        
			this.right = null;		
			}				
			
		public SinglyListArbreClass(T value, SinglyListArbreClass<T> left,SinglyListArbreClass<T> right) {		
			this.value = value;		
			this.left = left;		
			this.right = right;	
		}		
			
		public T getValue() {				
			return value;		
		}		
				
		public SinglyListArbreClass<T> getLeft() {				
			return left;		
		}		
			
		public SinglyListArbreClass<T> getRight() {				
			return right;		
		}		
		
		public void setLeft(SinglyListArbreClass<T> left) {				
			this.left = left;		
		}		
		
		public void setRight(SinglyListArbreClass<T> right) {				
			this.right = right;		
		}		
		
		public String parcoursPrefixe() {        
			StringBuilder sb = new StringBuilder();        
			sb.append(this.value).append(" ");        
			if (this.left != null) {            
				sb.append(this.left.parcoursPrefixe());        
			}        
			if (this.right != null) {            
				sb.append(this.right.parcoursPrefixe());        
			}        
			return sb.toString();    
		}		
		
		public String toString() {        
			return parcoursPrefixe();    
		}
		public SinglyListArbreClass(T value ) {
			this.value = value;
			this.left = null;
			this.right = null;
			}
		
		public static void main (String[] args) {		
			SinglyListArbreClass<String> deux = new SinglyListArbreClass<>("2");        
			SinglyListArbreClass<String> huit = new SinglyListArbreClass<>("8");        
			SinglyListArbreClass<String> vingt = new SinglyListArbreClass<>("20");        
			SinglyListArbreClass<String> cinq = new SinglyListArbreClass<>("5");
			
	    SinglyListArbreClass<String> Plus = new SinglyListArbreClass<>("+", cinq, deux);        
	    SinglyListArbreClass<String> Fois = new SinglyListArbreClass<>("*", Plus, huit);                
	    SinglyListArbreClass<String> dix = new SinglyListArbreClass<>("10", cinq, vingt);           
	    
	    System.out.println("Parcours préfixé : " + dix.parcoursPrefixe());        
	    System.out.println("Parcours préfixé de ((5 + 2) * 8) : " + Fois);	}
}

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
		
		public String parcoursPostfixe() {
		    StringBuilder sb = new StringBuilder();
		    if (this.left != null) {
		        sb.append(this.left.parcoursPostfixe());
		    }
		    if (this.right != null) {
		        sb.append(this.right.parcoursPostfixe());
		    }
		    sb.append(this.value).append(" ");
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
	    System.out.println("Parcours préfixé de ((5 + 2) * 8) : " + Fois);	
	    
	    SinglyListArbreClass<String> n2 = new SinglyListArbreClass<>("2");
        SinglyListArbreClass<String> n3 = new SinglyListArbreClass<>("3");
        SinglyListArbreClass<String> n5 = new SinglyListArbreClass<>("5");
        
        SinglyListArbreClass<String> plusGauche = new SinglyListArbreClass<>("+", n2, n3);
        SinglyListArbreClass<String> multGauche = new SinglyListArbreClass<>("*", plusGauche, n5);

        SinglyListArbreClass<String> n9 = new SinglyListArbreClass<>("9");
        SinglyListArbreClass<String> n1 = new SinglyListArbreClass<>("1");
        SinglyListArbreClass<String> n3_2 = new SinglyListArbreClass<>("3");
        SinglyListArbreClass<String> n4 = new SinglyListArbreClass<>("4");
        SinglyListArbreClass<String> n3_3 = new SinglyListArbreClass<>("3"); 
        
        SinglyListArbreClass<String> plusInterieur = new SinglyListArbreClass<>("+", n3_2, n4);
        SinglyListArbreClass<String> plusMilieu = new SinglyListArbreClass<>("+", n1, plusInterieur);
        SinglyListArbreClass<String> multDroite = new SinglyListArbreClass<>("*", plusMilieu, n3_3);
        SinglyListArbreClass<String> moinsDroite = new SinglyListArbreClass<>("-", n9, multDroite);

        SinglyListArbreClass<String> racinePrincipale = new SinglyListArbreClass<>("-", multGauche, moinsDroite);

        System.out.println("Expression : (2 + 3) * 5 - (9 - (1 + (3 + 4)) * 3)");
        System.out.println("Résultat du parcours postfixé :");
        System.out.println(racinePrincipale.parcoursPostfixe());
	    }
}

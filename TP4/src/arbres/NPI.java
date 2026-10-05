package arbres;

public class NPI {    
    public static int evaluer(String e) {        
        MaPile<Integer> pile = new MaPile<>();       
        int i = 0; 
        while (i < e.length()) {            
            char t = e.charAt(i);
            
            if (Character.isWhitespace(t)) {
                i++;
                continue;
            }
            if (Character.isDigit(t)) {                
                pile.empiler(Character.getNumericValue(t));            
            }             
            else if (t == '+' || t == '-' || t == '*') {                
                int y = pile.depiler();                 
                int x = pile.depiler();                       
                int r = 0;
                
                switch (t) {                    
                    case '+':                        
                        r = x + y;                        
                        break;                    
                    case '-':                        
                        r = x - y;                        
                        break;                    
                    case '*':                        
                        r = x * y;                        
                        break;                
                }
                pile.empiler(r);            
            }  
            i++; 
        }
        return pile.depiler();    
    }
 
    public static void main(String[] args) {        
        String expr1 = "2 3 + 5 * 9 1 3 4 + + 3 * - -";        
        System.out.println("Résultat de [" + expr1 + "] = " + evaluer(expr1));   
        String expr2 = "52+83-*";        
        System.out.println("Résultat de [" + expr2 + "] = " + evaluer(expr2));	    
    }
}
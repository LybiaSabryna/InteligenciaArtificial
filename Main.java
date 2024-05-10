import java.util.HashSet;
import java.util.Set;

public class Main {

    static class Symbol {
        String name;

        Symbol(String name) {
            this.name = name;
        }
    }

   
    static class Clause {
        Set<Symbol> positiveSymbols = new HashSet<>();
        Set<Symbol> negativeSymbols = new HashSet<>();

        Clause(Symbol... symbols) {
            for (Symbol symbol : symbols) {
                if (symbol.name.startsWith("~")) {
                    negativeSymbols.add(symbol);
                } else {
                    positiveSymbols.add(symbol);
                }
            }
        }
    }

    
    static boolean plResolution(Set<Clause> kb, Symbol query) {
        
        return false; 
    }

    public static void main(String[] args) {
        
        Symbol P = new Symbol("P");
        Symbol Q = new Symbol("Q");
        Symbol R = new Symbol("R");

    
        Set<Clause> clauses = new HashSet<>();
        clauses.add(new Clause(P, Q));
        clauses.add(new Clause(new Symbol("~P"), R));
        clauses.add(new Clause(new Symbol("~R"), Q));

        Symbol query = Q;
        if (plResolution(clauses, query)) {
            System.out.println("A consulta '" + query.name + "' é verdadeira.");
        } else {
            System.out.println("A consulta '" + query.name + "' é falsa.");
        }
    }
}

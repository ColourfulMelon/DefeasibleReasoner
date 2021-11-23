import org.tweetyproject.logics.pl.parser.PlParser;
import org.tweetyproject.logics.pl.reasoner.SatReasoner;
import org.tweetyproject.logics.pl.syntax.*;
import org.tweetyproject.logics.pl.syntax.PlBeliefSet;

import java.io.IOException;

public class propositionalSolver {
    //private static propositionalSolver parser;
    private static PlParser parser = new PlParser();
    private SatReasoner r;
    private PlBeliefSet beliefSet;

    propositionalSolver(){
        parser = new PlParser();
        r = new SatReasoner();
        beliefSet = new PlBeliefSet();
    }

    public PlBeliefSet getBeliefSet(){
        return beliefSet;
    }

    public boolean query(PlFormula query){
        return r.query(beliefSet, query);
    }

    public void addFormula(PlFormula formulaIn){
        beliefSet.add(formulaIn);
    }

    static PlFormula parseFormula(String formula) throws IOException {
        return (PlFormula) parser.parseFormula(formula);
    }

    public static void main(String[] args) throws IOException {
        PlParser parser = new PlParser();
        PlBeliefSet beliefSet = parser.parseBeliefBase("a || b || c \n !a || b \n !b || c \n !c || (!a && !b && !c && !d)");
        System.out.println(beliefSet);
    }
}

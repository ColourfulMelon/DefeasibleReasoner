import org.tweetyproject.logics.pl.parser.PlParser;
import org.tweetyproject.logics.pl.reasoner.SatReasoner;
import org.tweetyproject.logics.pl.syntax.PlBeliefSet;
import org.tweetyproject.logics.pl.syntax.PlFormula;

import java.io.IOException;

public class propositionalSolver {
    public static void main(String[] args) throws IOException {
        PlParser parser = new PlParser();
        SatReasoner r = new SatReasoner();
        PlBeliefSet set = new PlBeliefSet();
        set.add();
        PlFormula formula = (PlFormula) parser.parseFormula("p => q");
        formula.toString();

    }
}

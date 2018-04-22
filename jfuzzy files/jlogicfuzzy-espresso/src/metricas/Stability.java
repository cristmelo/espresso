




package metricas;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Rule;
import net.sourceforge.jFuzzyLogic.rule.Variable;
import net.sourceforge.jFuzzyLogic.FIS;

public class Stability {

	public static void main(String[] args) throws Exception {
		String filename = "Stability.fcl";
		FIS fis = FIS.load(filename, true);

		if (fis == null) {
			System.err.println("Can't load file: '" + filename + "'");
			System.exit(1);
		}
		
		// Get default function block
		FunctionBlock fb = fis.getFunctionBlock(null);

		JFuzzyChart.get().chart(fb);
		
		// Set inputs

		fb.setVariable("CogC", 2);
		fb.setVariable("RDEn", 1);
		fb.setVariable("RoV", 2);

		// Evaluate
		fb.evaluate();

		// Show output variable's chart
		fb.getVariable("STIFM").defuzzify();

		// Print ruleSet
		System.out.println(fb);
		System.out.println("Tip: " + fb.getVariable("STIFM").getValue());
		
		// Show each rule (and degree of support)
	    for( Rule r : fis.getFunctionBlock("tipper").getFuzzyRuleBlock("No1").getRules() )
	      System.out.println(r);
		
		Variable tip = fb.getVariable("STIFM");
		JFuzzyChart.get().chart(tip, tip.getDefuzzifier(), true);
		
		

	}

}


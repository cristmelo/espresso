




package metricas;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Rule;
import net.sourceforge.jFuzzyLogic.rule.Variable;
import net.sourceforge.jFuzzyLogic.FIS;

public class Dinamicity {

	public static void main(String[] args) throws Exception {
		String filename = "Dinamicity.fcl";
		FIS fis = FIS.load(filename, true);

		if (fis == null) {
			System.err.println("Can't load file: '" + filename + "'");
			System.exit(1);
		}
		
		// Get default function block
		FunctionBlock fb = fis.getFunctionBlock(null);

		JFuzzyChart.get().chart(fb);
		
		// Set inputs

		fb.setVariable("CF", 3);
		fb.setVariable("CFC", 4);
		fb.setVariable("AFCA", 5);
		fb.setVariable("DFCA", 4);

		
		fb.setVariable("CF", 24);
		fb.setVariable("CFC", 0);
		fb.setVariable("AFCA", 27);
		fb.setVariable("DFCA", 5);
		

		fb.setVariable("CF", 11);
		fb.setVariable("CFC", 6);
		fb.setVariable("AFCA", 16);
		fb.setVariable("DFCA", 17);
		
		// Evaluate
		fb.evaluate();

		// Show output variable's chart
		fb.getVariable("DIFM").defuzzify();

		// Print ruleSet
		System.out.println(fb);
		System.out.println("Tip: " + fb.getVariable("DIFM").getValue());
		
		// Show each rule (and degree of support)
	    for( Rule r : fis.getFunctionBlock("tipper").getFuzzyRuleBlock("No1").getRules() )
	      System.out.println(r);
		
		Variable tip = fb.getVariable("DIFM");
		JFuzzyChart.get().chart(tip, tip.getDefuzzifier(), true);
		
		

	}

}


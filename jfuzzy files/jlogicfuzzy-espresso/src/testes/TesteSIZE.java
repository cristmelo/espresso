package testes;

import net.sourceforge.jFuzzyLogic.FIS;

public class TesteSIZE {

	public static void main(String[] args) {
	    FIS fb = FIS.load("Size.fcl", true);


	    fb.setVariable("DTMax",	4	);	fb.setVariable("NLeaf", 	9	);	fb.setVariable("NF", 	14	);	fb.evaluate();	System.out.println("	Smart-phone	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	2	);	fb.setVariable("NLeaf", 	6	);	fb.setVariable("NF", 	9	);	fb.evaluate();	System.out.println("	WSN	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	4	);	fb.setVariable("NLeaf", 	7	);	fb.setVariable("NF", 	13	);	fb.evaluate();	System.out.println("	Movie System	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	5	);	fb.setVariable("NLeaf", 	19	);	fb.setVariable("NF", 	27	);	fb.evaluate();	System.out.println("	WindFarm	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	6	);	fb.setVariable("NLeaf", 	21	);	fb.setVariable("NF", 	36	);	fb.evaluate();	System.out.println("	Online-book-shopping	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	3	);	fb.setVariable("NLeaf", 	14	);	fb.setVariable("NF", 	20	);	fb.evaluate();	System.out.println("	Dynamic Software Product Lines for Service-Based Systems	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	3	);	fb.setVariable("NLeaf", 	24	);	fb.setVariable("NF", 	33	);	fb.evaluate();	System.out.println("	ADS	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	6	);	fb.setVariable("NLeaf", 	15	);	fb.setVariable("NF", 	22	);	fb.evaluate();	System.out.println("	Smart Home	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	6	);	fb.setVariable("NLeaf", 	12	);	fb.setVariable("NF", 	20	);	fb.evaluate();	System.out.println("	ConferenceContext	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	5	);	fb.setVariable("NLeaf", 	9	);	fb.setVariable("NF", 	15	);	fb.evaluate();	System.out.println("	robot experiment	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	4	);	fb.setVariable("NLeaf", 	33	);	fb.setVariable("NF", 	44	);	fb.evaluate();	System.out.println("	Wireless sensor actuator network	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	6	);	fb.setVariable("NLeaf", 	7	);	fb.setVariable("NF", 	14	);	fb.evaluate();	System.out.println("	MobiHome	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	4	);	fb.setVariable("NLeaf", 	9	);	fb.setVariable("NF", 	14	);	fb.evaluate();	System.out.println("	Scenario Application	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	5	);	fb.setVariable("NLeaf", 	15	);	fb.setVariable("NF", 	22	);	fb.evaluate();	System.out.println("	17-mobile Game	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	4	);	fb.setVariable("NLeaf", 	9	);	fb.setVariable("NF", 	13	);	fb.evaluate();	System.out.println("	SmartHotel	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	6	);	fb.setVariable("NLeaf", 	17	);	fb.setVariable("NF", 	27	);	fb.evaluate();	System.out.println("	VsSystem	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	4	);	fb.setVariable("NLeaf", 	5	);	fb.setVariable("NF", 	9	);	fb.evaluate();	System.out.println("	Aircraft	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	7	);	fb.setVariable("NLeaf", 	37	);	fb.setVariable("NF", 	47	);	fb.evaluate();	System.out.println("	Heidelberg Ion-Beam Therapy Center	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	5	);	fb.setVariable("NLeaf", 	10	);	fb.setVariable("NF", 	17	);	fb.evaluate();	System.out.println("	PPU	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	4	);	fb.setVariable("NLeaf", 	11	);	fb.setVariable("NF", 	16	);	fb.evaluate();	System.out.println("	Navigation Protocol	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	5	);	fb.setVariable("NLeaf", 	19	);	fb.setVariable("NF", 	29	);	fb.evaluate();	System.out.println("	Bikesharing	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	5	);	fb.setVariable("NLeaf", 	10	);	fb.setVariable("NF", 	16	);	fb.evaluate();	System.out.println("	CarSensors	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	5	);	fb.setVariable("NLeaf", 	8	);	fb.setVariable("NF", 	12	);	fb.evaluate();	System.out.println("	Congress Assistant	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	7	);	fb.setVariable("NLeaf", 	27	);	fb.setVariable("NF", 	43	);	fb.evaluate();	System.out.println("	DSPLFamily	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	5	);	fb.setVariable("NLeaf", 	11	);	fb.setVariable("NF", 	19	);	fb.evaluate();	System.out.println("	Nexus DSPL	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	7	);	fb.setVariable("NLeaf", 	22	);	fb.setVariable("NF", 	33	);	fb.evaluate();	System.out.println("	SalesScenario	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	3	);	fb.setVariable("NLeaf", 	7	);	fb.setVariable("NF", 	10	);	fb.evaluate();	System.out.println("	Mobile Tourist Planner	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	4	);	fb.setVariable("NLeaf", 	27	);	fb.setVariable("NF", 	41	);	fb.evaluate();	System.out.println("	Linux	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	4	);	fb.setVariable("NLeaf", 	9	);	fb.setVariable("NF", 	14	);	fb.evaluate();	System.out.println("	Content Store	 - " + fb.getVariable("SIFM").getValue());
	    fb.setVariable("DTMax",	3	);	fb.setVariable("NLeaf", 	13	);	fb.setVariable("NF", 	18	);	fb.evaluate();	System.out.println("	Visual Data Graph	 - " + fb.getVariable("SIFM").getValue());

	}

}


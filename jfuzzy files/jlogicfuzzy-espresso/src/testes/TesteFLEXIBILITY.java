package testes;

import net.sourceforge.jFuzzyLogic.FIS;

public class TesteFLEXIBILITY {

	public static void main(String[] args) {
	    FIS fb = FIS.load("Flexibility.fcl", true);

	    fb.setVariable("NM",	7	);	fb.setVariable("FoC", 	0.14	);	fb.setVariable("NF", 	14	);	fb.evaluate();	System.out.println("	Smart-phone	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	6	);	fb.setVariable("FoC", 	0.22	);	fb.setVariable("NF", 	9	);	fb.evaluate();	System.out.println("	WSN	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	4	);	fb.setVariable("FoC", 	0.15	);	fb.setVariable("NF", 	13	);	fb.evaluate();	System.out.println("	Movie System	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	15	);	fb.setVariable("FoC", 	0.04	);	fb.setVariable("NF", 	27	);	fb.evaluate();	System.out.println("	WindFarm	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	21	);	fb.setVariable("FoC", 	0.06	);	fb.setVariable("NF", 	36	);	fb.evaluate();	System.out.println("	Online-book-shopping	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	5	);	fb.setVariable("FoC", 	0.35	);	fb.setVariable("NF", 	20	);	fb.evaluate();	System.out.println("	Dynamic Software Product Lines for Service-Based Systems	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	15	);	fb.setVariable("FoC", 	0.52	);	fb.setVariable("NF", 	33	);	fb.evaluate();	System.out.println("	ADS	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	3	);	fb.setVariable("FoC", 	0.23	);	fb.setVariable("NF", 	22	);	fb.evaluate();	System.out.println("	Smart Home	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	0	);	fb.setVariable("FoC", 	0.2	);	fb.setVariable("NF", 	20	);	fb.evaluate();	System.out.println("	ConferenceContext	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	8	);	fb.setVariable("FoC", 	0.27	);	fb.setVariable("NF", 	15	);	fb.evaluate();	System.out.println("	robot experiment	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	3	);	fb.setVariable("FoC", 	0.64	);	fb.setVariable("NF", 	44	);	fb.evaluate();	System.out.println("	Wireless sensor actuator network	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	4	);	fb.setVariable("FoC", 	0.21	);	fb.setVariable("NF", 	14	);	fb.evaluate();	System.out.println("	MobiHome	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	4	);	fb.setVariable("FoC", 	0.07	);	fb.setVariable("NF", 	14	);	fb.evaluate();	System.out.println("	Scenario Application	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	2	);	fb.setVariable("FoC", 	0.23	);	fb.setVariable("NF", 	22	);	fb.evaluate();	System.out.println("	17-mobile Game	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	1	);	fb.setVariable("FoC", 	0.46	);	fb.setVariable("NF", 	13	);	fb.evaluate();	System.out.println("	SmartHotel	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	7	);	fb.setVariable("FoC", 	0.07	);	fb.setVariable("NF", 	27	);	fb.evaluate();	System.out.println("	VsSystem	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	2	);	fb.setVariable("FoC", 	0.44	);	fb.setVariable("NF", 	9	);	fb.evaluate();	System.out.println("	Aircraft	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	14	);	fb.setVariable("FoC", 	0.21	);	fb.setVariable("NF", 	47	);	fb.evaluate();	System.out.println("	Heidelberg Ion-Beam Therapy Center	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	3	);	fb.setVariable("FoC", 	0.06	);	fb.setVariable("NF", 	17	);	fb.evaluate();	System.out.println("	PPU	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	7	);	fb.setVariable("FoC", 	0.06	);	fb.setVariable("NF", 	16	);	fb.evaluate();	System.out.println("	Navigation Protocol	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	5	);	fb.setVariable("FoC", 	0.34	);	fb.setVariable("NF", 	29	);	fb.evaluate();	System.out.println("	Bikesharing	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	4	);	fb.setVariable("FoC", 	0.19	);	fb.setVariable("NF", 	16	);	fb.evaluate();	System.out.println("	CarSensors	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	2	);	fb.setVariable("FoC", 	0.17	);	fb.setVariable("NF", 	12	);	fb.evaluate();	System.out.println("	Congress Assistant	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	15	);	fb.setVariable("FoC", 	0.09	);	fb.setVariable("NF", 	43	);	fb.evaluate();	System.out.println("	DSPLFamily	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	3	);	fb.setVariable("FoC", 	0.11	);	fb.setVariable("NF", 	19	);	fb.evaluate();	System.out.println("	Nexus DSPL	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	4	);	fb.setVariable("FoC", 	0.3	);	fb.setVariable("NF", 	33	);	fb.evaluate();	System.out.println("	SalesScenario	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	3	);	fb.setVariable("FoC", 	0.1	);	fb.setVariable("NF", 	10	);	fb.evaluate();	System.out.println("	Mobile Tourist Planner	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	6	);	fb.setVariable("FoC", 	0.61	);	fb.setVariable("NF", 	41	);	fb.evaluate();	System.out.println("	Linux	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	4	);	fb.setVariable("FoC", 	0.07	);	fb.setVariable("NF", 	14	);	fb.evaluate();	System.out.println("	Content Store	 - " + fb.getVariable("FIFM").getValue());
	    fb.setVariable("NM",	4	);	fb.setVariable("FoC", 	0.22	);	fb.setVariable("NF", 	18	);	fb.evaluate();	System.out.println("	Visual Data Graph	 - " + fb.getVariable("FIFM").getValue());

	    
	}

}


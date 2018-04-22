package testes;

import net.sourceforge.jFuzzyLogic.FIS;

public class TesteDINAMICITY {

	public static void main(String[] args) {
	    FIS fb = FIS.load("Dinamicity.fcl", true);

	    fb.setVariable("CF",	3	);	fb.setVariable("CFC", 	4	);	fb.setVariable("AFCA", 	5	);	fb.setVariable("DFCA", 	4	);	fb.evaluate();	System.out.println("	Smart-phone	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	6	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	6	);	fb.setVariable("DFCA", 	2	);	fb.evaluate();	System.out.println("	WSN	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	6	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	7	);	fb.setVariable("DFCA", 	5	);	fb.evaluate();	System.out.println("	Movie System	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	17	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	19.5	);	fb.setVariable("DFCA", 	6.5	);	fb.evaluate();	System.out.println("	WindFarm	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	24	);	fb.setVariable("CFC", 	4	);	fb.setVariable("AFCA", 	25	);	fb.setVariable("DFCA", 	9	);	fb.evaluate();	System.out.println("	Online-book-shopping	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	14	);	fb.setVariable("CFC", 	10	);	fb.setVariable("AFCA", 	15	);	fb.setVariable("DFCA", 	2	);	fb.evaluate();	System.out.println("	Dynamic Software Product Lines for Service-Based Systems	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	24	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	27	);	fb.setVariable("DFCA", 	5	);	fb.evaluate();	System.out.println("	ADS	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	7	);	fb.setVariable("CFC", 	4	);	fb.setVariable("AFCA", 	10.5	);	fb.setVariable("DFCA", 	10.5	);	fb.evaluate();	System.out.println("	Smart Home	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	9	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	11	);	fb.setVariable("DFCA", 	8	);	fb.evaluate();	System.out.println("	ConferenceContext	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	9	);	fb.setVariable("CFC", 	5	);	fb.setVariable("AFCA", 	12	);	fb.setVariable("DFCA", 	2	);	fb.evaluate();	System.out.println("	robot experiment	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	8	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	18	);	fb.setVariable("DFCA", 	16	);	fb.evaluate();	System.out.println("	Wireless sensor actuator network	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	5	);	fb.setVariable("CFC", 	2	);	fb.setVariable("AFCA", 	8	);	fb.setVariable("DFCA", 	5	);	fb.evaluate();	System.out.println("	MobiHome	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	5	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	7.5	);	fb.setVariable("DFCA", 	5.5	);	fb.evaluate();	System.out.println("	Scenario Application	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	11	);	fb.setVariable("CFC", 	6	);	fb.setVariable("AFCA", 	12.5	);	fb.setVariable("DFCA", 	8.5	);	fb.evaluate();	System.out.println("	17-mobile Game	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	6	);	fb.setVariable("CFC", 	2	);	fb.setVariable("AFCA", 	7.666666667	);	fb.setVariable("DFCA", 	2.666666667	);	fb.evaluate();	System.out.println("	SmartHotel	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	12	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	14.5	);	fb.setVariable("DFCA", 	11.5	);	fb.evaluate();	System.out.println("	VsSystem	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	1	);	fb.setVariable("CFC", 	4	);	fb.setVariable("AFCA", 	4	);	fb.setVariable("DFCA", 	4	);	fb.evaluate();	System.out.println("	Aircraft	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	11	);	fb.setVariable("CFC", 	6	);	fb.setVariable("AFCA", 	16	);	fb.setVariable("DFCA", 	17	);	fb.evaluate();	System.out.println("	Heidelberg Ion-Beam Therapy Center	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	7	);	fb.setVariable("CFC", 	4	);	fb.setVariable("AFCA", 	9	);	fb.setVariable("DFCA", 	7	);	fb.evaluate();	System.out.println("	PPU	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	7	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	8.5	);	fb.setVariable("DFCA", 	6.5	);	fb.evaluate();	System.out.println("	Navigation Protocol	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	15	);	fb.setVariable("CFC", 	5	);	fb.setVariable("AFCA", 	17	);	fb.setVariable("DFCA", 	11	);	fb.evaluate();	System.out.println("	Bikesharing	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	6	);	fb.setVariable("CFC", 	6	);	fb.setVariable("AFCA", 	9	);	fb.setVariable("DFCA", 	6	);	fb.evaluate();	System.out.println("	CarSensors	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	3	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	6	);	fb.setVariable("DFCA", 	5	);	fb.evaluate();	System.out.println("	Congress Assistant	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	28	);	fb.setVariable("CFC", 	6	);	fb.setVariable("AFCA", 	35	);	fb.setVariable("DFCA", 	7	);	fb.evaluate();	System.out.println("	DSPLFamily	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	10	);	fb.setVariable("CFC", 	8	);	fb.setVariable("AFCA", 	12.5	);	fb.setVariable("DFCA", 	5.5	);	fb.evaluate();	System.out.println("	Nexus DSPL	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	13	);	fb.setVariable("CFC", 	4	);	fb.setVariable("AFCA", 	16.5	);	fb.setVariable("DFCA", 	15.5	);	fb.evaluate();	System.out.println("	SalesScenario	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	3	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	5.5	);	fb.setVariable("DFCA", 	3.5	);	fb.evaluate();	System.out.println("	Mobile Tourist Planner	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	27	);	fb.setVariable("CFC", 	12	);	fb.setVariable("AFCA", 	31.5	);	fb.setVariable("DFCA", 	8.5	);	fb.evaluate();	System.out.println("	Linux	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	8	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	11	);	fb.setVariable("DFCA", 	6	);	fb.evaluate();	System.out.println("	Content Store	 - " + fb.getVariable("DIFM").getValue());
	    fb.setVariable("CF",	8	);	fb.setVariable("CFC", 	0	);	fb.setVariable("AFCA", 	11	);	fb.setVariable("DFCA", 	6	);	fb.evaluate();	System.out.println("	Visual Data Graph	 - " + fb.getVariable("DIFM").getValue());
	
	    
	    
	}

}


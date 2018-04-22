package testes;

import net.sourceforge.jFuzzyLogic.FIS;

public class TesteSTABILITY {

	public static void main(String[] args) {
	    FIS fb = FIS.load("Stability.fcl", true);
	    
	    fb.setVariable("RDEn",	1	);	fb.setVariable("RoV", 	2.14	);	fb.setVariable("CogC", 	2	);	fb.evaluate();	System.out.println("	Smart-phone	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	2.67	);	fb.setVariable("CogC", 	0	);	fb.evaluate();	System.out.println("	WSN	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	1.67	);	fb.setVariable("CogC", 	3	);	fb.evaluate();	System.out.println("	Movie System	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	2.5	);	fb.setVariable("CogC", 	4	);	fb.evaluate();	System.out.println("	WindFarm	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	1	);	fb.setVariable("RoV", 	2	);	fb.setVariable("CogC", 	5	);	fb.evaluate();	System.out.println("	Online-book-shopping	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0.86	);	fb.setVariable("RoV", 	2.44	);	fb.setVariable("CogC", 	3	);	fb.evaluate();	System.out.println("	Dynamic Software Product Lines for Service-Based Systems	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	3.56	);	fb.setVariable("CogC", 	0	);	fb.evaluate();	System.out.println("	ADS	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	1	);	fb.setVariable("RoV", 	2.17	);	fb.setVariable("CogC", 	5	);	fb.evaluate();	System.out.println("	Smart Home	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	1.79	);	fb.setVariable("CogC", 	6	);	fb.evaluate();	System.out.println("	ConferenceContext	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	1.5	);	fb.setVariable("RoV", 	2.14	);	fb.setVariable("CogC", 	1	);	fb.evaluate();	System.out.println("	robot experiment	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	3.46	);	fb.setVariable("CogC", 	2	);	fb.evaluate();	System.out.println("	Wireless sensor actuator network	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	1	);	fb.setVariable("RoV", 	1.6	);	fb.setVariable("CogC", 	3	);	fb.evaluate();	System.out.println("	MobiHome	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	2	);	fb.setVariable("CogC", 	3	);	fb.evaluate();	System.out.println("	Scenario Application	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	1.67	);	fb.setVariable("RoV", 	2.17	);	fb.setVariable("CogC", 	5	);	fb.evaluate();	System.out.println("	17-mobile Game	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	1	);	fb.setVariable("RoV", 	2.33	);	fb.setVariable("CogC", 	2	);	fb.evaluate();	System.out.println("	SmartHotel	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	1.94	);	fb.setVariable("CogC", 	7	);	fb.evaluate();	System.out.println("	VsSystem	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	1	);	fb.setVariable("RoV", 	1.8	);	fb.setVariable("CogC", 	1	);	fb.evaluate();	System.out.println("	Aircraft	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0.6	);	fb.setVariable("RoV", 	3.4	);	fb.setVariable("CogC", 	5	);	fb.evaluate();	System.out.println("	Heidelberg Ion-Beam Therapy Center	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	1	);	fb.setVariable("RoV", 	1.69	);	fb.setVariable("CogC", 	6	);	fb.evaluate();	System.out.println("	PPU	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	2.25	);	fb.setVariable("CogC", 	3	);	fb.evaluate();	System.out.println("	Navigation Protocol	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0.6	);	fb.setVariable("RoV", 	2.2	);	fb.setVariable("CogC", 	5	);	fb.evaluate();	System.out.println("	Bikesharing	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0.8	);	fb.setVariable("RoV", 	1.9	);	fb.setVariable("CogC", 	4	);	fb.evaluate();	System.out.println("	CarSensors	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	2	);	fb.setVariable("CogC", 	3	);	fb.evaluate();	System.out.println("	Congress Assistant	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0.67	);	fb.setVariable("RoV", 	2.13	);	fb.setVariable("CogC", 	7	);	fb.evaluate();	System.out.println("	DSPLFamily	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0.71	);	fb.setVariable("RoV", 	1.71	);	fb.setVariable("CogC", 	6	);	fb.evaluate();	System.out.println("	Nexus DSPL	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	1	);	fb.setVariable("RoV", 	2.11	);	fb.setVariable("CogC", 	8	);	fb.evaluate();	System.out.println("	SalesScenario	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	2.2	);	fb.setVariable("CogC", 	2	);	fb.evaluate();	System.out.println("	Mobile Tourist Planner	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	1	);	fb.setVariable("RoV", 	2.53	);	fb.setVariable("CogC", 	3	);	fb.evaluate();	System.out.println("	Linux	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	2	);	fb.setVariable("CogC", 	3	);	fb.evaluate();	System.out.println("	Content Store	 - " + fb.getVariable("STIFM").getValue());
	    fb.setVariable("RDEn",	0	);	fb.setVariable("RoV", 	2.5	);	fb.setVariable("CogC", 	3	);	fb.evaluate();	System.out.println("	Visual Data Graph	 - " + fb.getVariable("STIFM").getValue());

	    
	}

}


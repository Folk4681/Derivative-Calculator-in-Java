package differentiation;

public class PowerRule{
	
	public static String action(){
		if (SingleInputAnalyzer.getVariable().equals("")){
			return "0";
		}
	double coefficient=Double.parseDouble(SingleInputAnalyzer.getCoefficient());
	double power = Double.parseDouble(SingleInputAnalyzer.getPower());
	final String VARIABLE = SingleInputAnalyzer.getVariable();
	String newCoefficient = String.valueOf(coefficient*power);
	String newPower = String.valueOf(power-1);
	String newTerm = newCoefficient+VARIABLE+"^"+newPower;
	return newTerm;
	}
	
}

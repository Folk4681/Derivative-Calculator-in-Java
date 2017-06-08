package differentiation;

public class LogRule {
	String term;String number;
	
	public LogRule(String in){
		term=in;
	}

	public String action(){
		for (int placeInString = 0;placeInString<term.length();placeInString++){
			if (String.valueOf(term.charAt(placeInString)).equals("^")){
				 number=term.substring(0,placeInString);
				 
			 }
		}
		Double.parseDouble(number);
			return (term+"ln("+number+")");
		
}}

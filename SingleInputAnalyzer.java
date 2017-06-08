package differentiation;
public class SingleInputAnalyzer {
		
		int endOfCoefficient;
		String term;
		static String coefficient;
		static String VARIABLE;
		static String power;
		int powerLocation;
		
		public SingleInputAnalyzer(){
			this.endOfCoefficient=0;
			coefficient="";
			VARIABLE="";
			power = "";
			this.powerLocation=1;
			valueFinder();
			add();
		}
		
		public SingleInputAnalyzer(String input){
			this.endOfCoefficient=0;
			setInput(input);
			coefficient="";
			VARIABLE="";
			power = "";
			this.powerLocation=1;
			valueFinder();
			add();
		}
		
		public void setInput(String someExpression){
			this.term = someExpression;
		}
		
		public void valueFinder(){
			for (int placeInString = 0;placeInString<term.length();placeInString++){
				if (String.valueOf(term.charAt(placeInString)).matches("[a-zA-Z]")){
					 endOfCoefficient = placeInString-1;
					 VARIABLE = String.valueOf(term.charAt(placeInString));
				 }
				
				if (term.charAt(placeInString)=='^'){
					powerLocation=placeInString;
				}
				
			}
		}
		
		public void add(){
			for (int placeInString = 0;placeInString<=endOfCoefficient;placeInString++){
				 coefficient+=term.charAt(placeInString); 
			}
			if (coefficient.equals("")){
				coefficient="1";
			}
			
			if ((term.length())>(endOfCoefficient)){
				
				for (int placeInString=powerLocation+1;placeInString<term.length();placeInString++){
				power+=term.charAt(placeInString);
				
			}
				if (!coefficient.equals("1")){
				if (powerLocation==1){
					power="1";
				}
				}
			}
		}
		 
		public static String getPower(){
			return power;
		}
		
		public static String getCoefficient(){
			
			return coefficient;
		}
		
		public static String getVariable(){
			return VARIABLE;
		}
		
		public String getInput(){
			return term;
		}
	}



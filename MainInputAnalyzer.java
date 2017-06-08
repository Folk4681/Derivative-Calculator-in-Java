package differentiation;
import  java.util.ArrayList;
public class MainInputAnalyzer {
	static String userinput;
	static String term;
	static ArrayList<String> listOfTerms = new ArrayList<String>();
	static ArrayList<String> listOfDerivedTerms = new ArrayList<String>();
	public static String MIA(String inp){
		listOfTerms.clear();listOfDerivedTerms.clear();
		userinput = inp;
		MultiInputAnalyzer2 multi1 = new MultiInputAnalyzer2(userinput);
		if (multi1.moreThanOneTerm==false){
			SingleInputAnalyzer randomVar = new SingleInputAnalyzer(userinput);
			return (PowerRule.action());
		}
		else{
			listOfTerms = multi1.getListOfTerms();
			for (int i=0;i<listOfTerms.size();i++){
				SingleInputAnalyzer derivForEachTerm = new SingleInputAnalyzer(listOfTerms.get(i));
				
				if (i==0){
					term = PowerRule.action() + multi1.listOfSigns.get(0);
				}
				if ((i>0)&(i!=listOfTerms.size()-1)){
					term = term + PowerRule.action() +  multi1.listOfSigns.get(i);
				}
				if (i==listOfTerms.size()-1){
					return (term+PowerRule.action());
				}
			}
		}
		return null;
	}
	
}

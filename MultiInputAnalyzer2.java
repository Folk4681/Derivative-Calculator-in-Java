package differentiation;
import java.util.ArrayList;
public class MultiInputAnalyzer2 {
	String totalInput;
	public boolean moreThanOneTerm = false;
	static ArrayList<String> listOfTerms = new ArrayList<String>();
	ArrayList<Integer> listOfLocationOfSigns = new ArrayList<Integer>();
	ArrayList<Character> listOfSigns = new ArrayList<Character>();
	public MultiInputAnalyzer2(String input){
		totalInput=input;
		if (checkTerms()==true){
			moreThanOneTerm=true;
			putTheTermsInAList();
		}
		
	}
	private boolean checkTerms(){
		for (int i=0;i<totalInput.length();i++){
			if ((String.valueOf(totalInput.charAt(i)).equals("+"))|(String.valueOf(totalInput.charAt(i)).equals("-"))){
				return true;
				
			}
			
		}
		return false;
	}
	private void putTheTermsInAList(){
		for (int i=0;i<totalInput.length();i++){
			if ((String.valueOf(totalInput.charAt(i)).equals("+"))|(String.valueOf(totalInput.charAt(i)).equals("-"))){
				listOfSigns.add(totalInput.charAt(i));
				listOfLocationOfSigns.add(i);
				
			}
	}
		int originalPos=0;
		for (int j=0;j<=listOfLocationOfSigns.size();j++){
			if (listOfLocationOfSigns.size()!=0){
			if (j==listOfLocationOfSigns.size()){
			originalPos=listOfLocationOfSigns.get(j-1);
			listOfTerms.add(totalInput.substring(originalPos+1,totalInput.length()));
			break;
			}

			
			else if (j==0){
			listOfTerms.add(totalInput.substring(originalPos,listOfLocationOfSigns.get(j)));}
			
			else{
				
				originalPos=listOfLocationOfSigns.get(j-1);
				listOfTerms.add(totalInput.substring(originalPos+1,listOfLocationOfSigns.get(j)));}
			}
		}
	}
	
	public ArrayList<String> getListOfTerms(){
		return listOfTerms;
	}
	
}

package differentiation;
import java.util.ArrayList;
public class ChainRule {
	ArrayList<Integer> rBracketList = new ArrayList<Integer>();
	ArrayList<Integer> lBracketList = new ArrayList<Integer>();
	ArrayList<String> allTermsBrackets = new ArrayList<String>();
	ArrayList<String> allTermsBracketsWPower = new ArrayList<String>();
	ArrayList<String> derivedTerms = new ArrayList<String>();
	ArrayList<Integer> hasPower = new ArrayList<Integer>();
	String input;
	public ChainRule(String input){
		this.input=input;
		setBracketLists(input);
	}
	public void setBracketLists(String input){
		
		for (int i =0; i<input.length();i++){
			if (String.valueOf(input.charAt(i)).equals(")")){
				rBracketList.add(i);
			}
			if (String.valueOf(input.charAt(i)).equals("(")){
				lBracketList.add(i);
			}
		}
		if (rBracketList.size()!=lBracketList.size()){
			System.out.println("Need more parenthesis.");
		}
		for (int i=lBracketList.size()-1;i>=0;i--){
			int k = lBracketList.get(i);
			int j=rBracketList.get(rBracketList.size()-1-i);
			if (j!=rBracketList.size()-1){
			if (String.valueOf(input.charAt(j+1)).equals("^")){
			allTermsBrackets.add(input.substring(k,j+1));
			allTermsBracketsWPower.add(input.substring(k,j+2));
			}
			else{
				allTermsBracketsWPower.add("0");
			}
			
			}
		}
		
	}
	

	public String action(){
		
			
				String currentString = allTermsBracketsWPower.get(0);
				
					String currentString2 = input.replace(allTermsBrackets.get(0),"u");
					String subbedWithU = MainInputAnalyzer.MIA(currentString2);
					String string1 = allTermsBrackets.get(0);
					String string2=((string1.substring(1,string1.length()-1)));
					String derivOfInside = MainInputAnalyzer.MIA(string2);
					String derivOfWhole = subbedWithU.replace("u",allTermsBrackets.get(0));
					return ("("+derivOfWhole+")"+"*"+"("+derivOfInside+")");
				
					
				
			}
			
	}


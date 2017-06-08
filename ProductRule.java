package differentiation;

public class ProductRule {
	String input;
	String fx="",gx="";
	boolean switch1=false,switch2=false;
	boolean entireSwitch1=true,entireSwitch2=false;;
	public ProductRule(String input){
		this.input=input;
	}
	public String action(){
		for (int i=0;i<input.length();i++){
			if (entireSwitch1==true){
			if (switch1==true){
			if (!String.valueOf(input.charAt(i)).equals(")")){

				fx+=String.valueOf(input.charAt(i));
			}
			}
			if (String.valueOf(input.charAt(i)).equals("(")){
				switch1=true;
			}
			if (String.valueOf(input.charAt(i)).equals(")")){
				switch1=false;
				entireSwitch1=false;
				entireSwitch2=true;
				i+=1;
			}
			}
			if (entireSwitch2==true){
				
				if (switch2==true){
					
					if (!String.valueOf(input.charAt(i)).equals(")")){
						
						gx+=String.valueOf(input.charAt(i));
					}
					}
				if (String.valueOf(input.charAt(i)).equals("(")){
					
					switch2=true;
				}
				if (String.valueOf(input.charAt(i)).equals(")")){
					switch2=false;
					entireSwitch2=false;
				}
			}
		}
		String dfdx = MainInputAnalyzer.MIA(fx);
		String dgdx = MainInputAnalyzer.MIA(gx);
		return ("("+gx+")"+"*"+"("+dfdx+")"+"+"+"("+fx+")"+"*"+"("+dgdx+")");
	}
}

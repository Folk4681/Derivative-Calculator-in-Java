package differentiation;
import java.util.ArrayList;
import java.util.Scanner;

public class MainInput {
	ArrayList<String> all_terms = new ArrayList<String>();
	static boolean vfc = false;
	public MainInput(String input){
		checkWhichMethod(input);
	}
	Scanner scan = new Scanner(System.in);
	public void checkWhichMethod(String input){
		if (input.equals("Power Rule")){
			System.out.print("Enter your function: (MULTIPLE TERMS AVAILABLE e.g. 'ax^b+cx^d+ex^f+...'): ");
			String function = scan.next();
			validationP(function);
			while (vfc==false){
				System.out.print("Enter your function: ");
				scan.reset();
				function=scan.next();
				validationP(function);
			}
		
				System.out.println("The derivative is: "+MainInputAnalyzer.MIA(function));
			
		}
		if (input.equals("Product Rule")){
			System.out.print("Enter your function (form: (ax^b+cx^d)*(ex^f+gx^h)): ");
			String function = scan.next();
			validationPr(function);
			while (vfc==false){
				System.out.print("Enter your function (form: (ax^b+cx^d)*(ex^f+gx^h)): ");
				scan.reset();
				function=scan.next();
				validationPr(function);

			}
			
				ProductRule obj = new ProductRule(function);
				System.out.println("Derivative: "+obj.action());
			
		}
		if (input.equals("Chain Rule")){
			System.out.print("Enter your function (form: (ax^b+cx^d)^e): ");
			String function = scan.next();
			validationCr(function);
			while (vfc==false){
				System.out.print("Enter your function (form: (ax^b+cx^d)^e): ");
				scan.reset();
				function=scan.next();
				validationCr(function);

			}
			
				ChainRule obj = new ChainRule(function);
				System.out.println("Derivative: "+obj.action());
			
		}
		if (input.equals("Log Rule")){
			System.out.print("Enter your function (form: a^x, MULTIPLE TERMS NOT AVAILABLE): ");
			String function = scan.next();
			validationLr(function);
			while (vfc==false){
				System.out.print("Enter your function (form: a^x, MULTIPLE TERMS NOT AVAILABLE): ");
				scan.reset();
				function=scan.next();
				validationLr(function);
			}
			
				LogRule obj = new LogRule(function);
				System.out.println("Derivative: "+obj.action());
			
		}
	}
	
	public void validationPr(String input){
		try{
			ProductRule obj = new ProductRule(input);
			obj.action();
			vfc=true;
		}
		catch (Exception ex){
			vfc=false;
			System.out.println("Invalid input.");
		}
	}
	public void validationP(String input){
		try{
			MainInputAnalyzer.MIA(input);
			vfc=true;
		}
		catch (Exception ex){
			System.out.println("Invalid input.");
			vfc=false;
		}
	}
	public void validationCr(String input){
	try{
		ChainRule obj = new ChainRule(input);
		obj.action();
		vfc=true;
	}
	catch (Exception ex){
		System.out.println("Invalid input.");
		vfc=false;
	}}
	public void validationLr(String input){
		try{
			LogRule obj = new LogRule(input);
			obj.action();
			vfc=true;
		}
		catch (Exception ex){
			System.out.println("Invalid input.");
			vfc=false;
		}}
}

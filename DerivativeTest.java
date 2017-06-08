package differentiation;
import java.util.Scanner;
public class DerivativeTest {
	static String input="";
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("This program is a program to calculate derivatives and works homogeneously. The user can only input one type of term for each input.\nFor example, if the user input 'Power Rule', and then '3x^2+6x^4' the program would output the correct derivative.");
		System.out.print("\nHowever, if the user input 'Product Rule' then '3x^2+6x^4', an error would occur.\n");
		System.out.print("In addition, if the user input 'Power Rule' then '3x^2+(3x^2)*(4x)', an error would occur.\n");
		while (!input.equals("Quit")){
		System.out.println("-----------------------------");
		System.out.print("Please input 'Product Rule', 'Power Rule', 'Chain Rule', or 'Log Rule' ('Quit' to quit): ");
		String input = scan.nextLine();
		while (!(input.equals("Product Rule"))&!(input.equals("Power Rule"))&!(input.equals("Chain Rule"))&!(input.equals("Quit"))&!(input.equals("Log Rule"))){
			if (input.equals("Quit")){
				break;
			}
			System.out.print("Invalid input. Please input 'Product Rule', 'Power Rule', 'Chain Rule', or 'Log Rule' ('Quit' to quit): ");
			scan.reset();
			input = scan.nextLine();
		}
		if (input.equals("Quit")){
			break;
		}
		MainInput item = new MainInput(input);
		
	}}
}

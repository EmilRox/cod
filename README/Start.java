import java.util.Scanner;
import java.util.logging.Logger;

public class Start {

	public static void main(String[] args) {
		String Expression;
		boolean active = true;
		Logger.println("Enter expression here (type 'exit' to quit):");
		Scanner scanIn;
		
		while (active) {
			scanIn = new Scanner(System.in);
			Expression = scanIn.nextLine();

			if (Expression.equals("exit")) {
				scanIn.close();
				active = false;
			} else {
				Logger.println(Calculator.Run(Expression));
			}

		}

	}

}
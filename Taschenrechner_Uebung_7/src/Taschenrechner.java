
public class Taschenrechner{

	/**
	 * @param args
	 */
	public static void main(String[]args) {
		
		float firstInput;
		float secondInput;
		float result = 0.0f;
		char operator;
		
		System.out.println("Dies ist ein einfacher arithmetischer Taschenrechner\n");
		System.out.println("Geben Sie die erste reelle Zahl ein!\n");
		firstInput = In.readFloat();
		System.out.println("Geben Sie die zweite reelle Zahl ein!\n");
		secondInput = In.readFloat();
		System.out.println("Zu guter letzt waehlen Sie bitte den gewuenschten Operator!\n");
		operator = In.readChar();
		
		switch(operator){
			case '+':
				result = firstInput + secondInput;
				Ausgabe(firstInput, secondInput, result, operator);
				break;
			case '-':
				result = firstInput - secondInput;
				Ausgabe(firstInput, secondInput, result, operator);
				break;
			case '*':
				result = firstInput * secondInput;
				Ausgabe(firstInput, secondInput, result, operator);
				break;
			case '/':
				result = (int)firstInput / (int)secondInput;
				Ausgabe(firstInput, secondInput, result, operator);
				break;
				
			default:
				System.out.println("Fehler bei der Eingabe des Operators! Bitte starten Sie das Programm neu und korrigieren Sie die Eingaben!");
				break;
		}
		
	}


	public static void Ausgabe(float firstInput, float secondInput, float result, char operator){
		
		System.out.println("Hier das Ergebnis ihrer Aufgabe: \n");
		System.out.println("" + firstInput + " " + operator + " " + secondInput + " = " + result);
	
	}
	
	

}
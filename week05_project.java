package week05;

public class week05_project {

	public class App {
		public static void main(String[] args) {
						Logger.AsteriskLogger asteriskLogger = new Logger.AsteriskLogger();
						Logger.SpacedLogger spacedLogger = new Logger.SpacedLogger();
						
						asteriskLogger.log ("Aserisk Logger");
						asteriskLogger.error ("Error in Aserisk Logger");
						
						spacedLogger.log("Spaced Logger");
						spacedLogger.error("Error in Spaced Logger");
					}

	}

interface Logger {
	public void log(String message);

	public void error(String message);
	
	class AsteriskLogger implements Logger {
		public void log(String message) {
			System.out.println("***" + message + "***");
		}

		public void error(String message) {
			System.err.println("***ERROR: " + message + "***");
		}
	}

	class SpacedLogger implements Logger {
		public void log(String message) {
				StringBuilder spacedMessage = new StringBuilder();
				for (int i = 0; i < message.length(); i++) {
					spacedMessage.append(message.charAt(i));
					if (i !=message.length() -1) {
						spacedMessage.append(" ");
					}
				}
				System.out.println(spacedMessage.toString());
		}

		public void error(String message) {
			StringBuilder spacedErrorMessage = new StringBuilder("Error: ");
			for (int i = 0; i < message.length(); i++) {
				spacedErrorMessage.append(message.charAt(i));
				if (i != message.length() - 1) {
					spacedErrorMessage.append(" ");
				}
			}
			System.err.println(spacedErrorMessage.toString());
		}

	}
}

}


// Exercises
// Coding Steps — Object Oriented Programming
// 1. Create an interface named Logger.
// 2. Add two void methods to the Logger interface, each should take a String as
// an argument
// a. log
// b. error
// 3. Create two classes that implement the Logger interface
// a. AsteriskLogger
// b. SpacedLogger
// 4. Implement the AsteriskLogger methods:

// Note: The AsteriskLogger will use the asterisk or "*".

// a. The log method on the AsteriskLogger should print out the String it
// receives between 3 asterisks on either side of the String (e.g. if the String
// passed in is “Hello”, then it should print ***Hello*** to the console).
// b. The error method on the AsteriskLogger should print the String it receives
// inside a box of asterisks, with the String preceded by the word “ERROR:”. For
// example, if “Hello” is the argument, the following should be printed:

// ****************

// ***Error: Hello***

// ****************

// 5. Implement the SpacedLogger methods:

// Note: The SpacedLogger should add a space or " " between each character of
// the String argument passed into its methods.

// a. If the log method received “Hello” as an argument, it should print H e l l
// o

// b. The error method should do the same, but with “ERROR:” preceding the
// spaced out input (i.e. ERROR: H e l l o)

// 6. Create a class named App that has a main method.

// a. In this class instantiate an instance of each of your logger classes that
// implement the Logger interface.

// b. Test both methods on both instances, passing in Strings of your choice.




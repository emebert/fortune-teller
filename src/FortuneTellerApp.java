import java.util.Scanner;

public class FortuneTellerApp {

	private static Object response;

	public static void main(String[] args) {
		{
			Scanner input = new Scanner(System.in);

			// The purpose of this application is to tell the user's fortune
			// based on input received from the user.

			// Ask the user for the user's first name
			System.out.println("What is your first name?");
			String firstName = input.nextLine();

			// Ask the user for the user's last name
			System.out.println("What is your last name?");
			String lastName = input.nextLine();
			
			// Ask the user for the user's age
			System.out.println("What is your age?");
			int age = input.nextInt();

			// Ask the user for the user's birth month as an int
			System.out.println("In what month were you born? Enter 1 for January, 2 for February, etc.");

			int birthMonth = input.nextInt();

			// Ask the user to name a favorite ROYGBIV color.
			// If user does not know what these colors are, enter 'help' to get
			// a list of the colors
			System.out.println("What is your favorite color in ROYGBIV? Type HELP for help!");
			String colorOne = input.next();

			if (colorOne.equalsIgnoreCase("HELP")) {
				// if help then explain roygbiv and ask for favorite color again
				System.out.println("You asked for help. Here are the ROYGBIV colors:");
				System.out.println(" Red, Orange, Yellow, Green, Blue, Indigo or Violet");
				System.out.println("Ok, now that you know your options, enter your favorite color.");
				String colorTwo = input.next();
				response = colorTwo;
			}

			// Ask the user for the user's number of siblings.

			System.out.println("How many siblings do you have?");
			int mySiblings = input.nextInt();

			// These conditionals create the data for the user's fortune.

			// Even or odd user age determines years to retirement
			String numberYears = "1000 years";
			if (age % 2 == 0) {
				numberYears = "1 year";
			} else {
				numberYears = "50 years";
			}

			// Number of user's siblings determines vacation home location
			String vacationHome = "in a shotgun shack";
			if (mySiblings == 0) {
				vacationHome = "in a shotgun shack";
			} else if (mySiblings == 1) {
				vacationHome = "in another part of the world";
			} else if (mySiblings == 2) {
				vacationHome = "behind the wheel of a large automobile";
			} else if (mySiblings > 3) {
				vacationHome = "in a cupboard under the stairs";
			} else if (mySiblings < 0) {
				vacationHome = "in Peoria, Illinois";
			}

			// Birth month determines amount user will have in bank
			String amountMoney = "$10";
			if (birthMonth > 1 && birthMonth <= 4) {
				amountMoney = "$10.00";
			} else if (birthMonth >= 5 && birthMonth <= 8) {
				amountMoney = "$1 billion";
			} else if (birthMonth >= 10 && birthMonth <= 12) {
				amountMoney = "a stack of mercury dimes";
			} else {
				amountMoney = "absolutely nothing";
			}

			// Favorite ROYGBIV color determines mode of transport
			String modeTransport = "red";
			if (colorOne.equalsIgnoreCase("red")) {
				modeTransport = "an invisible jet";
			} else if (colorOne.equalsIgnoreCase("orange")) {
				modeTransport = "a pea green 1978 El Camino";
			} else if (colorOne.equalsIgnoreCase("yellow")) {
				modeTransport = "a 1991 Geo Prizm hatchback";
			} else if (colorOne.equalsIgnoreCase("green")) {
				modeTransport = "a 1995 Chevy Lumina with a spoiler";
			} else if (colorOne.equalsIgnoreCase("blue")) {
				modeTransport = "a minivan (with hella cupholders)";
			} else if (colorOne.equalsIgnoreCase("indigo")) {
				modeTransport = "a rusty bicycle";
			} else if (colorOne.equalsIgnoreCase("violet")) {
				modeTransport = "a pair of rollerblades";
			}

			// The fortune!
			{
				System.out.println(firstName + " " + lastName + " will retire in " + numberYears + " with "
						+ amountMoney + " in the bank, a vacation home " + vacationHome + " , and travel by "
						+ modeTransport + ".");
			}
		}
	}
}

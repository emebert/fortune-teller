
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask the user to name a favorite ROYGBIV color. If the user does not know what these colors are, enter 'help' to get a list of the colors.
					System.out.println(
							"Name your favorite ROYGBIV color. If you enter 'help', the full list of options will appear.");
					System.out.println("What is your favorite color in ROYGBIV? Type HELP for help!");
					  String color = input.next();

					 if (response.equalsIgnoreCase("HELP")) {
					   // if help then explain roygbiv and ask for favorite color again
					   System.out.println("Please choose from the following:");
					   System.out.println(" Red, Orange, Yellow, Green, Blue, Indigo or Violet");
					   String response2 = input.next();
					   response = response2;
					  }
					
	}

}

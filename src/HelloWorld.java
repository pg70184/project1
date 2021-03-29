import java.util.Scanner;

public class HelloWorld
{
public static void main (String [] args)
{
	String input;
	
	//Scanner object for user input
	Scanner password = new Scanner (System.in);

	//Prompt the user to enter a password attempt
	System.out.println("What is the secret word? ");
	input = password.nextLine();
	
	//Determine wether the user entered the secret word
	if (input.equalsIgnoreCase("PROSPERO"))
	{
	System.out.println("Nice, you know the secret word!");
	
	}
	else
	{	
	System.out.println("That's not the secret word!");
		}
	}
}
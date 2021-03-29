import java.util.Scanner;

public class TrueFalseJavaProject
{
	public static void main(String[] args)
	{
		double score1,
			   score2,
			   score3,
			   average;
	
		Scanner test = new Scanner(System.in);
		
	//Get score for test 1
	System.out.println("What is the score for exam 1?: ");
	score1 = test.nextDouble();
	
	//Get the score for test 2
	System.out.println("What's the score for exam 2?: ");
	score2 = test.nextDouble();
	
	//Get score for test 3
	System.out.println("What is the score for exam 3?: ");
	score3 = test.nextDouble();
	
	//Gets average and prints it out
	average = (score1 + score2 + score3)/3;
	System.out.println("The average score is: " + average);
	
	if (average > 95)
		System.out.println("Congratulations!");
	
	}
}
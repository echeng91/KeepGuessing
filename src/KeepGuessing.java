import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secretNumber, guess = 0;//guess is initialized to 0
		Random rnd = new Random();
		
		secretNumber = 1 + rnd.nextInt(1000);
		
		System.out.println("I'm thinking of a number between 1 and 1000");
		System.out.print("Enter the number:");
		guess = keyboard.nextInt();
		
		while ( guess != secretNumber )
		{
			if (guess == 5)
			{
				break;
			}
			System.out.println();
			if (guess < secretNumber)
			{
				System.out.println("Too low.");
			}
			else if (guess > secretNumber)
			{
				System.out.println("Too high.");
			}
			System.out.println("You are wrong. Try again.");
			System.out.println("Enter the number: ");
			guess = keyboard.nextInt();
		}
		
		if(guess == secretNumber)
		{
			System.out.println("You are correct. You win a prize!");
		}
		else
		{
			System.out.println("Why did you quit?");
		}
		keyboard.close();
	}
}
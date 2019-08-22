import java.util.Scanner;

public class NumberGuessingGame
	{

		public static void main(String[] args)
			{
				//Test
				Scanner userInput = new Scanner (System.in);
				int gameLevel = userInput.nextInt();
				System.out.println("What level would you like to play? Please enter 1,2, or 3. 1 = easy, 2 = medium, 3 = hard");
				
				if(gameLevel == 1)
					{
						
					}
				
				//Hard Level
				int randomNumber = (int) (Math.random() * 100 + 1);
				int counter = 0;
				
				System.out.println("What is your name?");
				Scanner userInput1 = new Scanner (System.in);
				String name = userInput.nextLine();
				System.out.println("Hello " + name + " Please enter a number between 1 and 100 to play the game. ");
				
				boolean stillGuessing = true;
						
				while(stillGuessing)
				{
				counter++;
				Scanner userInput2 = new Scanner (System.in);
				int guess = userInput.nextInt();
				
				if(guess > randomNumber)
					{
						System.out.println("Sorry, your guess was too high. Please try again.");
					}
				
				else if(guess < randomNumber)
					{
						System.out.println("Sorry, your guess was too low. Please try again");
					}
				
				else
					{
						System.out.println("You guessed it!");
						stillGuessing = false;
					}
				}
				
				//Medium Level
				int randomNumber1 = (int) (Math.random() * 50 + 1);
				int counter1 = 0;
				
				System.out.println("What is your name?");
				Scanner userInput3 = new Scanner (System.in);
				String name1 = userInput.nextLine();
				System.out.println("Hello " + name + " Please enter a number between 1 and 50 to play the game. ");
				
				boolean stillGuessing1 = true;
						
				while(stillGuessing)
				{
				counter++;
				Scanner userInput4 = new Scanner (System.in);
				int guess = userInput.nextInt();
				
				if(guess > randomNumber)
					{
						System.out.println("Sorry, your guess was too high. Please try again.");
					}
				
				else if(guess < randomNumber)
					{
						System.out.println("Sorry, your guess was too low. Please try again");
					}
				
				else
					{
						System.out.println("You guessed it!");
						stillGuessing1 = false;
					}
				}
				
				//Easy Level
				int randomNumber2 = (int) (Math.random() * 10 + 1);
				int counter2 = 0;
				
				System.out.println("What is your name?");
				Scanner userInput5 = new Scanner (System.in);
				String name2 = userInput.nextLine();
				System.out.println("Hello " + name + " Please enter a number between 1 and 10 to play the game. ");
				
				boolean stillGuessing2 = true;
						
				while(stillGuessing)
				{
				counter++;
				Scanner userInput6 = new Scanner (System.in);
				int guess = userInput.nextInt();
				
				if(guess > randomNumber)
					{
						System.out.println("Sorry, your guess was too high. Please try again.");
					}
				
				else if(guess < randomNumber)
					{
						System.out.println("Sorry, your guess was too low. Please try again");
					}
				
				else
					{
						System.out.println("You guessed it!");
						stillGuessing2 = false;
					}
				}
			}
	}

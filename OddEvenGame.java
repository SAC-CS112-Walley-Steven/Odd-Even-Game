import java.util.Scanner;

public class OddEvenGame{

	public static void main (String[] args){

		Scanner input = new Scanner (System.in);

		int winCount = 0;
		int playAgain = 0;

		Player player = new Player ("Steve Walley", 0, 0);

		player.getPlayerLevel();

		System.out.println(player.getPlayerStats());

		do 
		{
			int diceNum = 1 + (int)(Math.random()* 6);

			System.out.print("Press 1 for Odd, 2 for Even: ");
			int userInput = input.nextInt();

			System.out.println ("Dice number is " +diceNum);

			if (userInput % 2 ==0)
			{
				if (diceNum % 2 ==0)
				{
					System.out.println("You win!");
					winCount++;
					player.setWinCount(winCount);
				}
				else
					System.out.println ("You lose");
			}
			if (userInput % 2 != 0)
			{
				if (diceNum % 2 != 0)
				{
					System.out.println("You win!");
					winCount++;
					player.setWinCount(winCount);
				}
				else
					System.out.println ("You lose");
			}

			player.getPlayerLevel();

			System.out.print("Press 1 to playAgain, 2 to quit: ");
			playAgain = input.nextInt();

		}
		while (playAgain ==1);

		System.out.println(player.getPlayerStats());
	}
}
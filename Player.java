public class Player
{
	private String name;
	private int winCount;
	private int playerLevel;
	private String playerLev = "Amatuer";

	public Player (String name, int winCount, int playerLevel)
	{
		this.name = name;
		this.winCount = winCount;
		this.playerLevel = playerLevel;
	}
	public String toString()
	{
		return String.format("Name: %s\nGames won: %d\nPlayer Level: %s\n", name, winCount, playerLev);
	}

	public void setName (String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}	
	public void setWinCount (int winCount)
	{
		this.winCount = winCount;
	}
	public int getWinCount()
	{
		return winCount;
	}
	public String getPlayerLevel()
	{
		if (winCount >= 0 && winCount <=5)
			playerLevel = 1;
		else if (winCount > 5 && winCount <= 10)
			playerLevel = 2;
		else if (winCount > 10)
			playerLevel = 3;

		if (playerLevel ==1) playerLev="Amatuer";
		if (playerLevel ==2) playerLev="Rookie";
		if (playerLevel ==3) playerLev="Veteran";
		
		return playerLev;
	}
	
}

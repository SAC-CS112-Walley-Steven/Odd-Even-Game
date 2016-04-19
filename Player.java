
public class Player
{
	private String name;
	private int winCount;
	private int playerLevel;

	public Player (String name, int winCount, int playerLevel)
	{
		this.name = name;
		this.winCount = winCount;
		this.playerLevel = playerLevel;
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
	public int getPlayerLevel()
	{
		if (winCount >= 0 && winCount <=5)
			playerLevel = 1;
		else if (winCount > 5 && winCount <= 10)
			playerLevel = 2;
		else if (winCount > 10)
			playerLevel = 3;

		return playerLevel;
	}
}

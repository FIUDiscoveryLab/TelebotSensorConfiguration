package utility;

public class Extrema 
{
	//for each joint found (specified), find max and min for each x, y, z
	public int max(int val, int max)
	{
		if(val > max)
		{
			max = val;
		}
		
		return max;
	}
	
	public int min(int val, int min)
	{
		if(val < min)
		{
			min = val;
		}
		
		return min;
	}
		
}

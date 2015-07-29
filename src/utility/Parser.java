package utility;

import java.util.StringTokenizer;
import model.Sensor;

public class Parser 
{
	private String delim = " ";

	public Sensor parse(String in)
	{
		Sensor sensor = new Sensor();
		
		try 
		{
			StringTokenizer tokenizer = new StringTokenizer(delim);
				
			while(tokenizer.nextToken() != null)
			{
				sensor.setJointName(tokenizer.nextToken());
				sensor.setX(Integer.parseInt(tokenizer.nextToken()));
				sensor.setY(Integer.parseInt(tokenizer.nextToken()));
				sensor.setZ(Integer.parseInt(tokenizer.nextToken()));
			}
				
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sensor;
	}
		
}

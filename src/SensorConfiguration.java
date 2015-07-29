import utility.Extrema;
import utility.Parser;
import model.Sensor;

import java.util.Scanner;


public class SensorConfiguration 
{
	private Sensor sensor;
	private static Parser parser;
	private Scanner scanner;
	private static Extrema extrema;
	
	public SensorConfiguration()
	{
		
	}
	
	public void configure(String filename)
	{ 
		try
		{
			scanner = new Scanner(filename);
			
			while(scanner.hasNextLine())
			{
				String line = scanner.nextLine();
				
				while(line != null)
				{
					int max = 0;
					int min = 360;
					int maximumX, maximumY, maximumZ;
					int minimumX, minimumY, minimumZ;
					
					sensor = (Sensor)parser.parse(line);
					
					if(sensor.getJointName().equals("head"))
					{
						maximumX = extrema.max(sensor.getX(), max);
						minimumX = extrema.min(sensor.getX(), min);
						
						maximumY = extrema.max(sensor.getY(), max);
						minimumY = extrema.min(sensor.getY(), min);
						
						maximumZ = extrema.max(sensor.getZ(), max);
						minimumZ = extrema.min(sensor.getZ(), min);
					}
					else if(sensor.getJointName().equals("left_shoulder"))
					{
						
					}
					else if(sensor.getJointName().equals("left_elbow"))
					{
						
					}
					else if(sensor.getJointName().equals("left_wrist"))
					{
						
					}
					else if(sensor.getJointName().equals("right_shoulder"))
					{
						
					}
					else if(sensor.getJointName().equals("right_elbow"))
					{
						
					}
					else if(sensor.getJointName().equals("right_wrist"))
					{
						
					}
			}
			
						
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		scanner.close();
	}
}

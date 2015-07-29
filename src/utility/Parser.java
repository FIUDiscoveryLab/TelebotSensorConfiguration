package utility;

import java.util.StringTokenizer;
import model.Sensor;

public class Parser 
{
	private String delim = " ";

	public Sensor parse(String in)
	{
		System.out.println(in);
		Sensor sensor = new Sensor();
		
		try 
		{
			StringTokenizer tokenizer = new StringTokenizer(in, delim);
			
			String joint_token = tokenizer.nextToken();
				
			if(joint_token.equals("head") 
					|| joint_token.equals("left_shoulder") 
					|| joint_token.equals("left_elbow") 
					|| joint_token.equals("left_wrist")
					|| joint_token.equals("right_shoulder") 
					|| joint_token.equals("right_elbow") 
					|| joint_token.equals("right_wrist"))
			{
				sensor.setJointName(joint_token);
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

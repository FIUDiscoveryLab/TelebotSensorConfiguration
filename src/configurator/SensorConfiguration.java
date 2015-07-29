package configurator;
import utility.Extrema;
import utility.Parser;
import model.Sensor;

import java.io.PrintWriter;
import java.util.Scanner;


public class SensorConfiguration 
{
	final int numberOfJoints = 7;
	
	private Sensor sensor;
	private static Parser parser;
	private Scanner scanner;
	private static Extrema extrema;
	private PrintWriter printer;
	private String infile;
	private String outfile;
	
	private String[] joints;
	
	private int head_maximumX = 0;
	private int head_maximumY = 0;
	private int head_maximumZ = 0;
	
	private int shoulder_left_maximumX = 0;
	private int shoulder_left_maximumY = 0;
	private int shoulder_left_maximumZ = 0;
	private int elbow_left_maximumX = 0;
	private int elbow_left_maximumY = 0;
	private int elbow_left_maximumZ = 0;
	private int wrist_left_maximumX = 0;
	private int wrist_left_maximumY = 0;
	private int wrist_left_maximumZ = 0;
	
	private int shoulder_right_maximumX = 0;
	private int shoulder_right_maximumY = 0;
	private int shoulder_right_maximumZ = 0;
	private int elbow_right_maximumX = 0;
	private int elbow_right_maximumY = 0;
	private int elbow_right_maximumZ = 0;
	private int wrist_right_maximumX = 0;
	private int wrist_right_maximumY = 0;
	private int wrist_right_maximumZ = 0;
	
	
	private int head_minimumX = 360;
	private int head_minimumY = 360;
	private int head_minimumZ = 360;
	
	private int shoulder_left_minimumX = 360;
	private int shoulder_left_minimumY = 360;
	private int shoulder_left_minimumZ = 360;
	private int elbow_left_minimumX = 360;
	private int elbow_left_minimumY = 360;
	private int elbow_left_minimumZ = 360;
	private int wrist_left_minimumX = 360;
	private int wrist_left_minimumY = 360;
	private int wrist_left_minimumZ = 360;
	
	private int shoulder_right_minimumX = 360;
	private int shoulder_right_minimumY = 360;
	private int shoulder_right_minimumZ = 360;
	private int elbow_right_minimumX = 360;
	private int elbow_right_minimumY = 360;
	private int elbow_right_minimumZ = 360;
	private int wrist_right_minimumX = 360;
	private int wrist_right_minimumY = 360;
	private int wrist_right_minimumZ = 360;
	
	
	public SensorConfiguration(String infile, String outfile)
	{
		this.infile = infile;
		this.outfile = outfile;
	}
	
	public void configure()
	{ 
		try
		{
			scanner = new Scanner(infile);
			
			joints = new String[numberOfJoints];
			
			while(scanner.hasNextLine())
			{
				String line = scanner.nextLine();
				
				while(line != null)
				{	
					sensor = (Sensor)parser.parse(line);
					
					if(sensor.getJointName().equals("head"))
					{
						sensor.setMaxX(extrema.max(sensor.getX(), head_maximumX));
						sensor.setMinX(extrema.min(sensor.getX(), head_minimumX));
						
						sensor.setMaxY(extrema.max(sensor.getY(), head_maximumY));
						sensor.setMinY(extrema.min(sensor.getY(), head_minimumY));
						
						sensor.setMaxZ(extrema.max(sensor.getZ(), head_maximumZ));
						sensor.setMinZ(extrema.min(sensor.getZ(), head_minimumZ));
						
						head_maximumX = sensor.getMaxX();
						head_minimumX = sensor.getMinX();
						
						head_maximumY = sensor.getMaxY();
						head_minimumY = sensor.getMinY();
						
						head_maximumZ = sensor.getMaxZ();
						head_minimumZ = sensor.getMinZ();
								
					}
					else if(sensor.getJointName().equals("left_shoulder"))
					{
						sensor.setMaxX(extrema.max(sensor.getX(), shoulder_left_maximumX));
						sensor.setMinX(extrema.min(sensor.getX(), shoulder_left_minimumX));
						
						sensor.setMaxY(extrema.max(sensor.getY(), shoulder_left_maximumY));
						sensor.setMinY(extrema.min(sensor.getY(), shoulder_left_minimumY));
						
						sensor.setMaxZ(extrema.max(sensor.getZ(), shoulder_left_maximumZ));
						sensor.setMinZ(extrema.min(sensor.getZ(), shoulder_left_minimumZ));
						
						shoulder_left_maximumX = sensor.getMaxX();
						shoulder_left_minimumX = sensor.getMinX();
						
						shoulder_left_maximumY = sensor.getMaxY();
						shoulder_left_minimumY = sensor.getMinY();
						
						shoulder_left_maximumZ = sensor.getMaxZ();
						shoulder_left_minimumZ = sensor.getMinZ();
					}
					else if(sensor.getJointName().equals("left_elbow"))
					{
						sensor.setMaxX(extrema.max(sensor.getX(), elbow_left_maximumX));
						sensor.setMinX(extrema.min(sensor.getX(), elbow_left_minimumX));
						
						sensor.setMaxY(extrema.max(sensor.getY(), elbow_left_maximumY));
						sensor.setMinY(extrema.min(sensor.getY(), elbow_left_minimumY));
						
						sensor.setMaxZ(extrema.max(sensor.getZ(), elbow_left_maximumZ));
						sensor.setMinZ(extrema.min(sensor.getZ(), elbow_left_minimumZ));
						
						elbow_left_maximumX = sensor.getMaxX();
						elbow_left_minimumX = sensor.getMinX();
						
						elbow_left_maximumY = sensor.getMaxY();
						elbow_left_minimumY = sensor.getMinY();
						
						elbow_left_maximumZ = sensor.getMaxZ();
						elbow_left_minimumZ = sensor.getMinZ();
					}
					else if(sensor.getJointName().equals("left_wrist"))
					{
						sensor.setMaxX(extrema.max(sensor.getX(), wrist_left_maximumX));
						sensor.setMinX(extrema.min(sensor.getX(), wrist_left_minimumX));
						
						sensor.setMaxY(extrema.max(sensor.getY(), wrist_left_maximumY));
						sensor.setMinY(extrema.min(sensor.getY(), wrist_left_minimumY));
						
						sensor.setMaxZ(extrema.max(sensor.getZ(), wrist_left_maximumZ));
						sensor.setMinZ(extrema.min(sensor.getZ(), wrist_left_minimumZ));
						
						wrist_left_maximumX = sensor.getMaxX();
						wrist_left_minimumX = sensor.getMinX();
						
						wrist_left_maximumY = sensor.getMaxY();
						wrist_left_minimumY = sensor.getMinY();
						
						wrist_left_maximumZ = sensor.getMaxZ();
						wrist_left_minimumZ = sensor.getMinZ();
					}
					else if(sensor.getJointName().equals("right_shoulder"))
					{
						sensor.setMaxX(extrema.max(sensor.getX(), shoulder_right_maximumX));
						sensor.setMinX(extrema.min(sensor.getX(), shoulder_right_minimumX));
						
						sensor.setMaxY(extrema.max(sensor.getY(), shoulder_right_maximumY));
						sensor.setMinY(extrema.min(sensor.getY(), shoulder_right_minimumY));
						
						sensor.setMaxZ(extrema.max(sensor.getZ(), shoulder_right_maximumZ));
						sensor.setMinZ(extrema.min(sensor.getZ(), shoulder_right_minimumZ));
						
						shoulder_right_maximumX = sensor.getMaxX();
						shoulder_right_minimumX = sensor.getMinX();
						
						shoulder_right_maximumY = sensor.getMaxY();
						shoulder_right_minimumY = sensor.getMinY();
						
						shoulder_right_maximumZ = sensor.getMaxZ();
						shoulder_right_minimumZ = sensor.getMinZ();
					}
					else if(sensor.getJointName().equals("right_elbow"))
					{
						sensor.setMaxX(extrema.max(sensor.getX(), elbow_right_maximumX));
						sensor.setMinX(extrema.min(sensor.getX(), elbow_right_minimumX));
						
						sensor.setMaxY(extrema.max(sensor.getY(), elbow_right_maximumY));
						sensor.setMinY(extrema.min(sensor.getY(), elbow_right_minimumY));
						
						sensor.setMaxZ(extrema.max(sensor.getZ(), elbow_right_maximumZ));
						sensor.setMinZ(extrema.min(sensor.getZ(), elbow_right_minimumZ));
						
						elbow_right_maximumX = sensor.getMaxX();
						elbow_right_minimumX = sensor.getMinX();
						
						elbow_right_maximumY = sensor.getMaxY();
						elbow_right_minimumY = sensor.getMinY();
						
						elbow_right_maximumZ = sensor.getMaxZ();
						elbow_right_minimumZ = sensor.getMinZ();
					}
					else if(sensor.getJointName().equals("right_wrist"))
					{
						sensor.setMaxX(extrema.max(sensor.getX(), wrist_right_maximumX));
						sensor.setMinX(extrema.min(sensor.getX(), wrist_right_minimumX));
						
						sensor.setMaxY(extrema.max(sensor.getY(), wrist_right_maximumY));
						sensor.setMinY(extrema.min(sensor.getY(), wrist_right_minimumY));
						
						sensor.setMaxZ(extrema.max(sensor.getZ(), wrist_right_maximumZ));
						sensor.setMinZ(extrema.min(sensor.getZ(), wrist_right_minimumZ));
						
						wrist_right_maximumX = sensor.getMaxX();
						wrist_right_minimumX = sensor.getMinX();
						
						wrist_right_maximumY = sensor.getMaxY();
						wrist_right_minimumY = sensor.getMinY();
						
						wrist_right_maximumZ = sensor.getMaxZ();
						wrist_right_minimumZ = sensor.getMinZ();
					}
				}
							
			}
			
			scanner.close();	
			
			joints[0] = "HEAD" 
						+ " " + "max x: " + head_maximumX 
						+ " " + "min x: " + head_minimumX
						+ " " + "max y: " + head_maximumY 
						+ " " + "min y: " + head_minimumY
						+ " " + "max z: " + head_maximumZ 
						+ " " + "min z: " + head_minimumZ;
			
			joints[1] = "SHOULDER LEFT" 
					+ " " + "max x: " + shoulder_left_maximumX 
					+ " " + "min x: " + shoulder_left_minimumX
					+ " " + "max y: " + shoulder_left_maximumY 
					+ " " + "min y: " + shoulder_left_minimumY
					+ " " + "max z: " + shoulder_left_maximumZ 
					+ " " + "min z: " + shoulder_left_minimumZ;
			
			joints[2] = "ELBOW LEFT" 
					+ " " + "max x: " + elbow_left_maximumX 
					+ " " + "min x: " + elbow_left_minimumX
					+ " " + "max y: " + elbow_left_maximumY 
					+ " " + "min y: " + elbow_left_minimumY
					+ " " + "max z: " + elbow_left_maximumZ 
					+ " " + "min z: " + elbow_left_minimumZ;
			
			joints[3] = "WRIST LEFT" 
					+ " " + "max x: " + wrist_left_maximumX 
					+ " " + "min x: " + wrist_left_minimumX
					+ " " + "max y: " + wrist_left_maximumY 
					+ " " + "min y: " + wrist_left_minimumY
					+ " " + "max z: " + wrist_left_maximumZ 
					+ " " + "min z: " + wrist_left_minimumZ;
			
			joints[4] = "SHOULDER RIGHT" 
					+ " " + "max x: " + shoulder_right_maximumX 
					+ " " + "min x: " + shoulder_right_minimumX
					+ " " + "max y: " + shoulder_right_maximumY 
					+ " " + "min y: " + shoulder_right_minimumY
					+ " " + "max z: " + shoulder_right_maximumZ 
					+ " " + "min z: " + shoulder_right_minimumZ;
			
			joints[5] = "ELBOW RIGHT" 
					+ " " + "max x: " + elbow_right_maximumX 
					+ " " + "min x: " + elbow_right_minimumX
					+ " " + "max y: " + elbow_right_maximumY 
					+ " " + "min y: " + elbow_right_minimumY
					+ " " + "max z: " + elbow_right_maximumZ 
					+ " " + "min z: " + elbow_right_minimumZ;
			
			
			joints[6] = "WRIST RIGHT" 
					+ " " + "max x: " + wrist_right_maximumX 
					+ " " + "min x: " + wrist_right_minimumX
					+ " " + "max y: " + wrist_right_maximumY 
					+ " " + "min y: " + wrist_right_minimumY
					+ " " + "max z: " + wrist_right_maximumZ 
					+ " " + "min z: " + wrist_right_minimumZ;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	public void print()
	{
		try
		{
			printer = new PrintWriter(outfile);

			for(int i = 0; i < numberOfJoints; i++)
			{
				printer.println(joints[i]);
			}
			
			printer.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

package test;

import configurator.SensorConfiguration;

public class SensorConfigurationTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SensorConfiguration configuration = new SensorConfiguration("src/configurations/input.txt", 
													"src/configurations/sensor_config.txt");
		
		configuration.configure();
		
		configuration.print();
	}

}

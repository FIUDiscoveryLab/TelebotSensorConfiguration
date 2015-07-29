package model;

public class Sensor 
{
	private String jointName;
	private int x;
	private int y;
	private int z;
	
	public Sensor()
	{

	}
	
	public String getJointName(){return jointName;}
	
	public int getX(){return x;}
	
	public int getY(){return y;}
	
	public int getZ(){return z;}
	
	public void setJointName(String joint_name){this.jointName = joint_name;}
	
	public void setX(int x){this.x = x;}
	
	public void setY(int y){this.y = y;}
	
	public void setZ(int z){this.z = z;}
}

package model;

public class Sensor 
{
	private String jointName;
	private int x;
	private int y;
	private int z;
	private int maxX;
	private int maxY;
	private int maxZ;
	private int minX;
	private int minY;
	private int minZ;
	
	public Sensor()
	{

	}
	
	public String getJointName(){return jointName;}
	
	public int getX(){return x;}
	
	public int getY(){return y;}
	
	public int getZ(){return z;}
	
	public int getMaxX(){return maxX;}
	
	public int getMaxY(){return maxY;}
	
	public int getMaxZ(){return maxZ;}
	
	public int getMinX(){return minX;}
	
	public int getMinY(){return minY;}
	
	public int getMinZ(){return minZ;}
	
	public void setJointName(String joint_name){this.jointName = joint_name;}
	
	public void setX(int x){this.x = x;}
	
	public void setY(int y){this.y = y;}
	
	public void setZ(int z){this.z = z;}
	
	public void setMaxX(int max_x){this.maxX = max_x;}
	
	public void setMaxY(int max_y){this.maxY = max_y;}
	
	public void setMaxZ(int max_z){this.maxZ = max_z;}
	
	public void setMinX(int min_x){this.minX = min_x;}
	
	public void setMinY(int min_y){this.minY = min_y;}
	
	public void setMinZ(int min_z){this.minZ = min_z;}
}

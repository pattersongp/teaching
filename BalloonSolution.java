/**
 * Welcome to our Balloon class!
 * @Author Ethan Adams + 1004
 * @Version 1.0
 */

public class BalloonSolution
{
	private double volume;
	public static numBalloons = 0;
	
	/** 
	 * Balloon Constructor, just takes initial volume
	 * @param v inital volume
	 */
	public Balloon(double v)
	{
		this.volume = v;
		numBalloons++;
	}

	/** Method to return volume
	 * @return volume
	 */
	public double getVolume()
	{
		return this.volume;
	}

	/** Method to return surface area
	 * @return surface area
	 */
	public double getSurfaceArea()
	{
		double radius = this.getRadius();
		double surfaceArea = 4 * Math.PI * radius * radius;
		return surfaceArea;
	}

	/** Method to return radius
	 * @return radius
	 */
	public double getRadius()
	{
		double radius = volume / ((4.0/3.0) * Math.PI);
		return radius;
	}

	/** Adds air to the balloon
	 * @param amt Amount of air to add
	 */
	public void addAir(double amt)
	{
		this.volume += amt;
	}
}

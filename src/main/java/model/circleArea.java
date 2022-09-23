/**
 * @author chadrobbins - cerobbins@dmacc.edu
 * CIS 175 - Spring 2022
 * Sep 22, 2022
 */
package model;

/**
 * @author chadrobbins
 *
 */
public class circleArea {
	private double radius;
	private double area;
	
	
	/**
	 * Default no-arg Constructor
	 */
	public circleArea() {
		super();
	}
	
	/**
	 * @param radius
	 */
	public circleArea(double radius) {
		this.radius = radius;
		getCircleArea(radius);
	}
	
	

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	private void getCircleArea(double radius) {
		// TODO Auto-generated method stub
		setArea(3.14 * Math.pow(radius, 2));
		
	}

	

	
}

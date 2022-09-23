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
public class triangleArea {
	private double length;
	private double width;
	private double area;
	
	/**
	 * Default no-arg constructor
	 */
	public triangleArea() {
	}
	/**
	 * @param length
	 * @param width
	 */
	public triangleArea(double length, double width) {
		this.length = length;
		this.width = width;
		getTriangleArea(length, width);
	}
	private void getTriangleArea(double length2, double width2) {
		// TODO Auto-generated method stub
		setArea((length * width) / 2);
		
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
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

}

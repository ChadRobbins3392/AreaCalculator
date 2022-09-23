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
public class squareArea {
	private double length;
	private double width;
	private double area;
	
	/**
	 * Default no-arg constructor
	 */
	public squareArea() {
	}
	/**
	 * @param length
	 * @param width
	 */
	public squareArea(double length, double width) {
		this.length = length;
		this.width = width;
		getSquareArea(length, width);
	}
	private void getSquareArea(double length2, double width2) {
		// TODO Auto-generated method stub
		setArea(length * width);
		
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
	public void setLength(int length) {
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
	 * @param d the area to set
	 */
	public void setArea(double d) {
		this.area = d;
	}
	
	
}

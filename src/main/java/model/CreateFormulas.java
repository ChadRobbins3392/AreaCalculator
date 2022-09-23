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
public class CreateFormulas {
	private String shape;
	private String areaFormula;
	
	
	
	/**
	 * Default no-arg constructor
	 */
	public CreateFormulas() {
		super();
	}
	/**
	 * @param shape
	 */
	public CreateFormulas(String shape) {
		super();
		this.shape = shape;
		setAreaFormula(shape);
	}
	
	/**
	 * @return the shape
	 */
	public String getShape() {
		return shape;
	}
	/**
	 * @param shape the shape to set
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}
	/**
	 * @return the areaFormula
	 */
	public String getAreaFormula() {
		return areaFormula;
	}
	/**
	 * @param areaFormula the areaFormula to set
	 */
	public void setAreaFormula(String shapePassed) {
		// TODO Auto-generated method stub
		String circleFormula = "A = (3.14)r^2";
		String squareFormula = "A = length * width";
		String triangleFormula = "A = (length * width) / 2";
		
		switch (shape) {
		case "circle":
			areaFormula = circleFormula;
			break;
		case "square": 
			areaFormula = squareFormula;
			break;
		case "triangle":
			areaFormula = triangleFormula;
			break;
		default: areaFormula = "Not valid String";
		}
		
	}
	@Override
	public String toString() {
		return "CreateFormulas [shape=" + shape + ", areaFormula=" + areaFormula + "]";
	}
	
	
}


public class Circle {
	private double radius;

	public Circle(double radius) {
	    this.radius = radius;
	}
	 public double circleArea() {   
		    return Math.PI*(radius*radius);
	}
	 public String toString(){ // פעולה המחזירה את תכונות האוביקט
	       return "radius: "+this.radius+" circleArea: "+Math.PI*(radius*radius);
	 }
	  
	
	
	
}

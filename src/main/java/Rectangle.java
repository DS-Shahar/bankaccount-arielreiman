
public class Rectangle {
	  private int length;
	  private int width;
	  
	  public Rectangle(int length, int width) {
	      this.length = length;
	      this.width = width;
	 }
	  public void draw() {   
	     for (int y = 0; y < width; y++) {
	        for (int x = 0; x < length; x++) {
	            System.out.print("* "); 
	        }
	        System.out.println(); 
	     }
	 }
	 public int calcArea() {   
		    return width*length;
	}
	 public int calcPerimeter() {   
		    return (width+length)*2;
	}
	 public void scale(int factor){   
		 width=width*factor;
		 length=length*factor;
	 }
	 
	 public String toString(){ // פעולה המחזירה את תכונות האוביקט
	       return "calcPerimeter: "+(width+length)*2+" calcArea: "+width*length;
	 }
	  
	  
}

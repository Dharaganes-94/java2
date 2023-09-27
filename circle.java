package Task10;

public class circle {
	
      double r;
	
 circle()
 
	{
		System.out.println("The Default Constructor");
	}
 
 public circle(double r)
 {
	 double C;
	 C=2*3.14*r;
	 System.out.println("The circumference of the circle is "+C);
	 
 }

	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circle obj = new circle(7);

	}

	
		
	}



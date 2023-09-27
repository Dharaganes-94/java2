package Task10;

public class Employe {
	  // Attributes of the employee
	  private static int id; // The employee id
	  private static String name; // The employee name
	  private static double salary; // The employee salary
	  
	  // Constructor to initialize the attributes
	  public Employe(int id, String name, double salary) {
	    id = id;
	   name = name;
	    salary = salary;
	  }
	  
	  // Getter methods to access the attributes
	  public int getId() {
	    return id;
	  }
	  
	  public String getName() {
	    return name;
	  }
	  
	  public double getSalary() {
	    return salary;
	  }
	  
	  // A method to raise the salary by a given percentage
	  public void raiseSalary(double percent) {
	    // Check if the percentage is valid
	    if (percent > 0) {
	      // Update the salary by adding the percentage of the current salary
	      salary = salary + salary * percent / 100;
	    }
	  }
	  
	  // A method to display the employee details
	  public static void main(String[] args) {
	    System.out.println("Employee id: " + id);
	    System.out.println("Employee name: " + name);
	    System.out.println("Employee salary: " + salary);
	  }
	}
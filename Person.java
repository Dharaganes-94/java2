package Task10;

public class Person {
	
	
	String name;
	int age;
	
	Person()
	
	{
		
	}

	public String getName(String name) {
		return name;
	}
	

	public int getAge(int age) {
		return age;
	

	}
	public static void main (String[] args) {
		
		Person obj = new Person();
		obj.getName("Dharani");
		obj.getAge(29);
		
		System.out.println("The person name is "+obj.getName("Dharani"));
		System.out.println("The person name is "+obj.getAge(29));

	}

}
